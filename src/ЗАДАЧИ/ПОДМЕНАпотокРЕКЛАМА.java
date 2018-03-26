package ЗАДАЧИ;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;




/*
Контекстная реклама
*/


public class ПОДМЕНАпотокРЕКЛАМА {
        public static TestString testString = new TestString();

        public static void main(String[] args) {
            PrintStream consoleStream = System.out;
            //Создаем динамический массив
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            //создаем адаптер к классу PrintStream
            PrintStream stream = new PrintStream(outputStream);
            //Устанавливаем его как текущий System.out
            System.setOut(stream);

            //Вызываем функцию, которая ничего не знает о наших манипуляциях
            testString.printSomething();

            //Преобразовываем записанные в наш ByteArray данные в строку
            String result = outputStream.toString();

            //Возвращаем все как было
            System.setOut(consoleStream);
            String [] s = result.split("\n");

            for (int i = 0; i <s.length ; i+=2 ) {
                System.out.print(s[i].trim()+System.lineSeparator());
                if(s.length>i+1){
                    System.out.print(s[i+1].trim()+System.lineSeparator());
                    System.out.print("JavaRush - курсы Java онлайн"+System.lineSeparator());
                }}

        }

        public static class TestString {
            public void printSomething() {
                System.out.println("first");
                System.out.println("second");
                System.out.println("third");
                System.out.println("fourth");
                System.out.println("fifth");

            }
        }
    }
