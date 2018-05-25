import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 public class ЗапускОжиданиеОчередь {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        for (int i = 1; i <=10 ; i++) {
            int finalI = i;
            linkedBlockingQueue.add(new Runnable() {
                @Override
                public void run() {
              doExpensiveOperation(finalI); }
            });
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5,1000, TimeUnit.MILLISECONDS,linkedBlockingQueue);                                       // Создаем пул потоков с основными 3 максимум 5 время удаления потока при простое, и очередь в    которую складываются задачи
        threadPoolExecutor.prestartAllCoreThreads();                                                                 //Запусти все трэды, которые входят в основное кол-во трэдов - ядро
        threadPoolExecutor.shutdown();//Запрети добавление новых задач на исполнение в пул
        threadPoolExecutor.awaitTermination(5,TimeUnit.SECONDS);                                              //5 секунд на завершение всех тасок
      /* output example
pool-1-thread-2, localId=2
pool-1-thread-3, localId=3
pool-1-thread-1, localId=1
pool-1-thread-3, localId=5
pool-1-thread-2, localId=4
pool-1-thread-3, localId=7
pool-1-thread-1, localId=6
pool-1-thread-3, localId=9
pool-1-thread-2, localId=8
pool-1-thread-1, localId=10
         */
        }
   private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
