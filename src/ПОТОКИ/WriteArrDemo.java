package ПОТОКИ;

import java.io.*;

public class WriteArrDemo {
    public static void main(String[] args)   {
        String [] arr = {"one ", "two ", "3" };
        File fByte= new File("D:\\test\\bute.txt");
        File fSymb = new File("D:\\test\\symbol.txt");
        try(//Открываем ресурсы в блоке try
            // с 7 джавы их не надо закрывать они бдут закрыты автоматом.
            // Запись побайтова
            FileOutputStream fos = new FileOutputStream(fByte);
           // Запись посимвольная
        FileWriter fw = new FileWriter(fSymb);
        ) { for (String s: arr){
            fos.write(s.getBytes());// Методом Bytes
            fw.write(s);// Методом write символы
        }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
