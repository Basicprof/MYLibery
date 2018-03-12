
    import java.io.*;

    public class ЧтениеПосимвПостр {

        public static void main(String[] args) {

            try (BufferedReader br = new BufferedReader(new FileReader("C:\\SomeDir\\notes3.txt"))) {
                // чтение посимвольно
                int c;
                while ((c = br.read()) != -1) {

                    System.out.print((char) c);
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }


            //  Также можно считать текст построчно:


            try (BufferedReader br = new BufferedReader(new FileReader("C:\\SomeDir\\notes3.txt"))) {
                //чтение построчно
                String s;
                while ((s = br.readLine()) != null) {

                    System.out.println(s);
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
//    Чтение текста и BufferedWriter
//    Класс BufferedWriter записывает текст в поток, предварительно буферизируя записываемые символы, тем самым снижая количество обращений к физическому носителю для записи данных.
//
//    Класс BufferedWriter имеет следующие конструкторы:


            //  BufferedWriter(Writer out) throws FileNotFoundException

            //      BufferedWriter(Writer out, int sz) throws FileNotFoundException

//        В качестве параметра он принимает поток вывода, в который надо осуществить запись. Второй параметр указывает на размер буфера.
//
//    Например, осуществим запись в файл:


            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\SomeDir\\notes4.txt"))) {
                String text = "Привет мир!";
                bw.write(text);
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }


//    Считывание с консоли в файл
//    Соединим оба класса BufferedReader и BufferedWriter для считывания с консоли в файл. Для этого определим следующий код программы:
//


            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\notes5.txt"))) {
                // чтение построчно
                String text;
                while (!(text = br.readLine()).equals("ESC")) {

                    bw.write(text + "\n");
                    bw.flush();
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }