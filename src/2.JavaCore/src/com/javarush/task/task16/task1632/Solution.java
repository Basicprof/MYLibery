package com.javarush.task.task16.task1632;

import javax.jws.soap.SOAPBinding;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new ThreadNum1());
        threads.add(new ThreadNum2());
        threads.add(new ThreadNum3());
        threads.add(new ThreadNum4() );
        threads.add(new ThreadNum5());

    }
    public static void main(String[] args) {
        for (Thread a:threads){
            a.start();
        }


    }
    public static class ThreadNum1 extends Thread{
        public ThreadNum1(){

        }
        @Override
        public void run(){
            while (true){}
        }
    }
    public static class ThreadNum2 extends Thread{
        public ThreadNum2(){

        }
        @Override
        public void run(){
            try {
                sleep(100000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");

            }

        }}
    public static class ThreadNum3 extends Thread{
        public ThreadNum3(){

        }
        @Override
        public void run()  {
            while (true){
                try {

                    System.out.println("Ура" );Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public static class ThreadNum4 extends Thread implements Message{
        public static boolean stop=false;
        public void run(){while (!stop){}}

        @Override
        public void showWarning() {

            this.stop = true;


        }
    }
    public static class ThreadNum5 extends Thread{
        int a=0; String s="";
        @Override
        public void run(){
            try (  BufferedReader bufferedReader =
                           new BufferedReader(new InputStreamReader(System.in));){

                while (!(s=bufferedReader.readLine()).equals("N")){
                    a+=Integer.parseInt(s);
                }

                  System.out.println(a);  }
            catch (IllegalArgumentException | IOException ex) {

            }
        }
    }


}