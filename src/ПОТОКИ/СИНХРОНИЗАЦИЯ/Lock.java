package СИНХРОНИЗАЦИЯ;

import java.util.concurrent.locks.ReentrantLock;
//Классы блокировок реализуют интерфейс Lock, который определяет следующие методы:
//
//        void lock(): ожидает, пока не будет получена блокировка
//
//        boolean tryLock(): пытается получить блокировку, если блокировка получена, то возвращает true. Если блокировка не получена, то возвращает false. В отличие от метода lock() не ожидает получения блокировки, если она недоступна
//
//        void unlock(): снимает блокировку
//
//        Condition newCondition(): возвращает объект Condition, который связан с текущей блокировкой
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
