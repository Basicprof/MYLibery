package ПОТОКИ;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JavaIOFILE {
    public static void main(String[] args) throws IOException{
        // on Windows
        File javaExecutavle = new File("C:\\hgk1.8.0_60\\vin\\java.exe");
        File networkFolder = new File("\\\\server\\share");
    // on Unix
        File lsExecutavle = new File("/usr/bin/ls");
    //Если в программе формеруем путь файла то пользуемся
        // Константами
        String sourcoDirName = "src";
        String mainFileName = "Main.java";
        String mainFilePath = sourcoDirName
                + File.separator//separarorChar от операционной
                // системы собирает путь к файлу
                + mainFileName;
        // еще есть pathSepararor pathSepararorChar
        // Символ которым разделяются пути : ;
        // еще один способ собрать с нужным
        // разделителем Он склеет сам с нужным
        File mainFile = new File(sourcoDirName ,mainFileName);
    // Экземпляр класса можно создать как с абсолютным так и относительным путем
       // Абсолютный когда с корня системы
        File absoluteFile = new File("/usr/bin/java");
        absoluteFile.isAbsolute();// true
        absoluteFile.getAbsolutePath();
        File relateveFile = new File("readme.txt");
        relateveFile.isAbsolute();//false
        relateveFile.getAbsolutePath();//Возвращает строку
        relateveFile.getAbsoluteFile();// Возвращает экз.файл
        //Относительный путь можно превратить в абсолютный
        // / home/stopic/readme.txt
        ///Имея экземпляр класса Файл можно вынуть из него путь ввиде строки.
        String path = mainFile.getPath();
        String name = mainFile.getName();//только имя с расширением
        String parent = mainFile.getParent();//без последнего имени
        File parentFile = mainFile.getParentFile();//
        // в виде экземпляра файла
        // КАК сравнить два экземпляра пути файла
        //Различные пути могут вести к одному файлу
        File file = new File("./prj/../symlink.txt");
        //"/home/stepic/readne.txt"
        String canonicalPath = file.getCanonicalPath();//
        File canonicalFile = file.getCanonicalFile();//
        //приводят к каноническому виду Сначало вычесляют Абсолютный путь
        // вырезая все избыточные компоненты приведя два пути к
        // Каноническому виду их можно сравнивать как строки.
        // Бросают исключение IOException (эти операции требуют обращение к диску)
       // Cуществование объекта ФАйл File не привязан к существованию файла на диске.
        File java = new File("/usr/bin/java");
       // Проверка существования
        java.exists();//true
        // Проверка типа
        java.isFile();//true
        java.isDirectory();//false
// Когда убедились что файл существует и это файл то можем
        // запросить информацию Если не сущестует эти методы возвращают 0000
        java.length();//1536 Размер
        java.lastModified();//123456789 Время последней модификации в милисикундах
// Если экземляр Файл соответсвует директории java.isDirectory()
       //то можем получить содержимое с помощью методов
       // Если директория не сущестующаа то NULL
        java.list();//String[] Массив строк
       java.listFiles();// File[] Массив экземляров фалов
     // Есть перегруженные варианты методов list and ListFiles принимающие Фильтр
        File[] javaSourceFiles = java.listFiles(f -> f.getName().endsWith(".java"));
    // Лямда выражение в этом примере.
        // Фильтр это объект реализующий интерфейс либо:
        //java.io.FileFilter:
           //boolean accept(File pathname)
           // java.io.FilenameFilter:
        //bolean accept(File dit, Strinf name)\
        // ЕСЛИ НУЖНО ЧТО ТО ПОМЕНЯТЬ В ФАЙЛОВОЙ СИСТЕМЕ
       try {// Этот метод не часто исользуется так как есть
           // классы для записи которые так же умеют создавать файл
           // Нужен когда нам нужно убедиться что файл создан (нашей программой именно сечас)
           boolean success = file.createNewFile();// Создает атомарно (т.е никакая
           // программа между этими операциями вклиниться не может)пустой файл
       // возвращает true если создал или если существовал false
       }catch (IOException e){

       }
// ДЛя создания директории есть методы
        File dir = new File("a/b/c/d/");
       boolean success = dir.mkdir();// за один вызов одна директория
       boolean cuccess2 = dir.mkdirs();// иерархия "a/b/c/d/" из всех уровней вложенности
       boolean success1 = file.delete(); // Удаляет директорию если пуста
        //  если не пустая пишут рекурсивный обход всех файлов и дерикторий

        boolean success3 =  file.renameTo(dir); // можно так переименовать
        // что он окажется в другой директории
        // полагаться можно только БЕЗ переноса в другую директорию
        // Чтобы обойти это ограничение требуется писать свой метод
        // либо использовать стороннюю библиотеку например AppacheCommans
        //Переименовывает файл принимает не строчку а экземпляр файл

//===============+++++++++++++++++++===============
        //===============+++++++++++++++++++===============
        //===============+++++++++++++++++++===============
        //===============+++++++++++++++++++===============
 //  Абсолютные НОВЫЕ классы добавили разработчики (рекомендуются дла работы в новых джава,
        // но от старого не избавиться в мире написано невообразимое кол- во кода использоующий java.io)
            //java.nio.file.Path интерфейс
    Path paths = Paths.get("prj/stepic");// Получаем экземпляр
     File fromPath = paths.toFile(); // Конвертация в Файл
     Path fromFile = fromPath.toPath();// Конвертация обратно
 // такие же как и в классе Файл а также новые удобные
  Path javas = Paths.get("/usr/bin/java");// Получаем экземпляр
    javas.isAbsolute();
    javas.getFileName();
    javas.getParent();

    javas.getNameCount();
    javas.getName(1);//Получение компонента пути по его индексу
    javas.resolveSibling("/user");
    javas.startsWith("/usr");// Проверка является ли один путь префиксом другого
    Paths.get("/usr").relativize(javas); // Вычисление относительного пути между двумя в файловой системе.
      // В интерфейсе Path нет доступа к файловой системе.
     //Кода нужно залесть на дистк это делаетс ячерез класс File
        // и его статические мотоды там есть аналоги
        // которые были в классе файл и даже больше
        Files.exists(javas);
        Files.isRegularFile(javas);
        Files.size(javas);
        Files.getLastModifiedTime(javas).toMillis();
         // Наконец то есть челоеческие методы copy and move
        Files.copy(javas,Paths.get("/usr/bin/java_copy"),
                StandardCopyOption.REPLACE_EXISTING);
        // Опционально можно передать дополнительные параметры
        // например REPLACE_EXISTING что делать если файл сущестует
           // В НОВОМ ip заметно отличается получение содержимеого директорий
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(javas)){
           // делается при помощи отдельного объектаDirectoryStream<Path>
            // получаемого  при помощи такого статического метода
            // Files.newDirectoryStream(<javas> - Сдесь можно передать фильтр)){
             // ПОЧЕМУ ТАК ГРОМОЗДКО == Директории бывают большими и не всегда
            //хочется зачитывать их целиком
            // (новвый апиай позволят зачитывать потоковыми порциями)
            for (Path child : directoryStream){
                System.out.println("child = " + child);
                
            }
            // Для создания директорий
            Files.createDirectory(javas);
            Files.createDirectories(javas);
            // УДАЛЕНИЕ ДЕРИКТОРИИ СО ВСЕМ СОДЕРЖИМЫМ ТАКОГО МЕТОДА ЕЩЕ НЕТ
            // реализован метод обхода дерикторий для удаления и копирования
            //Рекурсивное удаление.
            Path directory = Paths.get("/tmp");
          Files.walkFileTree(directory, new SimpleFileVisitor < Path >(){
               //Воспользовались классом new SimpleFileVisitor
               // и переопределили только 2 из его 4 методов
                // Сам по себе он ничего не далает а
               // удобен чтоб наследоваться переопределить 1 два метода
                //Должны возвращать FileVisitResult == это
               // перечесление что делать дальше там есть значения такие как
                // продолжить остановиться и пропустить
               // Можно один раз создать записать в какую нибудь
               // паблик статик переменную и использовать по всей программе.
                @Override
         public FileVisitResult visitFile(// после нахождения файла
    Path file,  BasicFileAttributes attrs)
            throws IOException {
                    Files.delete(file);
                return FileVisitResult.CONTINUE;
                }
                @Override
                public FileVisitResult postVisitDirectory(
                        // Метод после выхода из дериктории
                        Path dir, IOException exc) throws IOException{
                if(exc == null){
                    Files.delete(dir);
                    return  FileVisitResult.CONTINUE;}
                    else {throw  exc;}
                       } });
       //=====------
            /*
            Path zipPath =  Paths.get("jdk1.8.0_60/src.zip");// Открываем зип архив
            и работаем с его содержимым с темиже классами
          try (FileSystem zipfs = FileSystems.newFileSystem(zipPath, null)) {
              for (Path pathh : zipfs.getRootDirectories()){
              Files.walkFileTree(pathh, new SimpleFileVisitor < Path >()){
                  @Override
                          public FileVisitResult visitFile(
                                  Path file , BasicFileAttributes attrs)
                      throw IOException{
                      System.out.println(file);
                      return FileVisitResult.CONTINUE;
                      }
                  } }
          }*/
        }}
   }
            


