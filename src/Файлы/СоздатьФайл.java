import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class СоздатьФайл {
    public СоздатьФайл() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        File filePath = new File("Save");
        filePath.mkdir();
        File file = new File(filePath + "\\test.txt");

            file.createNewFile();

    }

// Вариант 2
// создать все директории если их вдруг ещё нет path/to/files
Path dir = Files.createDirectories(Paths.get("path", "to", "files"));
    // или так Files.createDirectories(Paths.get("path/to/files"));
// создать собственно файл path/to/files/filename.ext
    OutputStream out = Files.newOutputStream(dir.resolve("filename.ext"));

}