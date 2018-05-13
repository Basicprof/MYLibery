package Классы;

import java.lang.Enum;

public class MyEnum {
    public static enum E1 {A, B, C, Y}

    public static enum E2 {D, E, F}

    public static enum E3 {D, E, F}

    public static void main(String[] args) {
        MyEnum.switchTest(E1.C);// Выводим информацию о классе и типе или значении класса енум
        MyEnum.switchTest(E3.D);
        MyEnum.switchTest(E2.D);
        /* output
        it's E1.C
        undefined
        it's E2.D
         */
    }

    public static void switchTest(Enum obj) {

        switch (obj.getClass().getSimpleName() ){
            case "E1": System.out.println("it\'s "+ obj.getClass().getSimpleName()+"."+obj.name());break;
            case "E2": System.out.println("it\'s "+ obj.getClass().getSimpleName()+"."+obj.name());break;
            default: System.out.println("undefined");
        }
        //add your code here
    }
}

