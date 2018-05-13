package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {

               reset();

    }

    public static Flyable result;

    public static void reset()  {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     try{    String col = bufferedReader.readLine();
         if(col.equals("helicopter")) result = new Helicopter();
        if(col.equals("plane"))
        {
            int nums = Integer.parseInt(bufferedReader.readLine());
             result = new Plane(nums);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
         try {
             bufferedReader.close();
         }catch (IOException e){
             e.printStackTrace();
         }
    }}
}
