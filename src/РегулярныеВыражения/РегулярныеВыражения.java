package РегулярныеВыражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class РегулярныеВыражения {
   public static void main(String[] args){
            System.out.println("Cool check:");

            System.out.println(checkWithRegExp("_@BEST"));
            System.out.println(checkWithRegExp("vovan"));
            System.out.println(checkWithRegExp("vo"));
            System.out.println(checkWithRegExp("Z@OZA"));

            System.out.println("\nDumb check:");

            System.out.println(dumbCheck("_@BEST"));
            System.out.println(dumbCheck("vovan"));
            System.out.println(dumbCheck("vo"));
            System.out.println(dumbCheck("Z@OZA"));
        }

        public static boolean checkWithRegExp(String userNameString){
            Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
            Matcher m = p.matcher(userNameString);
            return m.matches();
        }

        public static boolean dumbCheck(String userNameString){

            char[] symbols = userNameString.toCharArray();
            if(symbols.length < 3 || symbols.length > 15 ) return false;

            String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

            for(char c : symbols){
                if(validationString.indexOf(c)==-1) return false;
            }

            return true;
        }
public class регвыр{
    // Строка для сканирования, чтобы найти шаблон
    String str = "Крещение Руси произошло в 988 году! Не так ли?";
    String pattern = "(.*)(\\d+)(.*)";

    // Создание Pattern объекта
    Pattern r = Pattern.compile(pattern);

    // Создание matcher объекта
    Matcher m = r.matcher(str);
    //количество гркупп в регулярном выражении.

       //System.out.println("Колличество групп в рег. выражении = " +  m.());
//        if (m.find( )) {
//        System.out.println("Найдено значение: " + m.group(0));
//        System.out.println("Найдено значение: " + m.group(1));
//        System.out.println("Найдено значение: " + m.group(2));
//    }else {
//        System.out.println("НЕ СОВПАДАЕТ");
//    }
}
public class регвыр3{
      //  System.out.println("args adf !@ 12312312= ".matches("//b") );
        // проверяем на вхождение в строчку таких то символов
         Pattern pattern = Pattern.compile("a");
        Matcher math = pattern.matcher("Jask is a boy");
//        while (math.find()){
//            System.out.println("math = " + math.start()+math.group());
//        }
    }
}


