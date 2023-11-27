package com.sikku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);

        System.out.println(list);

        list = (ArrayList<Integer>) list.stream().map(i -> i *= 2).collect(Collectors.toList());

        List<Integer> l = list.stream().filter(i -> i % 3 == 0).toList();

        System.out.println(l);

        System.out.println(getIndex("abcabcd"));
    }

    public static int getIndex(String str) {
        int n = str.length();
        int[] tempArray = new int[26];

        for (int i = 0; i < n; i++) {
            char temp = str.charAt(i);
            tempArray[temp - 'a'] += 1;
        }

        for (int i = 0; i < n; i++) {
            int ch = str.charAt(i) - 'a';
            if (tempArray[ch] == 1) {
                return i;
            }
        }
        return -1;
    }
}
