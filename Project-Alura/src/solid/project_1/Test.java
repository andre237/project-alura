package solid.project_1;

public class Test {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Joseph");
        e1.setBaseSalary(2500);
        e1.setRole(Role.DBA);

        Employee e2 = new Employee();
        e2.setName("Mark");
        e2.setBaseSalary(800);
        e2.setRole(Role.ENGINNER);

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("Increase for employee " + e1.getName() + ": " + calculator.calculate(e1));
        System.out.println("Increase for employee " + e2.getName() + ": " + calculator.calculate(e2));
    }

}
