package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> arrayList = new ArrayList<>();
         while (bufferedReader.ready()){
              arrayList.add(bufferedReader.readLine());
       }
       bufferedReader.close();
        Map< String, Double > map = new TreeMap<>();

        for (String s :arrayList){boolean znach = false;
            String [] string = s.split(" ");
            string [ 0 ] = string[0].trim();
            Double strValue  = Double.parseDouble(string[1].trim());
            for (Map.Entry<String, Double> pair : map.entrySet())
            {
                String key = pair.getKey();                      //ключ
                Double value = pair.getValue();                  //значение
               if(string[0].equals(key)) {
            znach = true;       map.put(key, strValue + value);
                   break;
               }
            }
            if(!znach)map.put(string[0],strValue);
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            Double value = pair.getValue();
            System.out.println(key+" "+value);
        }

        }
}
