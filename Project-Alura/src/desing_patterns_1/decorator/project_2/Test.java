package desing_patterns_1.decorator.project_2;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Account account1 = new Account(3500.00, "279-1", "11-07-2009"); // won't go
        Account account2 = new Account(50.00, "279-2", "11-07-1990");
        Account account3 = new Account(60000.00, "279-3", "24-11-2009");
        Account account4 = new Account(6300.00, "279-4", "11-07-2009"); // won't go
        Account account5 = new Account(900.00, "279-5", "23-07-2018");

        List<Account> accounts = Arrays.asList(account1, account2, account3, account4, account5);

        Filter filter = new MinValueFilter(new MaxValueFilter(new CreationDateFilter()));
        List<Account> filtered = filter.filter(accounts);

        System.out.println("Filtered accounts: \n");
        filtered.forEach(account -> System.out.println(account.toString()));

    }

}
