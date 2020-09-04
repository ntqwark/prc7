// Main.java

package com.company;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

class Main
{
    public static void main(String[] args)
    {
        try(FileWriter writer = new FileWriter("output.txt", false))
        {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

            writer.append(obj.readLine());
            writer.flush();

            System.out.println("Writed!");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}