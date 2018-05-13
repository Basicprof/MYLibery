package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

           String key = "";
           Movie movie = null;
              do {
                  key = bufferedReader.readLine();
                  movie = MovieFactory.getMovie(key);
                  if(chek(key)) {
                  System.out.println(movie.getClass().getSimpleName());
                  }
                  else  break;
                 }
                 while (true);
    }

     /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    private static boolean chek(String key) {
    ArrayList<String> arrayList = new ArrayList<String>();
    boolean kluch = false;
    arrayList.add("soapOpera");
    arrayList.add("cartoon");
    arrayList.add("thriller");
    for (String s:arrayList){
        if(s.contains(key))kluch =true;
    }
    return kluch;}



    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;


            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }if ("thriller".equals(key)) {
                movie = new Thriller();
            }


            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

       static class Cartoon extends Movie {

    }
      static class  Thriller extends Movie {

    }
}
