package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        String nameFile = bufferedReader.readLine(); //Считываем имя файла из потока
        bufferedReader.close();
        BufferedReader bufferedReaderFile =  new BufferedReader(new FileReader(nameFile));
       StringBuffer  stringBufferFile = new StringBuffer();
        while (bufferedReaderFile.ready()){
              stringBufferFile.append(bufferedReaderFile.readLine()+" ");
        }bufferedReaderFile.close();

        String [] file = stringBufferFile.toString().split("\\W");//обрезаем строки в массив по не символьным значениям
        Pattern p = Pattern.compile("world");
       int caunt = 0;
        for (String s:file){
           // System.out.println(s);
            Matcher m = p.matcher(s);
            if(m.matches()) {
                caunt++;
               // m = p.matcher(s.substring(m.start(),s.length()));
                }

    }        System.out.println(caunt);

    }}
