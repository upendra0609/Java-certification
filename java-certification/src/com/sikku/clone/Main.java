package com.sikku.clone;

import lombok.Setter;

public class Main {
    public static void main(String[] args) {
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        var y = x.clone();
        System.out.println(y.getClass().getName());
    }
}
