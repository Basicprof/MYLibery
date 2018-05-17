package com.javarush.task.task08.task0817;


import java.util.HashMap;
import java.util.Map;
public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("lastName" + i, "name");
        }

   return (HashMap<String , String >) hashMap;}

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap < String, String > copy = new HashMap < String, String >( map );
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            int shet = 0;
            String s = pair.getValue();
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {

                if (s.equals(pair2.getValue())) shet++;
            }
            if (shet > 1) removeItemFromMapByValue(map, s);
        }
    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


    }
}
