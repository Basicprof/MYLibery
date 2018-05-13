package com.javarush.task.task09.task0927;


import java.util.*;
import java.lang.String;
/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap <String, Cat> map = new HashMap<String, Cat> ();
         String []s = {"Cat1","Cat2","Cat3","Cat4","Cat5","Cat6","Cat7","Cat8","Cat9","Cat10"};
        for (int i = 0; i <10 ; i++) {
            map.put(s[i],new Cat("Вася"+i));
        }
       return (Map <String, Cat>) map;}

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set set = new HashSet();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
         while (iterator.hasNext())
        {
            Map.Entry<String, Cat> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Cat value = pair.getValue();        //значение


                   set.add(value);

        }
    return set;}


    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
