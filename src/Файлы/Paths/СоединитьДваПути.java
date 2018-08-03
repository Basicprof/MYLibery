package Paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class СоединитьДваПути {
    public static void main(String[] args) {
        Path pathDirectory  = Paths.get("D:\\Текущая идеа\\16\\MyLibery\\src\\Файлы\\Paths");
        Path pathFile  = Paths.get("СоединитьДваПути.java");
        System.out.println(pathDirectory.resolve(pathFile));

    }
}
