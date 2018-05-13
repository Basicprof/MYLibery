package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
BufferedReader file1 = buffirReaderFileInpStrReder(args[0]);
BufferedWriter file2 = buffirWrateFile(args[1]);
        StringBuffer stringBuffer = new StringBuffer();
        while (file1.ready()) {
            String test =file1.readLine()+" ";
            stringBuffer.append(test);

        }file1.close();
        String [] stroky = stringBuffer.toString().split(" ");
        ArrayList <String> arrayList = new ArrayList();
        for (int i = 0; i < stroky.length; i++) {
          if(stroky[i].length()>6) {arrayList.add(stroky[i]);}}
        for (int i = 0; i <arrayList.size() ; i++) {

                  file2.write(arrayList.get(i));
                  if(arrayList.size()-1!=i)file2.write(",");


        }file2.close();
    }
    //Открыть поток к файлу
    public static BufferedReader buffirReaderFileInpStrReder(String s) throws IOException {
         BufferedReader bufferedReaderFile =
                new BufferedReader(new FileReader(s));


        return bufferedReaderFile;
    }

    public static BufferedWriter buffirWrateFile (String s) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(s));


        return bufferedWriter;
    }
}
