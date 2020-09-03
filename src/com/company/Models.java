package com.company;

class Circle
{
    private int radius;
    private String color;

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setColor(String color)
    {
        this.color = color ;
    }

    public String getColor()
    {
        return color;
    }

    public String toString()
    {
        return String.format("Circle Info: radius=%d, color=%s", getRadius(), getColor());
    }
}
