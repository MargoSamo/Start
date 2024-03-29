package org.margo.start.lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        /*for(int i = 0; i < 10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) *2);
        }*/

        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        arr = Arrays.stream(arr).filter(a -> a % 3 == 0).toArray();
        list = list.stream().filter(a -> a % 3 == 0).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        int sum = Arrays.stream(arr).reduce((acc, b) -> acc + b).getAsInt();
        int product = list.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum);
        System.out.println(product);

        int[] newArray = Arrays.stream(arr).filter(a -> a % 4 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArray));

    }

    private static void fillList(List<Integer> list) {
        for(int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for(int i =0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
