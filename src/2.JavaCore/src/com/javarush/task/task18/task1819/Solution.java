package com.javarush.task.task18.task1819;
import java.io.*;
 public class Solution {
    public static void main(String[] args) throws IOException {
   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                     String file = bufferedReader.readLine();
                     String file2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte []b1 = new byte[fileInputStream.available()];
        fileInputStream.read(b1);
       fileInputStream.close();
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //fileOutputStream.write(("").getBytes());
       while  (fileInputStream2.available()>0)
        {fileOutputStream.write(fileInputStream2.read());}

        fileInputStream2.close();
    fileOutputStream.write(b1);
         fileOutputStream.close();
    }
 }
