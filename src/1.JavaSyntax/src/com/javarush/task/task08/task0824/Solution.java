package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {


        Human  son = new Human("Son",true,15);
       Human  Daughter = new Human("Daughter",false,10);
       Human  Daughter2 = new Human("Daughter2",false,12);
        Human Father = new Human("Father",true,50,Daughter2,Daughter,son);
        Human  Mother = new Human("Mother",false,41,Daughter2,Daughter,son);
        Human granddad = new Human("Dad1",true,70,Father);
        Human granddad2 = new Human("Dad2",true,68,Mother);
        Human grandmother = new Human("Bab1",false,63,Mother);
        Human grandmother2 = new Human("Bab2",false,61,Father);
        System.out.println(granddad.toString());
        System.out.println(granddad2.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandmother2.toString());

        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(son.toString());
        System.out.println(Daughter.toString());
        System.out.println(Daughter2.toString());
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList <Human> children = new ArrayList<Human>();
           public Human(String name, Boolean sex, int age, Human ... children){
               this.name = name;
               this.sex = sex;
               this.age = age;
               this.children.addAll(Arrays.asList(children));

           }
        public Human(String name, Boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
