package org.margo.start.scanner;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}
