package com.javarush.task.task08.task0813;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        String[] mn = {"Люба", "Люся", "Лямда", "Лампа", "Лябода",
                "Ляпота", "Лямота", "Лятута", "Лясена", "Ловис",
                "Ламдис", "Лимтус", "Ликус", "Ляка", "Лика",
                "Лина", "Лима", "Лиcса", "Лимма", "Лиса"};
        Collections.addAll(set, mn);
        return set;
    }


    public static void main(String[] args) {

    }
}
