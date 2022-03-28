package com.syntax;

import java.util.Arrays;
import java.util.List;

public class Practice {


    public static int function(int... a) {
        int sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }

    public static void main(String args[]) {
        int ans = function(1, 1, 2, 6);
        System.out.println("Result is " + ans);
    }
}











