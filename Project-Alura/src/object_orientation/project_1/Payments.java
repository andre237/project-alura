package object_orientation.project_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Payments {

    private double paidValue;
    private Collection<Payment> payments = new ArrayList<>();

    public Collection<Payment> paymentsBiggerThan(double value) {
        return this.payments.stream().filter(payment -> payment.getValue() > value).collect(Collectors.toList());
    }

    public Collection<Payment> paymentsFrom(Document document) {
        return this.payments.stream().filter(payment -> payment.getPayerDocument().equals(document)).collect(Collectors.toList());
    }

    public Collection<Payment> getPayments() {
        return this.payments;
    }


    private void pay(double value) {
        assert !(value <= 0) : "Invalid payment value";

        if (value > 100) value -= 8;

        this.paidValue += value;
    }

    public void registerPayment(Payment payment) {
        this.payments.add(payment);
        this.pay(payment.getValue());
    }

    public double getPaidValue() {
        return paidValue;
    }
}
