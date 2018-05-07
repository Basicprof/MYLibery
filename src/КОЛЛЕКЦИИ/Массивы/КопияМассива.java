package Массивы;

import java.util.Arrays;

public class КопияМассива {

    /**
     * В этом классе продемонстрированы методы для копирования массивов на java
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] source1 = {1, 2, 3};
        int[] destination = null;
        System.out.println("Массив-источник = " + Arrays.toString(source));

        destination = copyFirstFiveFieldsOfArrayUsingSystem(source);
        System.out.println("Копируем первые 5 элементов массива, если они присутствуют. Результирующий массив = " + Arrays.toString(destination));

        destination = copyFirstFiveFieldsOfArrayUsingSystem(source1);
        System.out.println("Копируем первые 5 элементов массива, если они присутствуют. Результирующий массив = " + Arrays.toString(destination));

        destination = copyFullArrayUsingSystem(source);
        System.out.println("Полное копирование массива с помощью метода System.copyarray(). Результирующий массив = " + Arrays.toString(destination));

        destination = copyFullArrayUsingClone(source);
        System.out.println("Полное копирование массива с помощью метода clone(). Результирующий массив = " + Arrays.toString(destination));

        destination = copyFullArrayUsingArrayCopyOf(source);
        System.out.println("Полное копирование массива с помощью метода Arrays.copyOf(). Результирующий массив = " + Arrays.toString(destination));

        destination = copyLastThreeUsingArrayCopyOfRange(source);
        System.out.println("Копируем последние 3 элемента массива с помощь. метода Arrays.copyOfRange(). Результирующий массив = " + Arrays.toString(destination));
    }

    /**
     * Этот метод полностью копирует массив используя метод Arrays.copyOf()
     *
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingArrayCopyOf(int[] source) {
        return Arrays.copyOf(source, source.length);
    }

    /**
     * Этот метод копирует последние 3 элемента используя метод
     * Arrays.copyOfRange()
     *
     * @param source
     * @return
     */
    private static int[] copyLastThreeUsingArrayCopyOfRange(int[] source) {
        // проверяем длину для предоствращения java.lang.ArrayIndexOutOfBoundsException
        //но для простоты метода этого не делаем :)
        return Arrays.copyOfRange(source, source.length - 3, source.length);
    }

    /**
     * Этот метод полностью копирует массив с помощью метода clone()
     *
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingClone(int[] source) {
        return source.clone();
    }

    /**
     * Этот метод полностью копирует массив с помощью метода System.arraycopy()
     *
     * @param source
     * @return
     */
    private static int[] copyFullArrayUsingSystem(int[] source) {
        int[] temp = new int[1];
        System.arraycopy(source, 0, temp, 0, source.length);
        return temp;
    }

    /**
     * Этот метод копирует первые 5 элементов
     * используя метод System.arraycopy()
     *
     * @param source
     * @return
     */
    private static int[] copyFirstFiveFieldsOfArrayUsingSystem(int[] source) {
        if (source.length > 5) {
            int[] temp = new int[5];
            System.arraycopy(source, 0, temp, 0, 5);
            return temp;
        } else {
            int[] temp = new int[1];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        }

    }
}
