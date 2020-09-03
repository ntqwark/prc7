// Main.java:

package com.company;

import java.lang.String;

public class Main
{
    public static void main(String[] args) {
        Dish[] dishes = new Dish[10];

        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                var t = new Plate();
                t.setSize((float) (Math.random() * 100),
                        (float) (Math.random() * 100),
                        (float) (Math.random() * 100));

                t.setModel("Модель 1A");
                t.setRadius((float) (Math.random() * 100));

                dishes[i] = t;
            }
            else
            {
                var t = new Cup();

                t.setSize((float) (Math.random() * 100),
                        (float) (Math.random() * 100),
                        (float) (Math.random() * 100));

                t.setColor("Orange");

                dishes[i] = t;
            }
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(dishes[i] + "\n");
        }
    }
}

/*
 Output:

Тарелочка. Параметры:
Модель - Модель 1A
Радиус - 61
Размеры: (x, y, z) = (75, 84, 89)

Кружечка. Параметры:
Цвет - Orange
Размеры: (x, y, z) = (5, 92, 82)

Тарелочка. Параметры:
Модель - Модель 1A
Радиус - 21
Размеры: (x, y, z) = (83, 77, 76)

Кружечка. Параметры:
Цвет - Orange
Размеры: (x, y, z) = (97, 91, 9)

Тарелочка. Параметры:
Модель - Модель 1A
Радиус - 17
Размеры: (x, y, z) = (67, 41, 62)

Кружечка. Параметры:
Цвет - Orange
Размеры: (x, y, z) = (68, 86, 78)

Тарелочка. Параметры:
Модель - Модель 1A
Радиус - 7
Размеры: (x, y, z) = (97, 14, 39)

Кружечка. Параметры:
Цвет - Orange
Размеры: (x, y, z) = (2, 19, 6)

Тарелочка. Параметры:
Модель - Модель 1A
Радиус - 96
Размеры: (x, y, z) = (52, 85, 76)

Кружечка. Параметры:
Цвет - Orange
Размеры: (x, y, z) = (4, 87, 39)


Process finished with exit code 0
 */