package СообщенияСинхронизация;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerA {
    //Создание AtomicInteger
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();
        //Если вы хотите создать AtomicInteger с начальным значением, можно сделать так:
        AtomicInteger atomicInteger1 = new AtomicInteger(123);
        //Получение значения AtomicInteger
        int atomic = atomicInteger.get();
        //установить значение AtomicInteger
        atomicInteger.set(234);
        //Сравнить и установить значение AtomicInteger
        int expectedValue = 123;
        int atom = 234;
        atomicInteger.compareAndSet(expectedValue, atom);
        //Добавляя к стоимости AtomicInteger
        atomicInteger.addAndGet(1235);//добавляет номер AtomicInteger и возвращает его значение после того
        atomicInteger.getAndAdd(456);//добавляет номер AtomicInteger но возвращает значение,
        // которое AtomicInteger имело раньше значение было добавлено
        //Вы также можете добавить отрицательные числа с AtomicInteger
        // помощью этих двух методов. Результат эффективно вычитание.

        //Вычитая из значения AtomicInteger
        atomicInteger.getAndIncrement();//decrementAndGet() вычитает 1 из AtomicInteger
        // значения и возвращает его значение после вычитания
        atomicInteger.incrementAndGet();//getAndDecrement() тоже вычитает 1 из AtomicIntegerзначения
        // но возвращает значение, которое AtomicInteger было до вычитания
    }
}
