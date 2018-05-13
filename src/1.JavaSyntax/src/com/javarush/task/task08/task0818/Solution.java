package com.javarush.task.task08.task0818;
import java.util.ArrayList;
import java.util.HashMap;


 public class Solution {
        public static HashMap<String, Integer> createMap (){
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                hashMap.put("lastName" + i, i*100);
            }
         return (HashMap<String , Integer >) hashMap;}

    public static void removeItemFromMap(HashMap<String, Integer> map) {
       ArrayList<String> hashMapCopy = new ArrayList<>();
        int num = 0;
        for( HashMap.Entry <String, Integer> hmsi : map.entrySet()) {

            if (hmsi.getValue() < 500) hashMapCopy.add(hmsi.getKey());
        }
    for (String s:hashMapCopy)
    {
        map.remove(s);
    }
    }


    public static void main(String[] args) {

    }
}