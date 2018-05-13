package com.javarush.task.task19.task1910;
import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(name1));
        BufferedWriter bufferedWriterFile = new BufferedWriter(new FileWriter(name2));
        int s = 0;  String a="";
        while (bufferedReaderFile.ready()){

            a+=(char)bufferedReaderFile.read();
              }
a=a.replaceAll("\\p{Punct}","");
//a=a.replaceAll("\\?","");
//a=a.replaceAll("!","");
a=a.replaceAll("\\n|\\r\\n","");
bufferedReaderFile.close();

        //        {
//            s = s.replace('.',' ');
//            s = s.replace(',',' ');
//            s = s.replace('!',' ');
//            s = s.replace('?',' ');
 bufferedWriterFile.write(a);// Заменяем символ в строке
         bufferedWriterFile.close();
}}
