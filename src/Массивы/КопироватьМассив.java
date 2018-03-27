package Массивы;

import java.util.Arrays;

public class КопироватьМассив {
    public static void main(String[] args) {


        int[] a = {1, 2, 3};
        int[] b = a;
        int[] c = a.clone();
        int[] d = Arrays.copyOf(a, a.length);
        int[] e = new int[a.length];
        System.arraycopy(a, 0, e, 0, a.length);

        System.out.println("\nИмя класса a: \"" + a.getClass().getName() + "\"");
        System.out.println("Хеш код объекта a: \"" + Integer.toHexString(a.hashCode()) + "\"");

        System.out.print("\na: " + a + ": ");

        Arrays.stream(a).forEach(v -> System.out.print(v + " "));
        System.out.print("\nb: " + b + ": ");
        Arrays.stream(b).forEach(v -> System.out.print(v + " "));
        System.out.printf("\nc: " + c + ": ");
        Arrays.stream(c).forEach(v -> System.out.print(v + " "));
        System.out.printf("\nd: " + d + ": ");
        Arrays.stream(d).forEach(v -> System.out.print(v + " "));
        System.out.printf("\ne: " + e + ": ");
        Arrays.stream(e).forEach(v -> System.out.print(v + " "));

        System.out.println("\n\na " + (a == b ? "=" : "!") + "= b");
        System.out.print("a " + (a.equals(b) ? "" : "NOT ") + "equals b");

        System.out.println("\n\na " + (a == c ? "=" : "!") + "= c");
        System.out.print("a " + (a.equals(c) ? "" : "NOT ") + "equals c");

        System.out.println("\n\na " + (a == d ? "=" : "!") + "= d");
        System.out.print("a " + (a.equals(d) ? "" : "NOT ") + "equals d");

        System.out.println("\n\na " + (a == e ? "=" : "!") + "= e");
        System.out.print("a " + (a.equals(e) ? "" : "NOT ") + "equals e");
    }