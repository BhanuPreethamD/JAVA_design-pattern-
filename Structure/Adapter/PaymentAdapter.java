public class PaymentAdapter implements PaymentProcessor {
    private NewPaymentGateway newPaymentGateway;

    public PaymentAdapter(NewPaymentGateway newPaymentGateway) {
        this.newPaymentGateway = newPaymentGateway;
    }

    @Override
    public void pay(int amount) {
        newPaymentGateway.makePayment((double) amount);
    }
}
