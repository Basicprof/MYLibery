package СоздаемОбъектRemove;

import java.rmi.RemoteException;

public class Cat   implements Animal {

    private String name;

    public Cat(String name) throws RemoteException {
        super();
        this.name = name;
    }

    @Override
    public void say() throws RemoteException {
        System.out.println("meow");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Cat " + name + " ");
    }
}
