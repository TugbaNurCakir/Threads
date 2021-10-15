package multithread.Thread;

public class RunnableInterface implements Runnable {
    private String threadName;

    public RunnableInterface(String threadName) {
        this.threadName =threadName;
    }

    @Override
   synchronized public void run() { //synchronized dediğim için sırayla aldı.ama önce hnagisini alacağı belli olmaz.
        //ama biri bitmeden diğeri başlayamadı. Mantık bu.

        for(int i = 0; i<=50; i++){
            System.out.println(Thread.currentThread().getName()+": "+i); //çalışan thread'in ismini getirir.
        }
    }
}
/*
        1. MIN_PRIORITY = 1
        2. NORM_PRIORITY = 5
        3. MAX_PRIORTY = 10
        When multiple threads are ready for execution,
        the highest priority thread is selected and executed by JVM.
        In case when a high priority thread stops, yields, or enters into the blocked state,
        a low priority thread starts executing.
                t2.setPriority(Thread.MIN_PRIORITY);
        Önem sırası verebilirim. Ama versem bile farklı sıralarda çalışabilir. Ama biri bitine kadar yine diğeri başlyamaz.
         */