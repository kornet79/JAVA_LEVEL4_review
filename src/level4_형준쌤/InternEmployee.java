package level4_형준쌤;

public class InternEmployee implements Employee{
    private double basseSalary;
    private EmployeeType employeeType;

    public InternEmployee(double basseSalary, EmployeeType employeeType) {
        this.basseSalary = basseSalary;
        this.employeeType = employeeType;
    }

    @Override
    public double calcullateSalary() {
        return employeeType.adjustBassSalary(basseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

}
