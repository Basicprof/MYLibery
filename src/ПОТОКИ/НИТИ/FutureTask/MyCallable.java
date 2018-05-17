package НИТИ.FutureTask;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private long waitTime;

    public MyCallable(int timeInMillis){
        this.waitTime = timeInMillis;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        // возвращает имя потока, который выполняет этот callable таск
        return Thread.currentThread().getName();
    }

}
