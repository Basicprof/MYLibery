package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while (!(name = bufferedReader.readLine()).equals("exit")) {
            ReadThread r = new ReadThread(name);
            r.start();
        }
        bufferedReader.close();
    }

    public static class ReadThread extends Thread {
        FileInputStream fileInputStream;
          String nameFile;

        public ReadThread(String fileName) throws FileNotFoundException {
            super(fileName);
            fileInputStream = new FileInputStream(fileName);
            nameFile = fileName;

        }

        @Override
        public void run() {

            int y = 0;
            byte by = 0;
            try {
                byte[] b = new byte[fileInputStream.available()];
                fileInputStream.read(b);

                for (int i = 0; i < b.length; i++) {
                    int a = 0;
                    for (int j = i + 1; j < b.length; j++) {
                        if (b[j] == b[i]) a++;
                    }
                    if (a > y) {
                        y = a;
                        by = b[i];
                    }
                }
                resultMap.put(nameFile, (int) by);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

