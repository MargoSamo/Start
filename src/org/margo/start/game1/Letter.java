package org.margo.start.game1;

import java.io.IOException;

public class Letter {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'b';

        System.out.println("Какую букву я загадала ?");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.print("Поздравляю! ");
        } else if (ch > answer) {
            System.out.print("Перестарался! ");
        } else {
            System.out.print("Недостарался! ");
        }
    }
}
