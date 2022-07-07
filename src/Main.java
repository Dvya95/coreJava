import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        EmployeService employeService = new EmployeService();
        ArrayList<Employee> list = employeService.getemployee();
        list
                .stream()
                .filter(employee -> employee.getEmpName().startsWith("d"))
                .collect(Collectors.toList())
                .forEach(employee -> System.out.println(employee.getEmpId() + employee.getEmpName()));
        ;
    }
}