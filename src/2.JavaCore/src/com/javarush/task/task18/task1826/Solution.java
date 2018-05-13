package com.javarush.task.task18.task1826;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution {// Шифр Виженера
   String buk ="";
    public static void main(String[] args) throws Exception {
//-e fileVigener fileOutputVigenerChifr -d fileOpenvigener fileOutputVigener
  // ArrFile(args[1]);//Функция получает массив байтов файла
        //ArrFileCoding( ArrFile(args[1]));  //Функция преобразует массив байтов в Код байтов
 if(args[0].equals("-e"))   writeFile(ArrFileCoding( ArrFile(args[1])),args[2]);//Функция записи в файл

 if(args[0].equals("-d"))    writeFile(ArrFileRasCoding( ArrFile(args[1])),args[2]);//Функция записи в файл
}



    public static  byte  [] ArrFile(String name) throws IOException {
        BufferedInputStream buff = new BufferedInputStream(new FileInputStream(name));
        byte [] b = new byte[buff.available()];

        buff.read(b);
        buff.close();
    return  b;}
    //Метод получает массив байтов , и возвращает закодированный массив байтов
    public static  byte  [] ArrFileCoding(byte [] arrByte) throws IOException {

        String alfkod = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";//
        byte [] arrByteNuw = new byte[arrByte.length]; //объявляем новый массив байтов
         for (int i = 0; i <arrByte.length ; i++) {// Проходим по массиву переданных байтов
            byte b = arrByte[i];
             char ch = (char) b;// Присваиваем символ массива в переменную

                b = (byte) (b^2);

            arrByteNuw[i] = b;}
        return  arrByteNuw;}

    public static  byte  [] ArrFileRasCoding(byte [] arrByte) throws IOException {

        String alfkod = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";//
        byte [] arrByteNuw = new byte[arrByte.length]; //объявляем новый массив байтов
        for (int i = 0; i <arrByte.length ; i++) {// Проходим по массиву переданных байтов
            byte b = arrByte[i];
            char ch = (char) b;// Присваиваем символ массива в переменную

                b = (byte) (b^2);

             // Зашифровать
            arrByteNuw[i] = b;}
        return  arrByteNuw;}
    public static  void writeFile(byte [] arrFi, String nameArgs2) throws IOException {
    BufferedOutputStream buffOutputStream = new BufferedOutputStream(
            new FileOutputStream( nameArgs2));
            buffOutputStream.write(arrFi);
buffOutputStream.close();
    }
}