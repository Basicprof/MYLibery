package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());// Преобразует буквы в нижний регистр
        }



        Map<String , Integer> map = new TreeMap<String, Integer>();
        int y=0;
        for (int i = 0; i < alphabet.size(); i++) {
                y=0;
                  for (int j = 0; j <list.size(); j++) {

                      for (int k = 0; k < list.get(j).length() ; k++) {
                       if( alphabet.get(i)== list.get(j).charAt(k))y++;
                          }

                     }

           map.put(String.valueOf(abcArray[i]), y);  }



        for (Map.Entry<String , Integer> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();
            //значение
            System.out.println(key + " " + value);
        }

    }

}
