import java.lang.Thread;
class TaskB implements Runnable {
    String name = null;
    TaskB(String name) {this.name = name;}
    TaskB() {}
    public void run() {System.out.println((name != null)? name : "Name not Defined");}
}
public class test {
    public static void main(String[] args) {
        TaskB b1 = new TaskB("1");
        TaskB b2 = new TaskB();
        Thread t1 = new Thread(b1, "thread1");
        Thread t2 = new Thread(b2, "thread2");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}