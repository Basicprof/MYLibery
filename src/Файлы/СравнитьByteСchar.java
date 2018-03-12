package Файлы;

import java.io.*;

public class СравнитьByteСchar {
    public static void main(String[] args) throws IOException {


       //                                                  /   Читаем символы   / Чтение Байт
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(bufferedReader.readLine());

        int kol = 0;
        int koma = 0x002C; //записываем код символа
        byte komaB =  0x002C;//записываем код символа
        byte komaB1 =  44;//записываем код символа
        while (inputStream.available() > 0) {

            int count = inputStream.read();//Сюда читаем один байт из фала

            if (count == komaB1) kol++; //Сдесь сравниваем  с кодом символа
        }


        inputStream.close();
        System.out.println(kol);
    }
}