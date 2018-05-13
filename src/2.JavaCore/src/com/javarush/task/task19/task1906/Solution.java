package com.javarush.task.task19.task1906;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();
        FileReader fileRider = new FileReader(name1);
        FileWriter fileWriter = new FileWriter(name2);
       int i = 1;
        // читаем посимвольно
         int k=0;
        while((k=fileRider.read())!=-1){

            if (i % 2 == 0) {
                fileWriter.write(k);
            }
            i++; }
            fileWriter.close();
            fileRider.close();

    }
}
