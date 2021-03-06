package РегулярныеВыражения;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ЗаменаЧиселВСтроке {
        public static TestString testString = new TestString();

        public static void main(String[] args) {
            //запоминаем настоящий PrintStream в специальную переменную
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
//разворачиваем строку
            StringBuilder stringBuilder = new StringBuilder(result);
            Pattern p = Pattern.compile("[^0-9]");

            // получение matcher объекта
            Matcher m = p.matcher(stringBuilder.toString());
            String reverseString  = m.replaceAll("");
            System.out.println( reverseString);  }

        public static class TestString {
            public void printSomething() {
                System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
            }

        }
    }

