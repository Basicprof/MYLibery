package ЛегковесныйПоток;

import java.util.concurrent.RecursiveTask;


    //Переводим в двоичный формат при помощи легковесного потока ForkJoinTask
    public class FirkJoinTask extends RecursiveTask<String> {
        // типа потока с возвращением результата
        private int binInt;
        public FirkJoinTask(int i)
        {binInt=i;
        }

        @Override
        protected String compute() {
            int a = binInt % 2;
            int b = binInt/2;
            String result = String.valueOf(a);
            if(b>0){
                FirkJoinTask task = new FirkJoinTask(b);
                task.fork();
                return task.join() + result;
            }
            return result;
        }
    }

