package Алгоритмы.СОРТИРОВКА;

public class Пузырьковая {
    public static void main(String[] args) {

        int array[] = {2, 4, 5, 9, 1, 0, 7, 6, 3, 8};
        int counter;
        do {
            counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    counter++;
                }
            }
        }
        while (counter > 0);
    }
}