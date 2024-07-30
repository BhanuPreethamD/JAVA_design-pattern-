public class AdapterPatternDemo {
    public static void main(String[] args) {
        NewPaymentGateway newGateway = new NewPaymentGateway();
        PaymentProcessor adapter = new PaymentAdapter(newGateway);
        adapter.pay(100); // Payment made using NewPaymentGateway: 100.0
    }
}
