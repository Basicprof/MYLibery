package Классы.КЛАССЫ.ВнутренАнанимКласс;

import java.util.LinkedList;
import java.util.List;

    public class Ананим {
        public static List<Iterator> iterators = new LinkedList<>();

        private int countItems;

        public Iterator getIterator(final String name) {
            return new Iterator() {//Ананимный класс без объявления переменной
                {
                    countItems++;
                    System.out.println(name + " item " + countItems);
                }

                public Iterator next() { //Метод который создает новй итератор
                    // но не заходит опять в рекурсию
                    return getIterator(name);
                }
            };
        }

        public static void main(String[] args) {
            Ананим solution = new Ананим();

            Iterator iterator = solution.getIterator("iterator");
            for (int i = 1; i < 5; i++) {
                iterators.add(iterator.next());
            }
        }
    }