package Файлы;



    import java.io.*;

public class ЧитатьПосимвольно {

        public static void main(String[] args) {

            try(FileReader reader = new FileReader("C:\\SomeDir\\notes3.txt"))
            {
                // читаем посимвольно
                int c;
                while((c=reader.read())!=-1){

                    System.out.print((char)c);
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
    }
