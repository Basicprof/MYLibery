package com.javarush.task.task14.task1420;
 import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int num1 = Integer.parseInt(bufferedReader.readLine());
    int num2 = Integer.parseInt(bufferedReader.readLine());


  int NOD=0;


         for (int i = Math.min(num1,num2); i >0 ; i--) {
             if(num1%i == 0 && num2%i == 0){ NOD=i;break;}
         }
  if(num1<=0||num2<=0) {throw  new Exception();}

        System.out.println(  NOD);


    }
}
