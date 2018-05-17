package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
       Boolean rezult = true;
        Date date1 = new Date(date);
        Date dateone = new Date();

        dateone.setDate(1);      // первое число
        dateone.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        dateone.setYear(date1.getYear());

        long razdat = date1.getTime() - dateone.getTime();
        long milsek = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int day = (int) (razdat/milsek); //количество целых дней

        if (day % 2 == 0) rezult = false;

            return rezult;

    }
}
