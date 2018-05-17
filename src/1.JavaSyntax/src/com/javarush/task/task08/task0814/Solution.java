package com.javarush.task.task08.task0814;

import java.util.Collections;
import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet <Integer> set = new HashSet<>();
        Integer [] mn = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Collections.addAll(set, mn);
        return set; }


    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> setDell = new HashSet<>();
       for (Integer i : set) {
            if (i > 10) setDell.add(i);
        }
        set.removeAll(setDell);
    return set;}


    public static void main(String[] args) {

}}
