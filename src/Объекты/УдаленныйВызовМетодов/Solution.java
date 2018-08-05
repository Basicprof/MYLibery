

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/* 
К серверу по RMI
*/
public class Solution {
    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {

                try {
                //создание реестра расшареных объетов
           //получаем объект (на самом деле это proxy-объект)
     DoubleString service = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
       System.out.println(  service.doubleString("Home sweet home."));

            } catch(RemoteException e){e.printStackTrace();}
            catch (NotBoundException f){f.printStackTrace();}

            //напишите тут ваш код
        }
    });

    public static void main(String[] args) throws InterruptedException {
        //pretend we start rmi server as main thread
        Remote stub = null;
          //создание реестра расшареных объетов
            try {
                registry = LocateRegistry.createRegistry(2100);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            //создание объекта для удаленного доступа
             final DoubleStringImpl service = new DoubleStringImpl();
//создание "заглушки" – приемника удаленных вызовов
            try {
                stub = UnicastRemoteObject.exportObject(service, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            //регистрация "заглушки" в реесте
            try {
                registry.bind(UNIC_BINDING_NAME, stub);
            }
      catch (AlreadyBoundException|RemoteException  e) {
            e.printStackTrace();
        }
        //start client
        CLIENT_THREAD.start();
} }