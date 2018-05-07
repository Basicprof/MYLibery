import java.io.File;
import java.io.IOException;

public class МетодыФайл {
    File file = new File("file.txt");
    File dir = new File("file");
    String [] paths = dir.list(); // Получаем все что находиться в папке
    boolean exist = dir.exists(); // Проверяем существует ли файл
    boolean isDirectory = dir.isDirectory();// Является ли это директорией
    boolean isFile = file.isFile();//bЯвляется ли это файлом
   String pathToFile = dir.getAbsolutePath();//  возвращаем абсолютный путь
    boolean delete = dir.delete(); // удалить.
    File parent = dir.getParentFile(); // возврат родительсой папки
    File [] files = dir.listFiles();// массив получим объектов файлов
    boolean create = dir.mkdir();//  создать директорию
    boolean creates = dir.mkdirs();// создает папку в месте с недостающим путем
    boolean create1 = dir.createNewFile();//

    public МетодыФайл() throws IOException {
    }
}
