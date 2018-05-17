package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.String;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //Iterator iterator = list.iterator();
       // while (iterator.hasNext()){
        // String    ite = iterator.hasNext();
       // }
        for (int i = 0; i < list.size() ; i++) {

            if(list.get(i).contains("р")&&list.get(i).contains("л"))continue;
            else {

          if(list.get(i).contains("л")){list.add( i,list.get(i)); i=i+1;}
         if(list.get(i).contains("р")) {list.remove(i);i--;}
            }
        }
        return (ArrayList<String>)list;
    }
}