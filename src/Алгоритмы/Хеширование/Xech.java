import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Xech {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String stringPasLog = "IgorPetrov_197209ru ";
       // "SHA-1" "MD5"
        MessageDigest sma1 = MessageDigest.getInstance("SHA-1");
        //В фабрику передаем алгоритм шифрования
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        byte [] bytesmd5 = md5.digest(stringPasLog.getBytes());
        byte [] bytessma1 = sma1.digest(stringPasLog.getBytes());
        for (byte b:bytesmd5) {
            System.out.print(b);
        }
        for (byte b:bytessma1) {
            System.out.print(b);
        }
        StringBuilder stringBuilder = code16(bytesmd5);
        StringBuilder stringBuilder2 = code16(bytessma1);
        System.out.println( stringBuilder.toString());
        System.out.println( stringBuilder2.toString());

/////////////////////////////////////////// Делаем рандомным
        Cipher cipher = Cipher.getInstance("AES");// У нас есть ключик
       //1.Способ=============================
        KeyGenerator kgen = KeyGenerator.getInstance("AES"); // Хотим исользовть шифр AES
        kgen.init(128);// Инициализируем битами
        SecretKey key = kgen.generateKey(); // Генерируем секретный ключик
        // 2Способ===============================
        // Берем последоваетельность байт это наш ключик "Bar12345Bar12345"
        SecretKeySpec keyNew = new SecretKeySpec("Bar12345Bar12345".getBytes(),"AVS");
        // Мы будем криптовать ENCRYPT_MODE  (можем Зашифровать расшифровать перешифровать)
        cipher.init(Cipher.ENCRYPT_MODE,key); // Сюда передаем клюичики и тип шифрования

        byte[] bytes =cipher.doFinal(stringPasLog.getBytes());

            System.out.print(code16(bytes).toString());
        //==================================================
       }
    public static StringBuilder code16(byte[] bytes){//Преобразует байты в 16 ричный формат
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bytes){
            stringBuilder.append(String.format("%02X ",b));
        }
    return stringBuilder;}
}
