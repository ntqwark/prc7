// Main.java:

package com.company;

import java.lang.String;

public class Main
{
    public static void main(String[] args) {
        Object[] objects = new Object[10];

        for (int i = 0; i < 10; i++)
        {
            if (i % 3 == 0) {
                objects[i] = new Object();
            } else {
                var t  = new Product();
                t.setPrice(1000 * (i + 1));

                objects[i] = t;
            }
        }

        for (int i = 0; i < 10; i++)
        {
            if (objects[i] instanceof IPriceable) {
                System.out.println("cost = " + ((IPriceable)objects[i]).getPrice());
            } else {
                System.out.println("Объект не реализует интерфейс IPriceable");
            }
        }
    }
}

/*
Output:

Объект не реализует интерфейс IPriceable
cost = 2000
cost = 3000
Объект не реализует интерфейс IPriceable
cost = 5000
cost = 6000
Объект не реализует интерфейс IPriceable
cost = 8000
cost = 9000
Объект не реализует интерфейс IPriceable

Process finished with exit code 0
 */