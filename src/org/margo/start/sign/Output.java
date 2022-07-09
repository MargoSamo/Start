package org.margo.start.sign;

public class Output {
    public static void main(String[] args) {
       /* int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }*/

       /* String name = new String("Hay");
        String b = name;
        System.out.println(new Long(9000000) == new Long(9000000));
        System.out.println(new Long(9000000).equals(new Long(9000000)));
*/
        int  a = 0;
        while (a < 10) {
            int m = 0;
            if (a == 0 || a == 9) {
                while (m < 20) {
                    System.out.print("Б");
                    m++;
                }
            } else {
                while (m < 20) {
                    if (m == 0 || m == 19)
                        System.out.print("Б");
                        else
                            System.out.print(" ");
                        m++;
                        }
                    }
        System.out.println(" ");
        a++;
       }
    }
}