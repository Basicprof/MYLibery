package FileOpenClous;

import java.io.UnsupportedEncodingException;

public class УзнатьСимволINT {
    public static void main(String[] args) throws UnsupportedEncodingException {
        try {
            char[] testChars = new char[] {'a','b','c','d','e','f','g',' ','1','2','3','4','5','6','7',','};
            String str = new String(testChars);
            byte[] bytes = str.getBytes("ascii");

            // Получам код символа в ASCII кодировке
            // ВНИМАНИЕ! Это можно делать только если кодировка однобайтная
            // (в Юникоде символ может кодироваться от 1 до 3 байтами)
            for ( int i = 0; i < testChars.length; i++ )
                System.out.print(testChars[i] + ": " + bytes[i]+" / " );

        } catch ( Exception ex ) {
            ex.printStackTrace();
        }

        //Возвратить код символа
        char c = 'Y';
        String s = new Character(c).toString();

        byte[] codes = s.getBytes("US-ASCII");

        byte code = codes[0];


    }
}
