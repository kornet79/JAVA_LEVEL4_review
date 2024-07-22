package level4_형준쌤;

public class FullTimeEmployee implements Employee{
    private double baseSalary;
    private double bonus;
    private Employee employeeType;

    public FullTimeEmployee(double baseSalary, double bonus , Employee employee) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.employeeType = EmployeeType.FULL_TIME;
    }

    @Override
    public double calcullateSalary() {
        return employeeType.calcullateSalary(baseSalary) + bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

}
