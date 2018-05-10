package НИТИ;

public class ThreadRunExample {

    public static void main(String[] args){
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("Стартуем runnable потоки");
        t1.start();
        t2.start();
        System.out.println("Runnable потоки в работе");
        Thread t3 = new MyThread("t3");
        Thread t4 = new MyThread("t4");
        System.out.println("Стартуем наши кастомные потоки");
        t3.start();
        t4.start();
        System.out.println("Кастомные потоки в работе");

    }
}
