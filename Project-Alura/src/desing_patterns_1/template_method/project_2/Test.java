package desing_patterns_1.template_method.project_2;

public class Test {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Henry", "5791-2", 745.00);
        BankAccount account2 = new BankAccount("Jack", "8213-5", 1325.00);
        BankAccount account3 = new BankAccount("Paul", "1034-2", 7350.00);

        BankAgency agency = new BankAgency("0936");
        agency.setAgencyName("Santander POA");
        agency.setAddress("Wolf Street, 246 - Center");
        agency.setEmail("santanderp2@bank.com.br");
        agency.setPhoneNumber("(51) 3242-7811");

        agency.addAccount(account1);
        agency.addAccount(account2);
        agency.addAccount(account3);

        Report report = new ComplexReport(agency);
        report.generateReport();
    }

}
