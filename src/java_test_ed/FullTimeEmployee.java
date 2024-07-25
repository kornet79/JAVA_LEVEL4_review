package java_test_ed;

public class FullTimeEmployee implements Employee{
    private double baseSalary;
    private  double bonus;
    private final EmployeeType employeeType = EmployeeType.FULL_TIME;

    public FullTimeEmployee(double baseSalary, double bonus) {
        this.baseSalary = employeeType.adjustBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public Employee getEmployeeType() {
        return null;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", employeeType=" + employeeType +
                '}';
    }
}
