package com.javarush.task.task08.task0819;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
           Set<Cat> cats = createCats();
           Iterator <Cat> c = cats.iterator();
           c.next();
           c.remove();

        printCats(cats);
    }


    public static Set<Cat> createCats() {
       Set  set = new HashSet ();
        for (int i = 0; i < 3 ; i++) {
            set.add(new Cat());

      }


        return (HashSet) set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat s: cats){
            System.out.println(s);
        }
    }

public static class Cat {
       public Cat(){}
    }
}
