package Файлы;

import java.io.*;


public class ЧтениеИзФайла {
    public static void main(String[] args) throws IOException {//=================
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        //===========================
        File f = new File("text.txt");
    BufferedReader fin = new BufferedReader(new FileReader("text.txt"));


    String name;
    String line;
        System.out.println("Print File "+f.getName()+"? y/n");
                 while ((line = fin.readLine()) != null)
                     System.out.println(line);
                 // Чтение строки из файла.

       }}

