package level4_형준쌤;

public class ContractEmployee implements Employee{
    public double baseSalary;
    private Employee employeeType;

    public ContractEmployee(double baseSalary ) {
        this.baseSalary = baseSalary;
        this.employeeType = EmployeeType.CONTRACT;
    }

    @Override
    public double calcullateSalary() {
        return employeeType.;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return null;
    }
}
