package com.javarush.task.task08.task0828;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.String;


        public class Solution {
            public static void main(String[] args) throws IOException {
                HashMap< String, Integer> map = new HashMap<>();
                map.put("January", 1);
                map.put("February",2);
                map.put("March", 3);
                map.put("April", 4);
                map.put("May", 5);
                map.put("June", 6);
                map.put("July", 7);
                map.put("August", 8);
                map.put("September", 9);
                map.put("October", 10);
                map.put("November",11);
                map.put("December", 12);

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String nameMonth = bufferedReader.readLine();

                //можно было бы здесь прописать System.out.println(s + " is "+map.get(nameMonth)+" month")
                Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
                while (iterator.hasNext())
                {
                    Map.Entry<String,Integer> maps = iterator.next();
                    String s = maps.getKey();
                    Integer i = maps.getValue();
                    if(s.equals(nameMonth)){
                        System.out.println(s + " is "+i+" month");break;}
                }
            }
        }


