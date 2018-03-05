package FileOpenClous;

import java.io.*;

public class ЧтениеЗаписьДва {
    private static final int BUFFER_SIZE = 0;
   public static void main(String[] args) throws IOException {
        FileInputStream ipt1 = new FileInputStream("text.txt");
       FileOutputStream out2 = new FileOutputStream("tet.txt");
       FileOutputStream out3 = new FileOutputStream("tt.txt");
        int fileOneSize = ipt1.available();
        int limit = fileOneSize / 2;
   // количество прочитанных байт
        int read = 0;
      byte[] buffer = new byte[BUFFER_SIZE];
     // прочитано больше половины файла
        boolean limitPassed = false;
        while (ipt1.available() > 0) {
            int count = ipt1.read(buffer);
            read += count;
            // интересный случай прочитно не менее половины файла
            // в этом случае в одном буфере может лежать самый
            // конец out2 и самое начало out3
            if (read >= limit && !limitPassed) {
               // после этого всё будет писаться в out3
                limitPassed = true;
            // делим буфер на две части. Добавляем остаток
                // от деления на 2, чтобы out2 был больше.
                int x = limit % BUFFER_SIZE + fileOneSize % 2;
                out2.write(buffer, 0, x);
                out3.write(buffer, x, count - x);

            } else if (limitPassed) {
                out3.write(buffer, 0, count);
            } else {
                out2.write(buffer, 0, count);
            }
        }
    }
}