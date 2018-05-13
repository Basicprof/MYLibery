package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String file1 =bufferedReader.readLine();
        String file2 =bufferedReader.readLine();
        String file3 =bufferedReader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);
        while (fileInputStream2.available()>0)
        {fileOutputStream.write(fileInputStream2.read());}
        fileInputStream2.close();
        while  (fileInputStream3.available()>0)
        {fileOutputStream.write(fileInputStream3.read());}
        fileOutputStream.close();
        fileInputStream3.close();
    }
}
