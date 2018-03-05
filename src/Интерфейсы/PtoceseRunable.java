package Интерфейсы;

public class PtoceseRunable implements Runnable {
    String str;// Поле стринг
    PtoceseRunable(String str){ // Конструктор
        this.str=str; // присваеваем полю значение из агрумента конструктора
    }
     @Override
    public void run() {
        // Реализованый метод ран(интерфейс Runnable
         // содержит только этот метод )
         for (int i = 0; i <30 ; i++) {
             System.out.println("str = " + str);
         }
    }

    public static void main(String[] args) {
        new Thread(new PtoceseRunable("One")).start();
        // так как нельзя создать объект типа интерфейса .
        // Вызываем метод старт что бы объект запустился.
        // Анонимный объект
        new Thread(new PtoceseRunable("Two")).start();
    }
}
