package СкачатьФайлURLвременДиректория;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class СкачатьФайл {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString); // создаем объект типа URL
        InputStream inputStream = url.openStream(); // открываем поток для объекта URL
        Path tempFile = Files.createTempFile("tmp-", ".tmp"); // создаем временный файл
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
        // копируем данные из потока во временный файл
        String fileName = Paths.get(url.getFile()).getFileName().toString();
        // получаем конечное имя файла
        Files.createDirectories(downloadDirectory);
        // если нужно создаем директории в пути куда файл нужно сохранить
        Path target = downloadDirectory.resolve(fileName);
        Files.move(tempFile, target, StandardCopyOption.REPLACE_EXISTING);
        //перемещаем временный файл в конечную директорию


        return target;  }
}

