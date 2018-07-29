package ДобавлениеФайлаВZip;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //Создаем карту для хранения всех байт файла зип
        Map<String, ByteArrayOutputStream> contentZipInput = new HashMap<>();
        // Создаем поток чтения zip и поток записи zip
        try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(Paths.get(args[1])));
        ) {

            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {

                // Сождаем массив потока
                //куда пишем байты
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                //Массив в который будем ссыитывать поэтапно байты
                byte[] buf = new byte[1024];
                int count = 0;
                // Проходим в цикле считывая пока есть байты в одной сущьности
                // и записываем в массив
                while ((count = zipInputStream.read(buf)) != -1) {
                    byteArrayOutputStream.write(buf, 0, count);
                }
                //записываем в карту данные каждой сущьности
                contentZipInput.put(zipEntry.toString(), byteArrayOutputStream);
                zipInputStream.closeEntry();// Закрываем поток чтения


            }}catch (IOException ie){}
        try (       ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(Paths.get(args[1])));
        ){


// Сосдаем сущьность новую для нового файла
            ZipEntry entry = new ZipEntry("new/" + args[0].substring(args[0].lastIndexOf(File.separator) + 1));
            // Запихиваем эту сущьность в поток записи
            zipOutputStream.putNextEntry(entry);
            //Копируем файл в поток записи
            Files.copy(Paths.get(args[0]), zipOutputStream);
            zipOutputStream.closeEntry();
            for (Map.Entry<String,ByteArrayOutputStream> pair: contentZipInput.entrySet())
            {
                entry = new ZipEntry(pair.getKey());
                if(!entry.toString().endsWith(args[0].substring(args[0].lastIndexOf(File.separator) + 1)))
                {zipOutputStream.putNextEntry(entry);
                    zipOutputStream.write(pair.getValue().toByteArray());
                    zipOutputStream.closeEntry();}
            }
        } catch (IOException ioex) {

        }
    }
}
