package com.javarush.task.task19.task1920;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        ArrayList<String> arrayList = new ArrayList<>();
        while (bufferedReader.ready()){
            arrayList.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        Map< String, Double > map = new TreeMap<>();
        Double sumDoubl = Double.MIN_VALUE;
        for (String s :arrayList){
            boolean znach = false;
            String [] string = s.split(" ");
            string [ 0 ] = string[0].trim();
            Double strValue  = Double.parseDouble(string[1].trim());
            for (Map.Entry<String, Double> pair : map.entrySet())
            {
                String key = pair.getKey();                      //ключ
                Double value = pair.getValue();                  //значение
                if(string[0].equals(key))
                  {
                    znach = true;
                            if(Double.compare(sumDoubl, strValue+value)>0 )
                        sumDoubl=strValue+value;
                       map.put(key, strValue + value);
                    break;
                  } }
            if(!znach) {

                if(Double.compare(sumDoubl, strValue)>0)sumDoubl=strValue;
                map.put(string[0],strValue);
             }};
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            Double value = pair.getValue();
           if(Double.compare(sumDoubl, value)==0){ System.out.println(key); }

        }}}

