package com.javarush.task.task09.task0921;

import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {    int num = Integer.parseInt(bufferedReader.readLine());
                      arr.add(num);
             }
        }catch (NumberFormatException e){
           for (Integer a: arr)System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
