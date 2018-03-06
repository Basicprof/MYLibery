public class FormatДобавить {
    public static void main(String[] args) {
        Integer phoneNumber = 3805454;// Добавим номер до десяти
        String strPhoneNumber =  String.format("%010d",phoneNumber);
    }
}
