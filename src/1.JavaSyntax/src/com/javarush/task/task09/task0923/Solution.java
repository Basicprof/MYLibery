package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;





/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
           StringBuffer     arr = new StringBuffer();
          StringBuffer     arr2 =new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   String str  = bufferedReader.readLine();

        for (int i = 0; i < str.length(); i++) {
              if ( isVowel(str.charAt(i))) arr.append(str.charAt(i)).append(" ");
              else if(!(str.charAt(i) ==' '))arr2.append(str.charAt(i)).append(" ");
        }
     System.out.println( arr);
     System.out.println( arr2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}