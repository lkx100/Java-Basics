class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class usersignup {
    public static void main(String[] args) {
        try {
            registerUser(16);
        } catch (AgeRestrictionException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registerUser(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("User is too young to sign up. Minimum age is 18.");
        }
        System.out.println("User registered successfully.");
    }
}
