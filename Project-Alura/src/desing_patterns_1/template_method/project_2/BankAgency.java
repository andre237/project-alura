package desing_patterns_1.template_method.project_2;

import java.util.ArrayList;
import java.util.List;

public class BankAgency {

    private final String agencyID;
    private List<BankAccount> accounts = new ArrayList<>();
    private String address, email, phoneNumber, agencyName;

    public BankAgency(String agencyID) {
        this.agencyID = agencyID;
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public String getAgencyID() {
        return agencyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
}
