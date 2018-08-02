package solid.project_1;

public enum IncreaseRules implements Increase {

    BASE_BIGGER_THAN_3000 {
        @Override
        public double applyRule(Employee employee) {
            double salary = employee.getBaseSalary();
            return salary > 3000 ? salary * 0.1 : salary * 0.15;
        }
    },
    BASE_BIGGER_THAN_2000 {
        @Override
        public double applyRule(Employee employee) {
            double salary = employee.getBaseSalary();
            return salary > 2000 ? salary * 0.08 : salary * 0.09;
        }
    },
    BASE_LOWER_THAN_1000{
        @Override
        public double applyRule(Employee employee) {
            double salary = employee.getBaseSalary();
            return salary < 1000 ? salary * 0.2 : salary *0.18;
        }
    }
}
