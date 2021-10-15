package multithread.Thread;

public class TestSleepThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new SleepThread("1.thread"));
        t1.start();
    }
}
