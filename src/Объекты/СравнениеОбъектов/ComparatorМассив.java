package Объекты.СравнениеОбъектов;

import java.util.Comparator;

public class ComparatorМассив {
    public static void main(String[] args) {
    }
    public static  class CustomizedComparator<T> implements Comparator<T> {
        private Comparator <T>[] comparators;
        public CustomizedComparator(Comparator<T> ... comp) {
            this.comparators = comp;
        }
        public int compare(T o1, T o2) {
            int result = 0;
            for (Comparator comparator : comparators)
            {
                result = comparator.compare(o1, o2);
                if (result != 0) break;
                //если аргументы равны,
                // переходим к следующему
                // компаратору (критерию сравнения),
                // если разные возвращаем результат сравнения
            }
            return result;
        }
    }
}

