public class ThrowKeyword {
    public static void checkAge(int age) throws IllegalAccessException {
        if (age < 18) {
            throw new IllegalAccessException("Age should be above 18");
        } else {
            System.out.println("Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        int age = 13;
        try {
            checkAge(age);
        } catch (Exception e){
            System.out.println(e);
        }
    }    
}
