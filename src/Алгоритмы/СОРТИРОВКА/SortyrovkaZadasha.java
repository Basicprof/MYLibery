package Алгоритмы.СОРТИРОВКА;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortyrovkaZadasha {

            public static void main(String[] args) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> list = new ArrayList<String>();
                while (true) {
                    String s = reader.readLine();
                    if (s.isEmpty()) break;
                    list.add(s);
                }

                String[] array = list.toArray(new String[list.size()]);
                sort(array);

                for (String x : array) {
                    System.out.println(x);
                }
            }

            public static void sort(String[] array) {
                String str = "";

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {

                        if (isNumber(array[i]) && isNumber(array[j])) // если число
                        {
                            if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                                str = array[i];
                                array[i] = array[j];
                                array[j] = str;
                            }
                        }
                        if (!isNumber(array[i]) && !isNumber(array[j])) // если строки
                        {
                            if (isGreaterThan(array[j], array[i])) {
                                str = array[i];
                                array[i] = array[j];
                                array[j] = str;
                            }
                        }
                    }
                }

            }

            // Метод для сравнения строк: 'а' больше чем 'b'
            public static boolean isGreaterThan(String a, String b) {
                return a.compareTo(b) > 0;
            }


            // Переданная строка - это число?
            public static boolean isNumber(String s) {
                if (s.length() == 0) return false;

                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    if ((i != 0 && c == '-') // есть '-' внутри строки
                            || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
                    {
                        return false;
                    }
                }
                return true;
            }
        }