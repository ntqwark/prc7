// Main.java

package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Main
{
	static void pushBack(Stack<Integer> t, int value)
	{
		Stack<Integer> t0 = new Stack<Integer>();
		t0.push(value);

		while (!t.isEmpty())
		{
			t0.push(t.pop());
		}

		t = t0;
	}

    static void game(Stack<Integer> first, Stack<Integer> second)
    {
        int step = 0;

        while (!first.isEmpty() && !second.isEmpty() && step < 106)
        {
            step++;

            var t1 = first.pop();
            var t2 = second.pop();

            if (t1 > t2)
            {
                pushBack(second, t1);
                pushBack(second, t2);
            }
            else if (t1 < t2)
            {
                pushBack(first, t1);
                pushBack(first, t2);
            }
            else
            {
                pushBack(first, t1);
                pushBack(second, t2);
            }
        }

        if (first.isEmpty()) System.out.println("first " + step);
        else if (second.isEmpty()) System.out.println("second " + step);
        else System.out.println("botva");
    }

    public static void main(String[] args) throws Exception
    {
        var first  = new Stack<Integer>();
        var second = new Stack<Integer>();

        var reader = new BufferedReader(new InputStreamReader(System.in));

        // Ввод данных для 1ого игрока

        var input = reader.readLine();
        var splited = input.split(" ");

        for (var t : splited)
        {
            first.push(Integer.parseInt(t));
        }

        // Ввод данных для 2ого игрока

        input = reader.readLine();
        splited = input.split(" ");

        for (var t : splited)
        {
            second.push(Integer.parseInt(t));
        }

        // Собственно сама реализация игры

        game(first, second);
        main(args);
    }
}

// q
