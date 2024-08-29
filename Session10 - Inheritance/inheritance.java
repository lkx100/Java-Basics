class Father {
    boolean bankAccount = true;
    public void assets() {System.out.println("He built his house with his own money");}
}

class Child extends Father {
    boolean goesToSchool = true;
}

public class inheritance {
    public static void main(String[] args) {
        Child kid = new Child();
        if (kid.goesToSchool) System.out.println("Kid goes to school");
        if (kid.bankAccount) kid.assets();
    }    
}
