package object_orientation.project_1;

import java.util.HashMap;
import java.util.Map;

public class Database implements DebtKeeper{

    private Map<Document, Debt> debtMap = new HashMap<>();
    private String address, user, password;

    public Database(String address, String user, String password) {
        this.address = address;
        this.user = user;
        this.password = password;
    }

    public void connect() {
        System.out.println("Connected");
        System.out.println("Credentials: " + address + "/" + user + "/" + password);
    }

    public void desconnect() {
        System.out.println("Disconnected");
    }

    @Override
    public Debt loadDebt(Document document) {
        return debtMap.get(document);
    }

    @Override
    public void saveDebt(Debt debt) {
        if (debt != null) debtMap.put(debt.getCreditorDocument(), debt);
    }
}
