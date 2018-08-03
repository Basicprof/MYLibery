import java.math.BigInteger;

public class ФорматЧисла {
    public static void main(String[] args) {
        BigInteger i = new BigInteger(1, "15654f".getBytes());

        System.out.println(  String.format("%032x",i));
    }
    }
