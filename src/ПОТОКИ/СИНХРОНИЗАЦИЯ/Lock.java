package СИНХРОНИЗАЦИЯ;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    private java.util.concurrent.locks.Lock lock = new ReentrantLock();

    public void someMethod() {

        try {
            if( !lock.tryLock()){ // говорит true если поток лок свободен или
                // false не ждет потока на это есть метод Lock() который
                // ждет освобождения потока
                ifLockIsBusy();
            }else ifLockIsFree();
        }catch (Exception e){e.printStackTrace();  lock.unlock();}
        //implement logic here, use the lock field

    }

    public void ifLockIsFree() {
    }

    public void ifLockIsBusy() {
    }
}
