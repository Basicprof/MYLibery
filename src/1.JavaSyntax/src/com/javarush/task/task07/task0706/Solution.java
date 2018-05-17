package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int [] arr = new int [15]; //напишите тут ваш код
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int evenHouse=0;
        int notevenHouse=0;
      for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            if (arr[i]==0|| i%2 == 0) evenHouse += arr[i];
            else  notevenHouse += arr[i];
        }
  if (evenHouse>notevenHouse)System.out.print("В домах с четными номерами проживает больше жителей.");
  else System.out.print("В домах с нечетными номерами проживает больше жителей.");
    }
}
