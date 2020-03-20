package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
    int reg, salary;
    String name;

    public Employee(int reg, int salary, String name){
        super();
        this.reg = reg;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "reg=" + reg + ", salary=" + salary +
                ", name=" + name + '\'' +
                '}';
    }

    public int compareTo(Employee employee){
      //  return salary>employee.salary?1:-1;
        return name.length()>employee.name.length()?1:-1;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee(102,40878,"Mark"));
        emp.add(new Employee(104,74534,"Jannette"));
        emp.add(new Employee(134,78343,"Mike"));
        emp.add(new Employee(154,26374,"Hellen"));

        Collections.sort(emp, (i, j) -> i.salary>j.salary?1:-1);

        for (Employee employee: emp){
            System.out.println(employee);
        }
    }
}
