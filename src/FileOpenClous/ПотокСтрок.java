package FileOpenClous;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ПотокСтрок {// Фишки из java 8
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("text.txt")).forEach(System.out::println);
    // Стрим получаем поток строк
        //для каждой строки применяем операцию
    }
}
