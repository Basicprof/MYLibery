package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
   private static BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));
 static void writeMessage(String message){
     System.out.println(message);
 }
  public static String readString(){
     String stroka="";
     try {
          stroka= bufferedReader.readLine();
       } catch (IOException e) {
           System.out.println(
                   "Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");

             readString();
           
     }finally {
         try {
             bufferedReader.close();
         } catch (IOException e1) {
             e1.printStackTrace();
         }
     }
   return stroka;}
public static int readInt(){
int result = -1;
    try {
        result = Integer.parseInt(readString());
    }catch (NumberFormatException e){
        System.out.println("Произошла ошибка\n" +
                "при попытке ввода числа. Попробуйте еще раз.");
        result = Integer.parseInt(readString());
    }

       return result;
}
}
