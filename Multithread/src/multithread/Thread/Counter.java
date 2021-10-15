package multithread.Thread;

public class Counter extends Thread{
    private String threadName;

    public Counter(String threadName) {
        this.threadName = threadName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i =0; i<=100; i++){
            System.out.println(getThreadName()+": "+i);
        }
    }
}
