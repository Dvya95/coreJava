import java.util.ArrayList;

public class EmployeRepository {
    ArrayList<Employee> getemployedata() {
        ArrayList<Employee> list =new ArrayList<>();
        Employee employee = new Employee(123, "divya");
        Employee employee1 = new Employee(125, "riyhu");
        Employee employee2 = new Employee(126, "ddanu");
        Employee employee4 = new Employee(128, "yhu");
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee4);
        return list;


    }

}
