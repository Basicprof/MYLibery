package com.javarush.task.task18.task1807;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        InputStream inputStream =  new FileInputStream(bufferedReader.readLine());
        int kol=0;
        int koma = 0x002C;
        while (inputStream.available() > 0) {

              int  count =  inputStream.read();

            if(count == koma)kol++;
        }
        inputStream.close();
        System.out.println(kol);
    }
}
