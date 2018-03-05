package ПОТОКИ;
import sun.applet.Main;

import java.io.FileNotFoundException;
import java.io.*; // пакеты потоков ввода и вывода
import java.net.Socket;
import java.nio.*; // дополнительные возможности
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// три стандартных пококов in out err
// in поток от юзера к программе по умолчанию связан с клавиатурой
// out связан с консолью (при желании все потоки можно перенаправить)
//err = вывод ошибок
// Существует два вида потоков байтовый и символов
// байтовый ImputStream OutputStream
// Reader Writer == для работы со символьными потоками данных
// Классы ввода вывода в java самого низкого уровня
//java.io.InputStream == Читать по одному байту или блоками
// java.io.OututStream == Записывать
// Оба Абстрактные на этом уровне даже неизвестно
// с каким источником данных работают эти сримы
public abstract class InputStream implements Closeable{
    protected InputStream() throws IOException {
    }

    //Основные методы
    public abstract int read() throws IOException;
        //Возвращает байт из входного потока и сдвигается дальше
    // когда конец достигнут метод вернет -1
    // Если вернулась не -1 то можно привести к байту(byte)что то read()
    // побайтово не удобно читать Есть два метода которые читают блок байтов
    // и записывают в переданный массив
    public int read(byte b[]) throws IOException{ // Принимает массив байтов,
        // и пытается скачать количество байтов равное размеру массива
     return  read(b, 0, b.length);}// write озапись в OputStresm
     // следующий метод принимает два числа индекс числа с которого нужно считать
    //и сколько считать байтов
     // Возвращенное значение int == количесво байт считаных
    // на него нужно смотреть если -1 конец потока
    public int read(byte b[], int off, int len) throws IOException{
        return off;
    }
    //Метод skip возваращает количство байт которое удалось пропустит
    // ни куда из не сохраняя это количество
    // может быть так же меньше чем мы просили
    public long skip(long n) throws IOException{
        // fluch сбрасывает промежуточные буфера в OputStresm
        // просто вызов метода write не гарантирует что данные
        // будут переданны операционной системе для обработки
        // в каждом классе есть Couse() который закрывает,
        // но и збрасывает буфера поэтому вызывать fluch не требуется
   return n; }
    public void close() throws IOException{

    }
    ///=========================
    // ПРИМЕР КОПИРОВАНИЯ ИЗ ВХОДНОГО ПОТОКА В ВЫХОДНОЙ
    ///=============================
     int totalBytesWritten = 0;
    byte[] buf = new byte[1024];
    int blockSize;
  //  while ((blockSize = inputStream.read(buf))>0){
    //    outputStream.wtite(buf, 0 , blockSize);
    // Эти классы абстрактные поэтому ничего не говорят с какими данными работаем
    // ПОСМОТРИМ ОТКУДА БРАТЬ ДАННЫЕ
    java.io.InputStream inputStreams =
          new FileInputStream(new File("in.txt"));
    // В конструктор принимают либо строку с путем к файлу
    // Либо экземпляр File
    OutputStream ouputStream =
            new FileOutputStream(new File("out.txt6"));
  //Если у нас нарукакх есть экземпляр нового класса java.nio.FilePaths
  // получить поток с него можно с помощью методов:
    java.io.InputStream IinputStrea = Files.newInputStream(Paths.get("in.txt"));
    // Конкретный класс потоков мы не знаем он зависит от того
    // на какую реальную или вирнуальную систему указывает данный путь
    OutputStream outputStream =
            Files.newOutputStream(Paths.get("out.txt"));
// Есть возможность прочитать ресурс Paths из которого запущена виртуальная машина
// в зависимости от того упакованна ли наша программа в архив jar либо в архиве
// или на диске эта деаталь от нас скрыта
public void primer() throws IOException {
    try ( java.io.InputStream inputStream =
       Main.class.getResourceAsStream("Main.class")){// так класс может прочитать
        // собственный бай код предполагается что клас происходит в методе main
    int read = inputStream.read();
    while (read >= 0){
        System.out.printf("%02x", read);
        read = inputStream.read();
    }
    }}
// Стримы используются и для обмена данными по сети
    public void primer1() throws IOException {
        try (Socket socket = new Socket("ya.ru", 80)) // Открываем сетевое соедининие
        {
            OutputStream outputStream = socket.getOutputStream();
            // получаем из него OutputStream в который можно что то вводить
            outputStream.write("GET / HTTP / 1.0\r\n\r\n".getBytes());
            outputStream.flush();
            java.io.InputStream inputStream = socket.getInputStream();
            // и inputStream из которого можно прочитать результат
            int read = inputStream.read();
            while (read >= 0) {
                System.out.print((char) read);
                read = inputStream.read();

                // Иногда данные уже записаны в памяти виртуальной машины и мы хотим скормить их
                // какому то коду принимающему inputStream
                byte[] data = {1, 2, 3, 4, 5};// Трюк для тестирования своего кода
                java.io.InputStream inputStream1 = //записать в код
                        new ByteArrayInputStream(data);
                ByteArrayOutputStream outputStream1 =
                        // подсунуть коду записывающий
                        // данные в outputStream1
                        new ByteArrayOutputStream();
                byte[] resylt = // Получить записанные данные в виде массива байтов
                        outputStream1.toByteArray();
            }
        }
        // DataOutputStream  позволяют обмениваться данными и строками между двумя программами.
        // DataInputStream  читает
        //===========+++++++++++++
// ===========+++++++++++++
//для удобства классы Raader и Wraiter
        // java.io.Reader;
        // Аналагичный стриму только массивы принимает char
        // Возвращает не 1 байт а 2
        // java.io.Writer;
        // Аналогичен классу OutputStream
//===========+++++++++++++
//===========+++++++++++++
//===========+++++++++++++
        //Можно превратить поток байтов в поток символов завернув из в классы
        Reader reader = new InputStreamReader(inputStreams, "UTF-8");
        Charset charset = StandardCharsets.UTF_8;
        // Класс кодировао в который вынесены
        // все кодировки которые обязаны поддерживать все жвм
        Writer writer =
                new OutputStreamWriter(ouputStream, charset);
// Узнать кодировку по умолчание если не передаеш сам то машина сама передает
        Charset.defaultCharset();
//==================================
//ПРИМЕР ПЕРЕВОДА СТРОКИ В БАЙТЫ ДЛЯ ЗАПИСИ  ==================================
//==================================

        String text = "Hello world!"; // строка для записи
        //  FileOutputStream fos=new FileOutputStream("C://SomeDir//notes.txt");

        // перевод строки в байты
        //  byte[] buffer = text.getBytes();

        //fos.write(buffer, 0, buffer.length);

        //===============================================
    }}