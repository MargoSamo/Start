package org.margo.start.collections;

import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i < 10; i++) {
            arrayList.add(i);
        }
        /*System.out.println(arrayList); //vivod vsego arrayLista

        System.out.println(arrayList.get(0));  //polychaem znachenie 1elementa
        System.out.println(arrayList.get(99));  //polychaem znachenie 100elementa

        System.out.println(arrayList.size());  //razmer arrayList*/

       /* for(int i=0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i)); //vivod vcex znacheniy arrayList
        }

        for(Integer x : arrayList)
            System.out.println(x);  //analogichno*/

        arrayList.remove(5);  //udalenie elementf iz arrayList
        System.out.println(arrayList);
    }
}
