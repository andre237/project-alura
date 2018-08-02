package desing_patterns_1.decorator.project_2;

import java.util.ArrayList;
import java.util.List;

public abstract class Filter {

    protected final Filter nextFilter;

    public Filter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public Filter() {
        this.nextFilter = null;
    }

    protected List<Account> next(List<Account> accounts) {
        return this.nextFilter != null ? nextFilter.filter(accounts) : new ArrayList<>();
    }

    protected abstract List<Account> filter(List<Account> accounts);
}
