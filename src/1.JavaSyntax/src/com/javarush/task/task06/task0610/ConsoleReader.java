package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String buffString = bufferedReader.readLine();
        return buffString;
    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int  buffInt = Integer.parseInt(bufferedReader.readLine());
        return buffInt;
        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        Double buffDouble = Double.parseDouble(bufferedReader.readLine());
        return buffDouble;
        //напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        Boolean buffBoolean = Boolean.parseBoolean(bufferedReader.readLine());
        return buffBoolean;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
