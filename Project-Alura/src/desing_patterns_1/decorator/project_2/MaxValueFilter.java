package desing_patterns_1.decorator.project_2;

import java.util.List;
import java.util.stream.Collectors;

public class MaxValueFilter extends Filter {

    public MaxValueFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public MaxValueFilter() {
        super();
    }

    @Override
    protected List<Account> filter(List<Account> accounts) {
        List<Account> filteredList = accounts.stream().filter(account -> account.getValue() > 50000.00).collect(Collectors.toList());
        filteredList.addAll(next(accounts));
        return filteredList;
    }
}
