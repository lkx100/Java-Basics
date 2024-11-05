public class FinallyInTryExcept {
    public static void main(String[] args) {
        String name = "Lucky Kumar";
        try {
            System.out.println("Name:" + name);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Task Done!");
        }
    }    
}
