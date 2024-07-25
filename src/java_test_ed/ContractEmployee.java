package java_test_ed;

public class ContractEmployee implements Employee{

    private double baseSalary;
    private final EmployeeType employeeType = EmployeeType.CONTRACT;

    public ContractEmployee(double baseSalary) {
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
        return "ContractEmployee{" +
                "baseSalary=" + baseSalary +
                ", employeeType=" + employeeType +
                '}';
    }
}
