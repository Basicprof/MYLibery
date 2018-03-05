package ЧИСЛА;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

// Работа
public class БольшиеЧисла {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("324234234234234234234234");//хранить любое число
        BigInteger bigInteger1 = new BigInteger("99999999999999999999999");//хранить любое число
        System.out.println("bigInteger1 + bigInteger = " + bigInteger1.add(bigInteger));
        BigDecimal big = new BigDecimal("1.23442e-5");
        BigDecimal big2 = new BigDecimal(new BigInteger("2"),6);
        System.out.println("big +big2  = " + big.add(big2)); //прибавить
        System.out.println("big / big2 = " + big.divide(big2,BigDecimal.ROUND_UP)); //огруглить вверх
        System.out.println("big /big2 = " + big.divide(big2,BigDecimal.ROUND_DOWN));//округлить вниз
        System.out.println(" = " + big.scale());// Получить порядок числа
        System.out.println("big2.multiply(big) = " + big2.multiply(big));// Умножение
// Примеры работы с BigInteger

        // создали BigInteger из строки представляющей число
        BigInteger bi1 = new BigInteger("987654321");
        System.out.println("bi1 = " + bi1);
        BigInteger bi2 = new BigInteger("-123456789");
        System.out.println("bi2 = " + bi2);

        // создали BigInteger из строки представляющей двоичное число
        BigInteger bi3 = new BigInteger("101", 2);
        System.out.println("bi3 = " + bi3);

        // Отрицательное значение заданное массивом byte
        byte[] bytes = new byte[] { (byte) 0xFF, 0x00, 0x00 }; // -65536
        BigInteger bi4 = new BigInteger(bytes);
        System.out.println("bi4 = " + bi4);
        // Положительное значение заданное массивом byte
        bytes = new byte[] { 0x1, 0x00, 0x00 }; // 65536
        BigInteger bi5 = new BigInteger(bytes);
        System.out.println("bi5 = " + bi5);

        // Задаем знак для BigInteger создаваемого из массива byte
        byte[] barSign = { 5, 7 }; // 1287
        BigInteger bi6 = new BigInteger(barSign);
        System.out.println("bi6 = " + bi6);
        System.out.println("BigInteger(-1,barSign) = " + new BigInteger(-1, barSign));

        // Генерируем случайное число BitInteger
        int bitLength = 8; // 8 bits (диапазон от 0 до 255)
        Random rnd = new Random();
        int certainty = 5; // 1 - 1/2(5) certainty
        BigInteger birnd1 = new BigInteger(bitLength, certainty, rnd);
        BigInteger birnd2 = new BigInteger(bitLength, rnd);
        System.out.println("birnd1 = " + birnd1);
        System.out.println("birnd2 = " + birnd2);

        // Создаем BigInteger из целочисленного литерала
        BigInteger bi7 = BigInteger.valueOf(42);
        System.out.println("bi7 = " + bi7);

        System.out.println("BigInteger.ONE = " + BigInteger.ONE);
        System.out.println("BigInteger.TEN = " + BigInteger.TEN);
        System.out.println("BigInteger.ZERO = " + BigInteger.ZERO);

        // Примеры арифметических операций с BigInteger
        System.out.println("bi1+bi2 = " + (bi1.add(bi2))); // +
        System.out.println("bi1 = " + bi1 + "   bi2 = " + bi2);
        BigInteger bi8 = bi5.subtract(bi3); // -
        System.out.println("bi8 = " + bi8);
        System.out.println("bi3*bi7 = " + (bi3.multiply(bi7))); // *
        System.out.println("bi5/10 = " + (bi5.divide(BigInteger.TEN))); // /
    }
}

