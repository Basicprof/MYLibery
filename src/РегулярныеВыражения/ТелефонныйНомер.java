


import java.util.regex.Matcher;
import java.util.regex.Pattern;

    /*
    Проверка номера телефона
    Критерии валидности:
    1) если номер начинается с '+', то он содержит 12 цифр
    2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
    3) может содержать 0-2 знаков '-', которые не могут идти подряд
    4) может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
    5) скобки внутри содержат четко 3 цифры
    6) номер не содержит букв
    7) номер заканчивается на цифру
    */
    public class ТелефонныйНомер {
        public static boolean checkTelNumber(String telNumber) {
            if(telNumber==null) return false;
            byte cifr =0;
            //if(telNumber.matches("\\+")) cifr=12;else cifr=10;
            if(telNumber.contains("+")) cifr=12;else cifr=10;
            System.out.println(cifr);
            Pattern pattern = null;
            if(cifr==12)
                pattern = Pattern.compile("^\\+([0-9]{2})\\(?[0-9]{3}\\)?[0-9]+\\-?[0-9]+\\-?[0-9]+$");
            if(cifr==10)  pattern = Pattern.compile("\\([0-9]{3}\\)[0-9]+\\-?[0-9]+\\-?[0-9]+");

            Matcher matcher = pattern.matcher(telNumber);
            return matcher.matches();
        }

        public static void main(String[] args) {
            System.out.println(checkTelNumber("+380501234567"));
            System.out.println(checkTelNumber("+38(050)1234567"));
            System.out.println(checkTelNumber("+38050123-45-67"));
            System.out.println(checkTelNumber("050123-4567"));
            System.out.println(checkTelNumber("+38)050(1234567"));
            System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
            System.out.println(checkTelNumber("050ххх4567"));
            System.out.println(checkTelNumber("050123456"));
            System.out.println(checkTelNumber("(0)501234567"));
        }
    }

