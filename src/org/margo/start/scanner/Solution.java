package org.margo.start.scanner;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        /*Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        String str = "10 80 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 70) {
        System.out.println(a + b);
        } else {
            System.out.println(a - b);
        }

        String militaryCommissar = ", явитесь в военкомат";
        if (age >=18 && age <=28)
            System.out.println(name + militaryCommissar);

        if (age < 18) {
            if (age >= 6)
                System.out.println("нужно ходить в школу");
        }   else
                System.out.println("пора в институт");

        String cold = "на улице холодно";
        String warm = "на улице тепло";
        int t = console.nextInt();
        if (t < 0)
            System.out.println(cold);
        if (t >= 0)
            System.out.println(warm);*/

        /*Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if ( current > max) {
                if (current %2 ==0 )
                max = current;
            }
        }
        System.out.println(max);
*/
        /*Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2 && i != min1) {
                min2 = i;
            }
        }
        System.out.println(min2);*/

   for (int i = 0; i < 10; i++)
    {
        int starCount = 1 + i;
        for (int j = 0; j < starCount; j++)
            System.out.print("8");
        System.out.println();
    }

}
}


