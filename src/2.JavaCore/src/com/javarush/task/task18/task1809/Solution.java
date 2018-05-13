package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

      try (
              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
              FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
              FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());
         )
         {  byte[] byf;
             while (fileInputStream.available()>0) {
          byf = new byte[fileInputStream.available()];
              fileInputStream.read(byf);

             for (int i = byf.length-1; i >=0 ; i--) {
                 {
                     fileOutputStream.write(byf[i]);

                 }

             }}
      }
    }
}
