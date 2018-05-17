package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
      Human Granddad = new Human("Дед 1",true,70);
      Human Granddad2 = new Human("Дед 2",true,68);
      Human Grandmother = new Human("Баб 1",false,75);
      Human Grandmother2 = new Human("Баб 2",false,65);
      Human Father = new Human("Отец",true,50,Granddad2,Grandmother);
      Human mother = new Human("Мать",false,45,Granddad,Grandmother2);
      Human daughter = new Human("Дочь ",false,20,Father,mother);
      Human daughter2 = new Human("Дочь 2",false,10,Father,mother);
      Human son = new Human("Сын",true,12,Father,mother);
        System.out.println(Granddad.toString());
        System.out.println(Granddad2.toString());
        System.out.println(Grandmother.toString());
        System.out.println(Grandmother2.toString());
        System.out.println(Father.toString());
        System.out.println(mother.toString());
        System.out.println(daughter.toString());
        System.out.println(daughter2.toString());
        System.out.println(son.toString());
      }

    public static class Human {
        String name;
        boolean sex;
        int  age;
        Human mother;
        Human father;
        public Human (String name, boolean sex, int  age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }
        public Human (String name, boolean sex, int  age, Human mother, Human father) {
          this.name = name;
          this.sex = sex;
          this.age = age;
          this.mother = mother;
          this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















