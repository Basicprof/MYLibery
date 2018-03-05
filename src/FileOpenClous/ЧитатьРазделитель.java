package FileOpenClous;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class ЧитатьРазделитель {
    public static void main(String[] args) throws Exception{
        DataInputStream dataInputStream = new DataInputStream(
                new FileInputStream("text.txt"));
        byte[] buffer = new byte[1024];
        //хватит для буфера
        while (dataInputStream.available()!=0){
            // если кол- байт есть не ноль то считываем
 int count = dataInputStream.read(buffer);
        // Количество реально
            // считанных данных
     if(count>0) {// Если больше нуля то выводим то что мы прочитали на экран
         System.out.println(new String(buffer));


     }
        }

        }


}
