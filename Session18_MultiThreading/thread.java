import java.lang.Thread;
class MyThread extends Thread {
    public void run() {
        System.out.println("Starting ...");
        try {
            Thread.sleep(10000);
            System.out.println("MyThread Class");
        } 
        catch (InterruptedException e) {System.out.println(e);}
    }
}
public class thread {
    public static void main(String[] args) {
        MyThread td = new MyThread();
        System.out.println("State: " + td.getState());
        td.start();
        System.out.println("State: " + td.getState());
        try {
            Thread.sleep(10000);
            System.out.println("main sleep process");
        } 
        catch (InterruptedException e){System.out.println(e);}
        System.out.println("State: " + td.getState());
        try {
            td.join();
            System.out.println("main join process");
        } 
        catch (InterruptedException e){System.out.println(e);}
        System.out.println("State: " + td.getState());
    }
}
