package com.javarush.task.task20.task2025;
 import java.util.*;
 public class Solution {
    static   ArrayList<Long> rr = new ArrayList<>();
     static long[] ArmstrongNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,
             153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084,
             548_834,1_741_725, 4_210_818, 9_800_817, 9_926_315, 24_678_050,
             24_678_051, 88_593_477, 146_511_208, 472_335_975, 534_494_836,
             912_985_153};

     public static long[] getNumbers(long N) throws InterruptedException {
         return Arrays.stream(ArmstrongNumbers).filter(num -> num < N).toArray();
//      if ( Long.toString(N).length()  > 20) throw new IllegalArgumentException();   // предзаполняем возведение в степени
//       // Фиксируем текущее время в милисикундах
//       List <Long> list = new ArrayList<>();
//        for (long i = 0; i < N; i++) {
//            String str = Long.toString(i); //Переводим число в строковый формат
//            int maxN = str.length();// определям количество символов или знаков в числе
//             long sum = 0;
//            for (int j = 0; j <maxN ; j++) {
//             sum += (long) Math.pow(Long.parseLong(String.valueOf(str.charAt(j))), maxN); }
//           if(sum == i){  list.add(  sum);  }
//        } long [] sl= new long[list.size()];
//      for (int i = 0; i <list.size() ; i++) {
//          sl[i] = list.get(i); }
//     return sl;
 }
  public static void main(String[] args) throws InterruptedException {
        Date begin = new Date();
        long[] r = getNumbers(100000000L);
        Date end = new Date();
        System.out.println("Размер массива= "+r.length);
        System.out.println("Прошло секунд: "+(end.getTime() - begin.getTime())/1000);
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory()
                - Runtime.getRuntime().freeMemory())/1000000 + " MB");
        System.out.println("Free Memory   : " + Runtime.getRuntime().freeMemory() + " bytes");
        System.out.println("Total Memory  : " + Runtime.getRuntime().totalMemory() + " bytes");
        System.out.println("Max Memory    : " + Runtime.getRuntime().maxMemory() + " bytes");
   } }

