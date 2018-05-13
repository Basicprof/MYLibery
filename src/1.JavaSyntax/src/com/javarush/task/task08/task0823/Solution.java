package com.javarush.task.task08.task0823;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5, 15));
    }
        }


