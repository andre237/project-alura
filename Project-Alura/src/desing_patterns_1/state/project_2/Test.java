package desing_patterns_1.state.project_2;

public class Test {

    public static void main(String[] args) {
        Account account = new Account();

        account.cashIn(100.00);
        account.cashOut(250.00);

        System.out.println("Current balance: " + account.getBalance());
        account.cashOut(40.00);
    }

}
