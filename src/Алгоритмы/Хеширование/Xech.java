import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Xech {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String stringPasLog = "IgorPetrov_197209ru ";
       // "SHA-1" "MD5"
        MessageDigest sma1 = MessageDigest.getInstance("SHA-1");
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


    }
    public static StringBuilder code16(byte[] bytes){//Преобразует байты в 16 ричный формат
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bytes){
            stringBuilder.append(String.format("%02X ",b));
        }
    return stringBuilder;}
}
