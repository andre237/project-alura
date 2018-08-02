package solid.project_1;

public enum Role {

    DEVELOPER(IncreaseRules.BASE_BIGGER_THAN_2000),
    DBA(IncreaseRules.BASE_BIGGER_THAN_3000),
    TESTER(IncreaseRules.BASE_BIGGER_THAN_3000),
    ENGINNER(IncreaseRules.BASE_LOWER_THAN_1000);

    private Increase rule;

    Role(Increase increase) {
        this.rule = increase;
    }

    public double calculate(Employee employee) {
        return this.rule.applyRule(employee);
    }
}
