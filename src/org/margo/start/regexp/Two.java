package org.margo.start.regexp;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String modifiedString = b.replace(" ", ".");
        System.out.println(modifiedString);

        String c = "Hello123there12345hey";
        String modifiedStringC = c.replaceAll("\\d+", "-");
        String modifiedStringC2 = c.replaceFirst("\\d+", "-");
        System.out.println(modifiedStringC);
        System.out.println(modifiedStringC2);

    }
}
