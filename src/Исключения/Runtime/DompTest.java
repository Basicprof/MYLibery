package Runtime;

import java.io.*;
public class DompTest
    {
        public static void main(final String args[]) throws Exception
        {
            Thread.UncaughtExceptionHandler handler =
                    new NoRuntime("Show Exception Stack", 400, 200);
                Thread.setDefaultUncaughtExceptionHandler(handler);
            new Thread() {
                public void run() {
                    System.out.println(1 / 0);
                }
            }.start();
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Press Enter for next exception");
            br.readLine();
            new Thread() {
                public void run() {
                    System.out.println(args[0]);
                }
            }.start();
            System.out.print("Press Enter to end");
            br.readLine();
            System.exit(0);
        }
    }

