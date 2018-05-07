package ОБРАБОТКАнЕОБРАБАТЫВАЕМЫХ.ОбработкаНео;
 import java.util.TimerTask;
    public class UncaughtExceptionHandler extends TimerTask {
        protected TimerTask original;
        protected final Thread.UncaughtExceptionHandler handler;

        public UncaughtExceptionHandler(TimerTask original) {
            if (original == null) {
                throw new NullPointerException();
            }
            this.original = original;
            //init handler here
            class  UncaughtExceptionHandlers implements
                    Thread.UncaughtExceptionHandler{
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    String stars = t.getName().replaceAll(".", "*");
                    System.out.println( e.getMessage().replaceAll(t.getName(), stars) );
                    // Заменить имя треда
                    // или часть строки на символ "*"

                }
            }  handler = new UncaughtExceptionHandlers();
            Thread.setDefaultUncaughtExceptionHandler(handler);

        }

        public void run() {
            try {
                original.run();
            } catch (Throwable cause) {
                Thread currentThread = Thread.currentThread();
                handler.uncaughtException(
                        currentThread,
                        new Exception("Blah " + currentThread.getName()
                                + " blah-blah-blah", cause));
            }
        }

        public long scheduledExecutionTime() {
            return original.scheduledExecutionTime();
        }

        public boolean cancel() {
            return original.cancel();
        }

        public static void main(String[] args) {


        }
    }
