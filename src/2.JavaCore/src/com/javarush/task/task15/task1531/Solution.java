package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal big =   BigDecimal.ONE;
        if(n<0)return "0";
        for (int i = 2; i <= n ; i++) {
            big =  big.multiply(new BigDecimal(String.valueOf(i)));
           }

        return String.valueOf(big);
    }
}
