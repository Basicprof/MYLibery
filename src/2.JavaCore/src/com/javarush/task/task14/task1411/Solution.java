package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList <String> s = new ArrayList<String>();
        s.add("user");s.add("loser");s.add("coder");s.add("proger");
        coman:
         do {
              key = reader.readLine();

              for (String sim: s)
        {
            if(sim.equals(key)){
                if(key.equals("user"))doWork(person = new Person.User());
                if(key.equals("loser"))doWork(person = new Person.Loser());
                if(key.equals("coder"))doWork(person = new Person.Coder());
                if(key.equals("proger"))doWork(person = new Person.Proger());
                break coman;}
        }
        break ;
        }while (true);




        }


    public static void doWork(Person person) {

    }
}
