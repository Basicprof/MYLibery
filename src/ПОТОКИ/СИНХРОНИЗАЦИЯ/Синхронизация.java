package СИНХРОНИЗАЦИЯ;

public class Синхронизация {
    //Включив в программу EvenGenerator.java
    // поддержку synchronized, мы можем предотвратить
    // нежелательный доступ со стороны потоков:
//: concurrency/SynchronizedEvenGenerator.java
// Упрощение работы с мьютексами с использованием
// ключевого слова synchronized.
// {RunByHand}

//    public class
//    SynchronizedEvenGenerator extends IntGenerator {
//        private int currentEvenValue = 0;
//        public synchronized int next() {
//            ++currentEvenValue;
//            Thread.yield(); // Ускоряем сбой
//            ++currentEvenValue;
//            return currentEvenValue;
//        }
//        public static void main(String[] args) {
//            EvenChecker.test(new SynchronizedEvenGenerator());
//        }
//    }
}
