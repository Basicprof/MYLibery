package com.javarush.task.task08.task0826;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int max = array[i];
            int maxi = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]>max) {
                    max = array[j];
                    maxi = j;
                }
            }

            if (i != maxi) {
                int tmp = array[i];
                array[i] = array[maxi];
                array[maxi] = tmp;
            }
        }

          }




    }

