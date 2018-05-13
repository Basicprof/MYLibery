package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        s = bufferedReader.readLine();
        File myFile = new File(s);
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter(myFile, true));

        PrintWriter writer = new PrintWriter(bufferedWriter);
        do {
            s = bufferedReader.readLine();
            writer.println(s);
        }
        while (!s.equals("exit"));
        bufferedWriter.close();
            writer.close();
    }
}
