package object_orientation.project_1;

public interface DebtKeeper {

    Debt loadDebt(Document document);
    void saveDebt(Debt debt);

}
