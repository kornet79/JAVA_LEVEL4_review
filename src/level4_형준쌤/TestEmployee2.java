package level4_형준쌤;

public class TestEmployee2 {
    public static void main(String[] args) {
        EmployeeType[] employeeTypes = {new FullTimeEmployee(3000,500), new ContractEmployee(2500) , new InternEmployee(1000)};
        System.out.println("Full" + employeeTypes[EmployeeType.FULL_TIME.ordinal()]);
        System.out.println("Full" + employeeTypes[EmployeeType.FULL_TIME.ordinal()]);
        System.out.println("Full" + employeeTypes[EmployeeType.FULL_TIME.ordinal()]);

        System.out.println();

        for (Employee emp : employeeTypes) {
            info(emp);
        }



    }
    private static void info(EmployeeType emp) {
        System.out.println(emp.toString());
    }
}
