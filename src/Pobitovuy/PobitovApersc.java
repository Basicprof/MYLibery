package Pobitovuy;

public class PobitovApersc {
    public static void dicplay(int value){
        System.out.println("Bynary = " + Integer.toBinaryString(value)+" Decimal "+ value);

    }

    public static void main(String[] args) {
        // ~ Унарное отрицание (NOT)
        int a = 111;
        int b = ~a;
        int c = a>>1;
        int d = a>>>1;
        int e = a|b;
        int j = a&35;
        dicplay(a);
        dicplay(b);
        dicplay(c);
        dicplay(d);
        dicplay(e);
        dicplay(j);
    }
}
