import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class КалькуряторИзСтроки {
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
            Pattern p = Pattern.compile("\\b\\d+\\b");
            Pattern p1 = Pattern.compile("[+]");
            Pattern p2 = Pattern.compile("-");
            Pattern p3 = Pattern.compile("[*]");

            // получение matcher объекта
            Matcher m = p.matcher(stringBuilder.toString());
            Matcher m1 = p1.matcher(stringBuilder.toString());
            Matcher m2 = p2.matcher(stringBuilder.toString());
            Matcher m3 = p3.matcher(stringBuilder.toString());
            m.find();
            Integer num1=Integer.parseInt(   result.substring(m.start(), m.end()));
            m.find();
            Integer num2=Integer.parseInt(    result.substring(m.start(), m.end()));
            if(m1.find())   result += (num1+num2);

            if(m2.find())
                result += (num1-num2);
            if(m3.find())
                result += (num1*num2);


            System.out.println( result);
        }


        public static class TestString {
            public void printSomething() {
                System.out.print("3 + 6 = ");
            }
        }
    }




