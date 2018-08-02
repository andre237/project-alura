package desing_patterns_1.decorator.project_2;

import java.util.List;
import java.util.stream.Collectors;

public class MinValueFilter extends Filter {

    public MinValueFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public MinValueFilter() {
        super();
    }

    @Override
    protected List<Account> filter(List<Account> accounts) {
        List<Account> filteredList = accounts.stream().filter(account -> account.getValue() < 100.00).collect(Collectors.toList());
        filteredList.addAll(next(accounts));
        return filteredList;
    }
}
