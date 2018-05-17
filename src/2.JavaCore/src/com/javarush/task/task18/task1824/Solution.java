package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        List <FileInputStream> f = new ArrayList<>();
        try {
            while (true){
                name = bufferedReader.readLine();
                f.add(0,new FileInputStream(name));

             }
        } catch (FileNotFoundException e) {
            System.out.println(name);
        }finally {
            for (FileInputStream fa:f){
                fa.close();
            }
        }
    }
}
