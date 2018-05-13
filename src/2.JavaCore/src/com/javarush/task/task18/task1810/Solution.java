package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";

            while (true) {

                    name = bufferedReader.readLine();
                    FileInputStream fis = new FileInputStream(name);
                    if(fis.available()<1000) {
                        bufferedReader.close();
                        fis.close();
                        throw new DownloadException();
                    }


            }

    }

    public static class DownloadException extends Exception {

    }
}
