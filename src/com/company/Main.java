package com.company;

import java.io.*;
import java.lang.String;

public class Main
{
    public static void main(String[] args) {
        Circle[] t = new Circle[10];

        for (int i = 0; i < 10; i++) {
            t[i] = new Circle();

            t[i].setRadius(i + 1);
            t[i].setColor("Color number " + i);
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(t[i].toString());
        }
    }
}
