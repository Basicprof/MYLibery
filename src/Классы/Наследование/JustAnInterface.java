package Классы.Наследование;

public interface JustAnInterface {
    public static final B B = new B();

    class B extends С{
        public B() {
            System.out.print("B");
        }
    }
}