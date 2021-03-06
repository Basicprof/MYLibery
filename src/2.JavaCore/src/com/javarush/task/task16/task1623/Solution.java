package com.javarush.task.task16.task1623;
 public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        @Override
        public String toString() {
            return  getName()+" created";
        }

        public GenerateThread(){

            super(String.valueOf(++countCreatedThreads));

            start();

        }
 @Override
        public void run() {

     if (count>countCreatedThreads){
        System.out.println(new GenerateThread());
       }
        }
    }
}
