package level4_형준쌤;

public enum EmployeeType {
        FULL_TIME(1.0),
        CONTRACT(0.8),
        INTERN(0.5);

        private final double salaryMultiplier;
        // 어차피 바꿔지지 않는 코드이기 때문에 앞에 final을 붙여도 된다.

    EmployeeType(double salaryMultiplier) {
        this.salaryMultiplier = salaryMultiplier;
    }

    public double adjustBassSalary(double baseSalary) {
        return baseSalary * salaryMultiplier;
    }
}
