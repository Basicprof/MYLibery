package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5 ; i++)
            result+=s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuffer resul = new StringBuffer();
         for (int i = 0; i < count ; i++)
           resul.append(s);
         result = resul.toString();
         return result;
    }

    public static void main(String[] args) {

    }
}
