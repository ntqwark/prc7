// Main.java

package com.company;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

interface IDrawable
{
    Polygon getPolygone();
}

class Quadrangle implements IDrawable
{
    int[] xCoords = new int[4];
    int[] yCoords = new int[4];

    public Quadrangle(Point[] points)
    {
        for (int i = 0; i < 4; i++)
        {
            xCoords[i] = points[i].x;
            yCoords[i] = points[i].y;
        }
    }

    public Quadrangle() { }

    @Override
    public Polygon getPolygone() {
        return new Polygon(xCoords, yCoords, 4);
    }
}

class Rect extends Quadrangle
{
    int[] xCoords = new int[4];
    int[] yCoords = new int[4];

    public Rect(int x1, int y1, int x2, int y2)
    {
        xCoords[0] = x1;
        yCoords[0] = y1;

        xCoords[1] = x1;
        yCoords[1] = y2;

        xCoords[2] = x2;
        yCoords[2] = y2;

        xCoords[3] = x2;
        yCoords[3] = y1;
    }

    @Override
    public Polygon getPolygone() {
        return new Polygon(xCoords, yCoords, 4);
    }
}

public class Main {

    private JFrame mainMap;

    public Main() {

        initComponents();

    }

    private void drawShape(Graphics graphics, Color color, IDrawable drawable)
    {
        var oldColor = graphics.getColor();
        graphics.setColor(color);

        graphics.fillPolygon((drawable.getPolygone()));

        graphics.setColor(oldColor);
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private Color getRandomColor()
    {
        int color = getRandomNumber(1, 5);

        switch (color)
        {
            case 1: return new Color(253, 79, 79);
            case 2: return new Color(79, 253, 113);
            case 3: return new Color(79, 166, 253);
            case 4: return new Color(253, 195, 79);
            case 5: return new Color(253, 79, 219);
        }

        return new Color(0, 255, 0);
    }

    private void drawShapes(Graphics graphics)
    {
        int row = 0, collumn = 0;
        int size = 100;

        for (int i = 1; i < 21; i++)
        {
            Point startPos = new Point(row++ * size + 20, collumn * size +  20);
            var rect = new Rect(startPos.x, startPos.y, startPos.x + size - 20 , startPos.y + size - 20);

            drawShape(graphics, getRandomColor(), rect);

            if (i % 5 == 0)
            {
                collumn++;
                row = 0;
            }
        }
    }

    private void initComponents() {

        mainMap = new JFrame("Ivan T. / Lab5 / 11-19");
        mainMap.setResizable(false);

        mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                drawShapes(g);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(520, 420);
            }
        };

        mainMap.add(p);
        mainMap.pack();
        mainMap.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}

// Result:
// https://i.imgur.com/sQ5CkRA.png