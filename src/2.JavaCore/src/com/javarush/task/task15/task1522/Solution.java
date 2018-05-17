package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {

    public static Planet thePlanet;
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args)  {



    }


    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s= bufferedReader.readLine();
        Planet thePlanet=null;

        if(s.equals(Planet.SUN)){
              thePlanet =   Sun.getInstance();}
            if(s.equals(Planet.MOON)){
                   thePlanet = Moon.getInstance();}
                  if(s.equals(Planet.EARTH)){
                     thePlanet =  Earth.getInstance();}

                  if(!s.equals("sun")&&!s.equals("earth")&&!s.equals("moon"))
                             thePlanet =null;

                }
    }

