package Интерфейсы;
// Реализуется много поточность
// Подпроцессами в языке создается управлять процессами класса Tread
// После создания объекта этого класса запускается следующий метод который н азывается
// Start()

public class ProcessThread {
    public static void main(String[] args) {
        Thread.currentThread();//Ссылка на текущий процесс
        // Класс Thread реализует интерфейс Runnable;
       // Runnable();
      //этот интерфейс описывает только один метод который называется run;
        // Новый подпроцесс выаолняет то что записано в данном методе
        // ПРАВДА : Класс Thread содержит пустую реализацию метода run
        // поэтому класс Thread не исользуюется сам по себе
        // а необходимо расширять и переопределять метод к медоду нельзя
        // обратитья с программы только через start
        new Mythred("ONE").start();
        new Mythred("TWO").start();
        }
        static class Mythred extends Thread {
           String str ;
           Mythred(String str){
               this.str=str;
           }
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    System.out.println(str);
                }
            }
        }

}


