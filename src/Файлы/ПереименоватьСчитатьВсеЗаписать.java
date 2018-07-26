import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ПереименоватьСчитатьВсеЗаписать {


    public static void main(String[] args) throws IOException {
        ArrayList<File> setFile = new ArrayList<>();
        File fileOutput = new File(args[0]);// Создаем Файл объект
        File fileInput = new File( args[1]);// Создаем Файл объект

        //Создаем новый файл объект
        File allFilesContent = new File(fileInput.getParent() + File.separator + "allFilesContent.txt");

        // Переименовываем файл утилитой FileUtils
     //   if (FileUtils.isExist(fileInput)) {// Проверяем существует ли файл
       ///     FileUtils.renameFile(fileInput, allFilesContent);
        //}
        resultList(setFile,fileOutput);// Запускаем метод записи всех файлов в  коллекцию
        Collections.sort( setFile, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();
                return name1.compareTo(name2);
            }
        });
        readFileAll(setFile,allFilesContent);// Запускаем метод для записи содержимого всех файлов в один


    }


    //Запись в файл
    //  FileWriter fileWriter = new FileWriter(new File("text.txt"));
    // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    //bufferedWriter.write("sfsf");
    // bufferedWriter.newLine();
    //bufferedWriter.flush();
    //bufferedWriter.close();

    private static void resultList(ArrayList arr, File f) {

        File[] listFile = f.listFiles();
        for (File fl : listFile) {

            if (fl.isFile() && fl.length() <= 50) {

                arr.add(fl);
            }
            if (fl.isDirectory()) {
                resultList(arr,fl);
            }

        }


    }
    private static void readFileAll(ArrayList arrayList, File read) throws IOException {
        BufferedWriter fileWrater = new BufferedWriter(new FileWriter(read));
        for (Object fil : arrayList) {
            File filFile = (File) fil;
            BufferedReader fileReader = null;
            try {
                fileReader = new BufferedReader(new FileReader(filFile));
                while (fileReader.ready()) {// Читаем весь фалй
                    fileWrater.write(fileReader.readLine());
                    fileWrater.flush();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            fileWrater.newLine();
        }
        fileWrater.close();

    }
}


