public class БИТОВЫЙреверс {
    public static void main(String[] args) {
        System.out.println("Сьеш этих мягких французскийх булочек");
    }
    public static final String reverseWithXOR(String string) {
        char[] array = string.toCharArray();
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
        return String.valueOf(array);
    }
}
