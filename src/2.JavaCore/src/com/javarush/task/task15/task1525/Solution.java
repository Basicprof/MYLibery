package com.javarush.task.task15.task1525;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
      static {
          InputStream inStream;
          try {
                inStream = new FileInputStream(Statics.FILE_NAME);
              while (inStream.available() > 0)
              {
                  int data = inStream.read(); //читаем один байт из потока для чтения
                 // lines.add(data);

              }
              System.out.print((char) inStream.read());
            inStream.close(); //закрываем потоки



          } catch (IOException e) {
              //File
          }



      }
    public static void main(String[] args) {
        System.out.println(lines);

    }
}
