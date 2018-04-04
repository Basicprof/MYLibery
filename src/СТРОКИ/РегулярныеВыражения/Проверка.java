package РегулярныеВыражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Проверка {
    // два метода для проверки имени пользователя
// на валидность. Первый метод
// checkWithRegExp(String userNameString) использует регулярное выражение
// для проверки валидности,
// а второй dumbCheck(String userNameString) делает проверку "Вручную".

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
    public static boolean test(String testString){
        //Проверка на окончание точка плюс com ua или ru
        Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
