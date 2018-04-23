

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ВыводСтекаИсключений  implements Thread.UncaughtExceptionHandler {
      // Наследуемся от интерфейса в котором один метод
      // обрабатывающий ислючения в любой нити
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            t.interrupt();
            List<Throwable> list = new ArrayList();
            Throwable cause = e;

            while ((cause = cause.getCause()) != null)
            {
                list.add(cause);}
            Collections.reverse(list);
            for(Throwable l:list)
         // выводим весь стек исключений
                System.out.println(l.getClass().getName()+": "+l.getMessage());
           //Выводим самое первое ислючение
            System.out.println(e.getClass().getName()+": "+e.getMessage());}
        public static void main(String[] args) {
            Thread t = new Thread(new Runnable()
            {
                public void run(){
                    //System.out.println("Thread ...  started");
                    throw new RuntimeException("ABC",
                            new RuntimeException("DEF",
                                    new IllegalAccessException("GHI")));

                }

            });

            t.setUncaughtExceptionHandler(new ВыводСтекаИсключений());
            t.start();

        }
    }
