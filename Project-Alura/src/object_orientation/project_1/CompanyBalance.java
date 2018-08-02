package object_orientation.project_1;

public class CompanyBalance {

    private Database database;

    public CompanyBalance(Database database) {
        this.database = database;
    }

    public void registerDebt(Debt debt) {
        database.saveDebt(debt);
    }

    public void payDebt(Document creditorDocument, Payment payment) {
        Debt debt = database.loadDebt(creditorDocument);
        if (debt != null) debt.registerPayment(payment);
        database.saveDebt(debt);
    }
}
