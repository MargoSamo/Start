package org.margo.start.regexp;

public class One {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        \\w - одна буква

        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до

        ( х|y|z ) - одна строка из множества строк

        [abc] = (a|b|c)

        [a-zA-Z] -  все английские буквы
        [0-9] - \\d  - все цифры
        [^abc] - все символы кроме [abc]

        . - любой символ

        {2} - 2 символа до (\\d{2})
        {2, } - 2 и более символов (\\d{2, })
        {2, 4} - от 2 до 4 символов (\\d{2, 4})

        */

        String a = "123";
        String b = "-123";
        String c = "+123";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "3gF123";
        System.out.println(d.matches("[a-zA-Z3]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";

        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{2,}"));

    }
}
