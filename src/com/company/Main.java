
package com.company;

import java.io.*;
import java.lang.String;

public class Main
{
    static double factorial(int t)
    {
        float result = 1;

        for (int i = 1; i < t; i++)
        {
            result = result + result * i;
        }

        return result;
    }

    public static void main(String[] args)
    {
        String input = "";

        try {
            System.out.print("Введите число: ");
            java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine();
        } catch (Exception ignored) { }

        System.out.print("Факториал: ");
        System.out.println(factorial(Integer.parseInt(input)) + "\n");
        main(args);
    }
}
