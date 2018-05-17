package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList();
  try (  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     // Открываем байтовый поток в этом блоке закроется автоматически
         InputStream inStream = new FileInputStream(bufferedReader.readLine());
   ){

      BufferedReader inStrem = new BufferedReader(new InputStreamReader(inStream,"UTF-8"));

      Integer i=0;
      String s;
      do {
          s=inStrem.readLine();
          if (s!=null)i =   Integer.parseInt(s);



         if(i%2==0)arrayList.add(i);



          }while (s!= null);
   } catch (FileNotFoundException e){
      e.printStackTrace();
  }catch (IOException e){
      e.printStackTrace();
  }


        Integer [] array =  new Integer[]{7};
      

        
        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < array.length; j++) {

                     if (array[i] > array[j]) {
                       Integer str = array[i];
                        array[i] = array[j];
                        array[j] = str;
                    }
                 } }
             for (int i = 0; i < array.length; i++)
             {System.out.println(array[i]+" "+i+"  "+ array.length);}

    }
    }


