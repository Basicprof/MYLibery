import Классы.Наследование.Solution;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CopyOnWriteArrayListDEMO {
    public static void main(String[] args) throws InterruptedException {


        CopyOnWriteArrayListDEMO solution = new CopyOnWriteArrayListDEMO();
    List<String> list = new CopyOnWriteArrayList()/* create object of this magic class here*/;
// Название говорит само за себя. Все операции по изменению коллекции
// (add, set, remove) приводят к созданию новой копии внутреннего массива.
// Тем самым гарантируется, что при проходе итератором по коллекции
// не кинется ConcurrentModificationException. Следует помнить,
// что при копировании массива копируются только референсы (ссылки)
// на объекты (shallow copy), т.ч. доступ к полям элементов не thread-safe.
// CopyOnWrite коллекции удобно использовать, когда write операции довольно
// редки, например при
// реализации механизма подписки listeners и прохода по ним.
        solution.startUpdatingThread(list);
        solution.copyOnWriteSolution(list);
        solution.stopUpdatingThread();

        /* The output example
size = 0
Element :s781859336
Element :s1453499757
Element :s911312405
Element :s-877520242
Element :s-1636258097
size = 5

Element2 :s781859336
Element2 :s1453499757
Element2 :s911312405
Element2 :s-877520242
Element2 :s-1636258097
Element2 :s-1739827856
Element2 :s-938954654
Element2 :s925086217
size = 8
         */
}

    public void copyOnWriteSolution(List<String> list) throws InterruptedException {
        System.out.println("size = " + list.size());
        System.out.println();
        Thread.sleep(20);
        for (String element : list) {   //создает новую копию на момент создания итератора
            System.out.println("Element :" + element);
        }
        System.out.println("size = " + list.size());
        System.out.println();
        Thread.sleep(20);

        for (String element : list) {  //создает новую копию на момент создания итератора
            System.out.println("Element2 :" + element);
        }
        System.out.println("size = " + list.size());
        stopUpdatingThread();
    }

    public void stopUpdatingThread() throws InterruptedException {
        t.stop();
        t.join();
    }

    private Thread t;

    private void startUpdatingThread(final List<String> list) {
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    list.add("s" + ThreadLocalRandom.current().nextInt());
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        t.start();
    }
}
