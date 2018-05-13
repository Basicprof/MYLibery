package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/
public class Solution {
    public static List<LineItem> lines = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufRed = new BufferedReader(new InputStreamReader(System.in));
        String name = bufRed.readLine();
        String name2 = bufRed.readLine();
        bufRed.close();
        BufferedReader bufFile = new BufferedReader(new FileReader(name));
        BufferedReader bufFile2 = new BufferedReader(new FileReader(name2));
        StringBuffer stringBufFi = new StringBuffer();
        StringBuffer stringBufFil = new StringBuffer();
        while (bufFile.ready()) {
            stringBufFi.append(bufFile.readLine() + " ");
        }
        while (bufFile2.ready()) {
            stringBufFil.append(bufFile2.readLine() + " ");
        }
        bufFile2.close();
        bufFile.close();
         String start = " ";
        String[] stroka = stringBufFi.toString().split(start);
        String[] stroka2 = stringBufFil.toString().split(start);
       int schetcikDou=0;
        for (int i = 0; i < stroka.length; i++) {
            boolean fl =false;

                for (int j = schetcikDou; j < schetcikDou + 2; j++) {

                    if (j<stroka2.length&&stroka[i].equals(stroka2[j])) {
                         if (j == schetcikDou + 1) {
                         lines.add(new LineItem(stroka2[j - 1], Type.ADDED));
                            lines.add(new LineItem(stroka[i], Type.SAME));
                            schetcikDou++;
                            schetcikDou++;
                            fl = true;
                        } else {
                            lines.add(new LineItem(stroka[i] , Type.SAME));
                            schetcikDou++;
                            j++;
                            fl = true;
                        }  }  }
                if (!fl) {
                    lines.add(new LineItem(stroka[i], Type.REMOVED));
                }  }
        int a= stroka.length;
        if(a<stroka2.length) {
            lines.add(new LineItem(stroka[a],Type.REMOVED));a++;
          }
      for (LineItem l:lines)
       System.out.println(l.type+" "+l.line);
        }
  public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }
  public static class LineItem {
        public Type type;
        public String line;
  public LineItem(String line, Type type) {
            this.type = type;
            this.line = line;
        }  } }
