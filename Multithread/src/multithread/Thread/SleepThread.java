package multithread.Thread;
/*Java’da bir iş parçacığını belli bir süre bekletmek istersek, Thread sınıfına ait “sleep” fonksiyonunu kullanabiliriz.

“sleep” fonksiyonu milisaniye cinsinden bir değer bekler. Yani örneğin 3000 değeri 3 saniyeye karşılık gelmektedir.
Sleep fonkiyonu hata verebilecek bir metod old.dan try-catch bloğu içinde yazılmalıdır.
     */

public class SleepThread implements Runnable{
    private String threadName;
    int a=2;

    public SleepThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if(a==2){
            for(int i=0;i<=10; i++){
                try {
                    Thread.sleep(1000);
                    System.out.println("1 sn bekledi.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
}
