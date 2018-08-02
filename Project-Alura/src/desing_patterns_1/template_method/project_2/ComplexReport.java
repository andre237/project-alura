package desing_patterns_1.template_method.project_2;

import java.time.Instant;
import java.util.Date;

public class ComplexReport extends TemplateReport {

    private final BankAgency agency;

    public ComplexReport(BankAgency agency) {
        this.agency = agency;
    }

    @Override
    protected void header() {
        System.out.println("    " + this.agency.getAgencyName() + " - " + this.agency.getPhoneNumber());
        System.out.println("            " + this.agency.getPhoneNumber() + "\n");
    }

    @Override
    protected void footer() {
        System.out.println("\n       " + this.agency.getEmail());
        System.out.println("     " + Date.from(Instant.now()));
    }

    @Override
    protected void body() {
        this.agency.getAccounts().forEach(account -> {
            System.out.print("Owner: " + account.getOwner());
            System.out.print(" - Balance: " + account.getBalance());
            System.out.print(" - Account ID: " + account.getAccountID());
            System.out.println(" - Agency ID: " +this.agency.getAgencyID());
        });
    }
}
