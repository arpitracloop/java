import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        new Thread(()->{
            System.out.println("Printing from the Runnable");
            //System.out.format("Printing line %d from Runnable",2);


        }).start();

        Employee john = new Employee("John",22);
        Employee harry = new Employee("Harry",21);
        Employee jack = new Employee("Jack",23);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(harry);
        employees.add(jack);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees,(Employee employee1, Employee employee2)->
                employee1.getName().compareTo(employee2.getName()));

        for(Employee employee:employees)
        {
            System.out.println(employee.getName());
        }



    }
}

class Employee
{
    private String name;
    private int age;

    //Constructor
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Getters and Setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}







//class CodeToRun implements Runnable
//{
//    @Override
//    public void run() {
//        System.out.println("Printing from runnable");
//    }
//}