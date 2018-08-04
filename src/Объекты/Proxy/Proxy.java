public class Proxy {
    public static void main(String[] args) {
        Proxy solution = new Proxy();
        test(solution.getProxy(Item.class));                        //true false false
        test(solution.getProxy(Item.class, Small.class));           //true false true
        test(solution.getProxy(Item.class, Big.class, Small.class));//true true true
        test(solution.getProxy(Big.class, Small.class));            //true true true т.к. Big наследуется от Item
        test(solution.getProxy(Big.class));                         //true true false т.к. Big наследуется от Item
    }
    // два параметра. Первый - класс возвращаемого типа, второй
// - классы дополнительных интерфейсов (используй аргумент переменной длины ...
    public Item getProxy(Class<? extends Item> itemClass, Class<?>   ... interClass  ) {
        Class<?> [] interfase = new Class[interClass.length + 1];
        interfase [0] = itemClass;
        for (int i = 1;i < interfase.length; i++){
            interfase[i] = interClass[i-1];
        }
        return (Item) java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(),interfase,new ItemInvocationHandler( ));
    }


    private static void test(Object proxy) {
        boolean isItem = proxy instanceof Item;
        boolean isBig = proxy instanceof Big;
        boolean isSmall = proxy instanceof Small;

        System.out.format("%b %b %b\n", isItem, isBig, isSmall);
    }}

