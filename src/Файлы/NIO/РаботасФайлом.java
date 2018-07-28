package NIO;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class РаботасФайлом {
    public static byte[] readBytes(String fileName) throws IOException {
        byte[] files = Files.readAllBytes(Paths.get(fileName));
        // Копируем все байты в массив
        return files;}
    public static List<String> readLines(String fileName) throws IOException {

        List<String> files = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());
        // Копируем все Строки в Коллекцию применяя кодировку по умолянию Charset.defaultCharset()
        return files;
    }

    public static void writeBytes(String fileName, byte[] bytes) throws IOException {

        Files.write(Paths.get(fileName),bytes);
        // Копируем все байты в файл
    }

    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
// копируем файл resourceFileName на место destinationFileName
Files.copy(Paths.get(resourceFileName),Paths.get(destinationFileName));
    }
}


