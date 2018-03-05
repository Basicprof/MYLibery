package Файлы;

import java.io.*;
import java.nio.Buffer;

public class ЧтениеЗаписьДва1  {
      public static void main(String[] args) throws IOException {
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          FileInputStream fs = new FileInputStream(bf.readLine());
          FileOutputStream o1 = new FileOutputStream(bf.readLine());
          FileOutputStream o2 = new FileOutputStream(bf.readLine());
        if (fs.available()%2 == 0) //четное количество байт
          {
              o1.write(fs.read(new byte[fs.available()/2]));
              //половину во второй файл
              o2.write(fs.read(new byte[fs.available()]));
              //то что осталось в третий
          }
          else
          {
              o1.write(fs.read(new byte[fs.available()/2 + 1]));
              //большая половина во второй файл
              o2.write(fs.read(new byte[fs.available()]));
              // оставшееся опять в третий.
          }


          bf.close();
          fs.close();
          o1.close();
          o2.close();

      }
  }

