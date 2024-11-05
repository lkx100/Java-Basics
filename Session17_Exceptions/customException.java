class AIDStudents extends Exception {
    AIDStudents(String name) {
        super(name);
        System.out.println(name + " cannot get below 30");
    }
}

public class customException {
    public static void main(String[] args) {
        int ctod_marks = 20;
        try {
            if (ctod_marks < 30) {
                throw new AIDStudents("Lucky Kumar");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}