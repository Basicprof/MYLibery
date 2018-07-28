package NIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ЧтениеФайлаБайты {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        File fileDirectory = new File ("D:\\Текущая идеа\\15\\MyLibery\\src\\Файлы\\NIO\\ФАЙЛЫАРХИВ");

        File file = new File(fileDirectory,fileName);
      // Создаем объект файл с именем и дерикторией
         if(!fileDirectory.exists()) fileDirectory.mkdir();
        if(!file.exists()) file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Теперь я выся пупкин и.\n разбируюсь в записюк файлук");
        fileWriter.flush();
        int length;
        try (SeekableByteChannel chanell = Files.newByteChannel(Paths.get(file.getAbsolutePath())))
        {
            ByteBuffer byteBuffer = ByteBuffer.allocate(128); //Объявляем Байт буфер
            // В цикле выполняем считывание байт буфера церез канал
            do {
                length = chanell.read(byteBuffer); //читаем через канал байты
                if (length != -1) {
                    byteBuffer.rewind();  //обнуляем текущую позицию
                    for (int i = 0; i < length; i++) {
                        System.out.print((char) byteBuffer.get());

                    }
                }
            } while (length != -1);

        } catch (IOException exception) {
            System.out.println("input / Output exit");
        }
    }
}