package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 2 1980"));
        map.put("Stallone2", new Date("JUNE 3 1980"));
        map.put("Stallone3", new Date("JUNE 4 1980"));
        map.put("Stallone4", new Date("JUNE 5 1980"));
        map.put("Stallone5", new Date("JUNE 6 1980"));
        map.put("Stallone6", new Date("JUNE 7 1980"));
        map.put("Stallone7", new Date("JUNE 8 1980"));
        map.put("Stallone8", new Date("August 9 1980"));
        map.put("Stallone9", new Date("July 10 1980"));
  return (HashMap < String , Date> ) map;}
 public static void removeAllSummerPeople(HashMap < String, Date > map) {
     Iterator <HashMap.Entry<String , Date>> iterator = map.entrySet().iterator();
     while (iterator.hasNext()) {
        HashMap.Entry<String, Date> time = iterator.next();
      if(time.getValue().getMonth()>4&&time.getValue().getMonth()<8)
          iterator.remove();
     }
    }
    public static void main(String[] args) {
//System.out.println(createMap());


    }
}
