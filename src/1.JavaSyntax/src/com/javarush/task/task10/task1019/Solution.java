package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
      while(true) {
            String  sl =reader.readLine();
          if(sl.isEmpty())break;
            int  id = Integer.parseInt(sl);
            String   name = reader.readLine();
          if(name.isEmpty())break;
          hashMap.put(name,id);
    }
                for (Map.Entry<String, Integer> pair : hashMap.entrySet()) {
                    System.out.println(pair.getValue() + " " + pair.getKey());
                }
            }






        }


