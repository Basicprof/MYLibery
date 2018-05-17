package com.javarush.task.task18.task1825;
 import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String name;  Map<String, byte[]> map = new TreeMap<>();
        String nameOne="";
    while (!(name = bufferedReader.readLine()).equals("end")){
          if(testRegul(name)) {
              BufferedInputStream f = new BufferedInputStream(new FileInputStream(name));
                 byte [] b = new byte[f.available()];
                 int count = f.read(b);
           map.put(name.substring(name.lastIndexOf(".")+1,
                            name.length()),b);
           nameOne = name.substring(0,name.lastIndexOf("."));
f.close();
          } }
          bufferedReader.close();
        BufferedOutputStream bufferedWriter =
                new BufferedOutputStream(new FileOutputStream(nameOne, true));

        for(Map.Entry<String, byte[]> entry : map.entrySet()) {
               bufferedWriter.write(entry.getValue());
           }
        bufferedWriter.close(); }
     public static boolean testRegul(String testString){
            Pattern p = Pattern.compile("\\.part[0-9]+$");
             Matcher m = p.matcher(testString);
              return m.find();
         }
 }

