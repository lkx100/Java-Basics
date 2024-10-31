class Payment {
    void makePayment() {
        System.out.println("Payment is being processed.");
    }
}
    
class CreditCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}

class PayPal extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using PayPal.");
    }
}
    
class Cash extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using Cash.");
    }
}
    
public class PaymentDynamicPolymorphism {
    public static void main(String[] args) {
        Payment paymentMethod;
        paymentMethod = new Payment();
        paymentMethod.makePayment();
        paymentMethod = new CreditCard();
        paymentMethod.makePayment();
        // Output: Payment made using Credit Card.
        paymentMethod = new PayPal();
        paymentMethod.makePayment();
        // Output: Payment made using PayPal.
        paymentMethod = new Cash();
        paymentMethod.makePayment();
        // Output: Payment made using Cash
    }
}