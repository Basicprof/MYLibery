import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Xech2 {
    public static void main(String[] args) {

    }
    private static String md5(String plainText) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(plainText.getBytes(Charset.forName("UTF-8")));
    messageDigest.digest(); // Выдает хеш подпись и возвращает массив байтов
       return "Строка хеша";// HexancodeHexString(messageDigest.digest);
    }
}
