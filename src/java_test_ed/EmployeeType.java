package java_test_ed;

public enum EmployeeType {
    FULL_TIME(1.0),
    CONTRACT(0.8),
    INTERN(0.5);

    private final double baseSalaryMultiplier;

    EmployeeType(double baseSalaryMultiplier) {
        this.baseSalaryMultiplier = baseSalaryMultiplier;
    }

    public double adjustBaseSalary(double baseSalary) {
        return baseSalary * baseSalaryMultiplier;
    }
}
