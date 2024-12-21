public class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    public static void main(String args[]) {
        MyThread2 l = new MyThread2("1st Thread");
        MyThread2 m = new MyThread2("2nd Thread");
        MyThread2 n = new MyThread2("3rd Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();
    }

    public void run() {
        System.out.println("Thread is starting");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1; j++) {
                try {
                    System.out.println(Thread.currentThread().getName() + "'s Priority: " + Thread.currentThread().getPriority() + "for the iteration: " + j);
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getState() + "for the iteration: " + j);
                } catch (InterruptedException e) {
                    System.out.println("thread interupted");
                }
            }
        }
    }

}
