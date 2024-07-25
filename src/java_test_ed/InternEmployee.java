package java_test_ed;

public class InternEmployee implements Employee{
    private double baseSalary;
    private final EmployeeType employeeType = EmployeeType.INTERN;

    public InternEmployee(double baseSalary) {
        this.baseSalary = employeeType.adjustBaseSalary(baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public Employee getEmployeeType() {
        return null;
    }

    @Override
    public String toString() {
        return "InternEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + employeeType +
                '}';
    }
}
