package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        while (bufferedReader.ready()){
            String strok = bufferedReader.readLine();
           if(!readStrok(strok).isEmpty())
           {
            bufferedWriter.write(readStrok(strok));
        }
        }bufferedReader.close();
        bufferedWriter.close();

    }
   public  static String readStrok(String str){
         String res="";
        String[] s = str.split(" ");
       for (int i = 0; i <s.length ; i++) {

           if(s[i].matches("(.*\\d+.*)+")){res = s[i]+" ";
          }
       }

   return  res;}
}
