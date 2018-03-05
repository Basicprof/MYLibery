package FileOpenClous;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//Считываем все строки в список строк
public class ФайлРедлайнсВсе {
    public static void main(String[] args) throws IOException {
       List<String> list = Files.readAllLines(Paths.get("text.txt"));
               // Указываем откуда читать эти строки
   for (String items: list){
       System.out.println(items);
   }
    }
}
