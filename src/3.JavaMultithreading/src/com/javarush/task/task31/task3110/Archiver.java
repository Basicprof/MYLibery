package com.javarush.task.task31.task3110;
import com.javarush.task.task31.task3110.command.ExitCommand;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Archiver {
    public static void main(String[] args) throws Exception {
        Operation operation;

   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

   String name;
    while ((name = bufferedReader.readLine())!=""){

        CommandExecutor.execute()
    }
   //   Path paths = Paths.get(name);
//   ZipFileManager zipFileManager = new ZipFileManager(paths);
//   System.out.println("Введите полный путь к файлу записи");
//   String name2 = bufferedReader.readLine();
//        Path path2 = Paths.get(name2);
//         zipFileManager.createZip(path2);
//
//        ExitCommand exitCommand = new ExitCommand();
//        exitCommand.execute();
    }
  public static   Operation    askOperation() throws IOException {
      ConsoleHelper.writeMessage("Выберите операцию:\n" +
              "0 - упаковать файлы в архив\n" +
              "1 - добавить файл в архив\n" +
              "2 - удалить файл из архива\n" +
              "3 - распаковать архив\n" +
              "4 - просмотреть содержимое архива\n" +
              "5 - выход");

    }
}
