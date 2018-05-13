package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      String str = bufferedReader.readLine();
          int in = str.indexOf("?");
           String s = str.substring(in+1,str.length());
          String [] string = s.split("&");//Принемает строку разделитель (например пробел)
        ArrayList <String> strObj= new ArrayList<String>();
        ArrayList <String> stry= new ArrayList<String>();
        for (String k:string){
            int kk=0;
            kk = k.indexOf("=");
            if(kk>0){
                stry.add(k.substring(0,kk)); //  и возвращает массив стрингов
            }else stry.add(k);
            if(k.contains("obj"))strObj.add(k.substring(kk+1,k.length()));
        }
        for (int i = 0; i < stry.size(); i++) {
            if(i!=stry.size()-1)System.out.print( stry.get(i)+" ");
            else System.out.print( stry.get(i));
        }
        System.out.println("");
       if(strObj.size()>0){

            for (String d:strObj){

                try {
                    alert(Double.parseDouble(d));
                }catch (Exception e){
                    alert(d);
                }
            }
       }
    }
    public static boolean checkString(String string) {
        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {

                return false;
            }
        }
        return true;
    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
