import java.util.ArrayList;

public class EmployeService {
   ArrayList<Employee> getemployee(){
        EmployeRepository employeRepository=new EmployeRepository();
        return employeRepository.getemployedata();
    }
}
