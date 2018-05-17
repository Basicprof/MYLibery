package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name;
        private int age;
        private int sex;
        private String wife;
        private String  husband;
        private ArrayList children = new ArrayList();
        public Human (String name){
            this.name = name;
        }
        public Human (String name, int age){
            this.name = name;
            this.age = age;
        }public Human (String name, int age, int sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }public Human (String name, int age, int sex, String wife){
            this.name = name;
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wife = wife;
        }public Human (String name, int age, int sex, String wife,String husband) {
            this.name = name;
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wife = wife;
        }public Human (String name, int age, int sex, String wife,String husband, ArrayList children) {
            this.name = name;
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wife = wife;
            this.children = children;
        }public Human (){
            this.name = "Null";
        }public Human (String name, ArrayList children){
            this.name = name;
            this.children = children;
        }public Human (String name,String sex){
            this.name = name;
        }public Human (int age, String name){
            this.name = name;
            this.age = age;
        }


    }
}
