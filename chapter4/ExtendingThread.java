public class ExtendingThread {

    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
    
}

class thread1 implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {

        }
    }
}
class thread2 implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {

        }
    }
}