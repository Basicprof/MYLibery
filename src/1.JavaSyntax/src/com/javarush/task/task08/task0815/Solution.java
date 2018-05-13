package com.javarush.task.task08.task0815;


import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String ,String> map = new  HashMap <String , String>();
        map.put("Фамилия", "Имя");
        map.put("Фамилия1", "Имя1");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя4");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия6", "Имя6");
        map.put("Фамилия7", "Имя7");
        map.put("Фамилия8", "Имя8");
        map.put("Фамилия9", "Имя9");
    return (HashMap<String, String>) map;}
         public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
             int sum = 0;
             for (HashMap.Entry<String, String> pa : map.entrySet()) {
                 if (name.equals(pa.getValue())) sum++;
             }

        return sum;
         }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
            int sum = 0;
            for (HashMap.Entry<String, String> pa : map.entrySet()) {
                if (lastName.equals(pa.getKey())) sum++;  }
           return sum; }
    public static void main(String[] args) {

    }
}
