package object_orientation.project_1;

public class DebtManager {

    public void makePayment(Debt debt, Payment payment) {
        debt.registerPayment(payment);
    }
}
