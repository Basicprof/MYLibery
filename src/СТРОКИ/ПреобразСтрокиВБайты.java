package СТРОКИ;

import java.util.Arrays;

public class ПреобразСтрокиВБайты {
    public static void main(String[] args) {
        String inputString = "prologistic.com.ua";

        // преобразуем нашу строку в массив байт
        byte[] byteArray = inputString.getBytes();
        System.out.println("Строку в массив байт : " + Arrays.toString(byteArray));

        // конвертируем байты в строку
        String string = new String(byteArray);
        System.out.println("байты в строку : " + string);

        // давайте посмотрим, равны ли наши строки
        System.out.println("inputString == string : " + (inputString == string));
        System.out.println("inputString.equals(string) : " + (inputString.equals(string)));
    }
}
