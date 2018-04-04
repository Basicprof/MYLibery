
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
    public class ТелефНомер {
        public static boolean checkTelNumber(String telNumber) {
            if(telNumber==null) return false;
            int countNum = telNumber.replaceAll("\\D", "").length();
//        System.out.println(countNum);
//        System.out.println(telNumber.matches("^\\+.+"));
            String q = "";

            if(telNumber.equals(q)) return false;
            if(telNumber.isEmpty()) return false;

//
//        //если номер начинается с '+', то он содержит 12 цифр
            if(telNumber.matches("^\\+.+") && (countNum!=12)) return false;
//
//        //если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
            if(telNumber.matches("^[0-9].+") && (countNum!=10)) return false;
            if(telNumber.matches("^\\(.+") && (countNum!=10)) return false;

            //может содержать 0-2 знаков '-', которые не могут идти подряд
            if(telNumber.matches(".+-{2,}.*")) return false;
            if(telNumber.matches("(.+-.+){3}")) return false;
            if(telNumber.matches(".+-$")) return false;

            //может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
            //скобки внутри содержат четко 3 цифры
            if(telNumber.matches(".*\\(.*") || telNumber.matches(".*\\).*")) {
                if(!telNumber.matches("\\+?\\d*\\([0-9]{3}\\).+")) return false;
            }


            //номер не содержит букв
            if(telNumber.matches(".*[a-z].*")) return false;

            //номер заканчивается на цифру
            if(!telNumber.matches(".*[0-9]$")) return false;

            return true;

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

