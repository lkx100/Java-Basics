public class JoinThread {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 -> " + i);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 2 -> " + i);
            }
        });
        one.start();
        two.start();
        try {
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread task finished");
    }
}
