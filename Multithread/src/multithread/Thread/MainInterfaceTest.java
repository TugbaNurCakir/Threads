package multithread.Thread;

public class MainInterfaceTest {
    public static void main(String[] args) {
        // Runnable interface'den kalıtım almış olan "RunnableInterface" sınıfından bir nesne oluşturuyoruz.
        // Runnable tipindeki nesneyi Thread kurucusuna gönderiyoruz.
        Thread t1 = new Thread(new RunnableInterface("th1"));
        Thread t2 = new Thread(new RunnableInterface("th2"));

        t1.start();
        t2.start();
    }
}
