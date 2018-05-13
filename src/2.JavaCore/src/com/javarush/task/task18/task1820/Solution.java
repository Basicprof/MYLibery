package com.javarush.task.task18.task1820;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
         String file = bufferedReader.readLine();
         String file2 = bufferedReader.readLine();
         BufferedReader fin = new BufferedReader(new FileReader(file));
         BufferedWriter fin2 = new BufferedWriter(new FileWriter(file2));
         bufferedReader.close();
         String line;
        while ((line = fin.readLine()) != null){
            String [] string = line.split(" ");
            for (int i = 0; i<string.length; i++){
                int num = (int) Math.round(Double.parseDouble(string[i]));
            fin2.write(String.valueOf(num)+ " ");
     }        }
    fin.close();
    fin2.close();
    bufferedReader.close();
    }         }

