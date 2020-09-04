// Main.java

package com.company;

import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            list.add(i);
        }

        for (var t : list)
        {
            System.out.println(t);
        }
    }
}