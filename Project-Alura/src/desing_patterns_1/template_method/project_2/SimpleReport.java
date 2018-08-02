package desing_patterns_1.template_method.project_2;

public class SimpleReport extends TemplateReport {

    private final BankAgency agency;

    public SimpleReport(BankAgency agency) {
        this.agency = agency;
    }

    @Override
    protected void header() {
        System.out.println("        " + this.agency.getAgencyName() + "\n");
    }

    @Override
    protected void footer() {
        System.out.println("\n        " + this.agency.getPhoneNumber());
    }

    @Override
    protected void body() {
        this.agency.getAccounts().forEach(account -> {
            System.out.print("Owner: " + account.getOwner());
            System.out.println(" - Balance: " + account.getBalance());
        });
    }
}
