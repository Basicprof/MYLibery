package СТРОКИ;

public class Stroki {
    public static void main(String[] args) {
        String s = new String("  ЭТа строКа    ");
        String s2 =  "Эта строка";
 System.out.println("charAt = " + s.charAt(1));// возвращает символ по индексу 1
 System.out.println("codePointAt = " + s.codePointAt(1));// возвращает символ в кодировке Юникод
 System.out.println("compareTo = " + s.compareTo(s2)); //
        // Сравнивает строки лексически
 System.out.println("compareToIgnoreCase = " + s.compareToIgnoreCase(s2));
 //сравнивает без учета регистра символов
 System.out.println("concat = " + s.concat(s2)); //Сложение строк
 System.out.println("equals = " + s.equals(s2)); //Сравнение строк
        // на равенство содержимого
        // Сравнивает строки возвращает boolean
        System.out.println("equalsIgnoreCase = " + s.equalsIgnoreCase(s2));

 System.out.println("hashCode = " + s.hashCode()); // Получаем хеш код
 System.out.println("indexOf = " + s.indexOf(65));
 // Возвращает индекс данного символа если есть в строке в КОДИРОВКе Юникод
 System.out.println("isEmpty = " + s.isEmpty()); // Возвращает  пустая ли строка
 System.out.println("length = " + s.length()); // Возвращает  длинну строки
  System.out.println("substring = " + s.substring(2,12));// Извлекает строку оторая начинается с 2 индекса и заканчивается 6
  System.out.println("toLowerCase = " + s.toLowerCase());
  //   конвертирует СИМВОЛЫ в маленькие
  System.out.println("toUpperCase = " + s.toUpperCase());
  //   конвертирует СИМВОЛЫ в большие
  System.out.println("trim = " + s.trim());//   Обрезает все ПРОБЕЛЫ в начале и в конце строки

             char [] arr = s.toCharArray();
        for (char kk:arr) {
            System.out.println("toCharArray = " + kk);// возвращает массив символов
        }
 String [] string = s.split(" ");//Принемает строку разделитель (например пробел)
  for (String k:string){
   System.out.println("split = " + k); //  и возвращает массив стрингов
    }

    //Статические методы самого класса
        System.out.println("String.valueOf = " + String.valueOf(65));
        String  str3 = String.valueOf(65);
        // Преобразуем число чар будеон все в строку в строку
        System.out.println("String.copyValueOf = " + String.copyValueOf(arr));
        // String.copyValueOf  Принимает массив чаров и преобразует их в строку.


        String str1 = "Добро пожаловать на ProgLang.su";
        String str2 = "Сайт для изучения программирования";
        StringBuffer str5 = new StringBuffer("Добро пожаловать на ProgLang.su");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean  result = str1.contentEquals(str5);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);

        result = str2.contentEquals(str5);
        System.out.println("Строка \"Сайт для изучения программирования" +
                "\" равна строке буфера \"Добро пожаловать на ProgLang.su\"?" +
                " \n" + result);

        result = str1.contentEquals(str4);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать\"? \n" + result);
    } }

