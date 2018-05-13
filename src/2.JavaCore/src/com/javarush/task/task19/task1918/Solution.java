package com.javarush.task.task19.task1918;


import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufRed = new BufferedReader(new InputStreamReader(System.in));
        String name = bufRed.readLine();
        String name2 = bufRed.readLine();
              BufferedReader bufFile = new BufferedReader(new FileReader(name));
              BufferedReader bufFile2 = new BufferedReader(new FileReader(name2));
        StringBuffer stringBufFi = new StringBuffer();
        StringBuffer stringBufFil = new StringBuffer();
              while (bufFile.ready()){
                  stringBufFi.append(bufFile.readLine()+" ");
        }
        while (bufFile2.ready()){
            stringBufFil.append(bufFile2.readLine()+" ");
        }bufFile2.close();
        bufFile.close();
        System.out.println(stringBufFi.toString());
        System.out.println(stringBufFil.toString());
        String start = " ";
        String []stroka = stringBufFi.toString().split(start);
        String []stroka2 = stringBufFil.toString().split(start);
             LineItem lineItem = new LineItem();
             lineItem.stroka(stroka,stroka2);
    }
   static class   LineItem {

       private List stroka(String [] s, String [] s2){
              List<String> lines = new ArrayList<>();
           for (int i = 0; i <s.length ; i++) {
                boolean flag = false; int sdvig =0 ;
               for (int j = i-sdvig; j <i-sdvig+2 ; j++) {
                   if(s[i].equals(s2[j]))
                   {   if(j==i+1) lines.add(s2[i]+" "+String.valueOf(Type.ADDED));
                       lines.add(s[i]+" "+String.valueOf(Type.SAME));
                       flag =true;
                        }
                   if(!flag){
                       lines.add(s[i]+" "+String.valueOf(Type.REMOVED));
                       sdvig ++;
                   }

               }

           }
           for (String ss:lines) {


           System.out.println(s);}
       return lines;}

   }


   enum Type{
      SAME,
       REMOVED,
       ADDED
   }
}
