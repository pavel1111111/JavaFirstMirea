package ru.mirea.test.task17;

public class EmployeeTest {
    private static Employee retrieveEmployeeDataFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Danil");
        employee.setSalary(90.12);
        employee.setExtra(10);
        return employee;
    }

    public static void main(String[] args) {
        Employee model  = retrieveEmployeeDataFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Pavel");
        controller.setEmployeeSalary(1234);
        controller.setEmployeeExtra(0.12);
        System.out.println("\nUpdate...");
        controller.updateView();
    }
}
