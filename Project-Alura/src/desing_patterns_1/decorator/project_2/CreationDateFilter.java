package desing_patterns_1.decorator.project_2;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class CreationDateFilter extends Filter {

    public CreationDateFilter(Filter nextFilter) {
        super(nextFilter);
    }

    public CreationDateFilter() {
        super();
    }

    @Override
    protected List<Account> filter(List<Account> accounts) {
        List<Account> filteredList = accounts.stream().filter(this::dateFilter).collect(Collectors.toList());
        filteredList.addAll(next(accounts));
        return filteredList;
    }

    private boolean dateFilter(@NotNull Account account) {
        return account.getCreationDate().getMonth() == LocalDate.now().getMonth() && account.getCreationDate().getYear() == LocalDate.now().getYear();
    }
}
