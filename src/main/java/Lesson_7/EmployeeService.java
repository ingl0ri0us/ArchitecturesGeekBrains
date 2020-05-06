package Lesson_7;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "firstName1", "lastName1"),
                new Employee(2, "firstName2", "lastName2"),
                new Employee(3, "firstName3", "lastName3"));
    }
}
