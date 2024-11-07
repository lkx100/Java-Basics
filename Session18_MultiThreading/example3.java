import java.lang.Thread;
class MyThread extends Thread {
    MyThread(String name) {super(name);}
    public void run() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("Name: " + Thread.currentThread().getName() + " | Priority: " + Thread.currentThread().getPriority());
                try {Thread.sleep(1000);} 
                catch (InterruptedException e) {e.printStackTrace();}
            }
            System.out.println();
        }
    }
}
public class example3 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");    
        MyThread t2 = new MyThread("Thread 2");    
        MyThread t3 = new MyThread("Thread 3");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
