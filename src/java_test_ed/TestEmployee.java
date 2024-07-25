package java_test_ed;

public class TestEmployee {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(3000, 500);
        Employee contractEmployee = new ContractEmployee(2500);
        Employee internEmployee = new InternEmployee(1500);

        printSalary(fullTimeEmployee);
        printSalary(contractEmployee);
        printSalary(internEmployee);

        System.out.println();

        printEmployeeInfo(fullTimeEmployee);
        printEmployeeInfo(contractEmployee);
        printEmployeeInfo(internEmployee);
    }

    private static void printSalary(Employee employee) {
        System.out.println(employee.getEmployeeType() + " Employee Salary: " + employee.calculateSalary());
    }

    private static void printEmployeeInfo(Employee employee) {
        System.out.println(employee.toString());
    }
}
