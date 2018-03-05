package ПОТОКИ;

public class ЗапускПотока implements Runnable {
    //Чтобы остановить нить нужно заветси переменные для каждоай нити
    private boolean isCancel = false;
    public void cancel()
    {
        this.isCancel = true;
    }

    public static void main(String[] args) {
      //
        //в месте потока
        Thread.currentThread();//  возвращает ссылку на текущий поток
        //Правильно унаследовать интерфес Runnable
        // что бы запускать из одного класса несколько нитей.
       ЗапускПотока запускПотока = new ЗапускПотока();
        Thread newThresd = new Thread(запускПотока);
         newThresd.start(); //Старт потока
         // Остановить нить
        запускПотока.cancel();// Прерыванением переменной Которая в классе isCancel
        newThresd.interrupt(); // дать знать потоку что его работа уже не нужна
        newThresd.isInterrupted();// проверка если поток остановлен
         try {
            newThresd.join(); // Вызвав метод join можем подожнать
            // выполнения нити у которой вызвали этот метод
            // а та нить которая вызвала будет ждать
             Thread.sleep(2000); //Статический метод
             // не привязан ни к какому объекту.

         } catch (InterruptedException e) {
            e.printStackTrace();
        }

}  @Override
    public void run() {// переопределям метод нити который находится в Runnable
        while (!isCancel)
        {
            Thread.yield();//Вызов статического метода Thread.yield() в run()
            //обращен к планировщику потоков (часть потокового механизма Java,
              //  обеспечивающая переключение процессора между потоками)
            System.out.println("Tik");
        }
    }
}


