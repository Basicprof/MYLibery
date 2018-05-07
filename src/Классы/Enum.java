package Классы;

public   class Enum {

    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }
// У каждого объекта типа Direction есть его уникальный номер.
// У первого (UP) – 0, у второго (DOWN) – 1, у третьего (LEFT) – 2, и т.д.
// Получить этот номер можно с помощью метода ordinal().
    public static void main(String[] args) {
        int index  = Wheel.FRONT_LEFT.ordinal();
        //2) У каждого enum’а есть метод values(),
        // который возвращает массив значений enum’а.
    Wheel[] wheels = Wheel.values();
   // теперь по номеру можем получить элемент
    Wheel wheels10 = wheels[0];
for (Wheel wheel:wheels) System.out.println(wheel);
                //преобразование в строку
        String e = Wheel.BACK_LEFT.toString();
        // преобразование из строки
        Wheel ee = Wheel.valueOf(e);
       // если в функцию valueOf передать строку, которой нет в Direction?
        // Например, «AMIGO»?
  // Exception?
  // IllegalArgumentException.
        }
}