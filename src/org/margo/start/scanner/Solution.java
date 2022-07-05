package org.margo.start.scanner;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        String str = "10 80 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 5) {
        System.out.println(a + b);
        } else {
        System.out.println(a - b);
        }
    }
}
