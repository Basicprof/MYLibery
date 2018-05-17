package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread tr ;

    @Override
    public void run() {

        Thread.State newState;
       Thread.State nowState=tr.getState();
        System.out.println(nowState);
        do {
            newState = tr.getState();
            if (newState != nowState) {
                nowState = newState;
                System.out.println(nowState);
            }
        } while (newState != State.TERMINATED);


         Thread.currentThread().interrupt();
    }

    public LoggingStateThread(Thread tr) {
          this.tr = tr;

    }
}
