import java.util.ArrayList;
import java.util.List;

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

public class Main {
    public static void main(String[] args) {
//        new Thread(()->{
//            System.out.println("Printing from the Runnable");
//            //System.out.format("Printing line %d from Runnable",2);
//        }).start();
        Employee john   = new Employee("John",22);
        Employee harry  = new Employee("Harry",21);
        Employee jack   = new Employee("Jack",23);
        Employee don    = new Employee("Don",25);

        List <Employee> employees = new ArrayList<>();

        employees.add(john);
        employees.add(harry);
        employees.add(jack);
        employees.add(don);

        for(Employee employee:employees)
        {
            System.out.println(employee.getName());
            new Thread(()-> System.out.println(employee.getAge())).start();
        }

//
////        Collections.sort(employees, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee employee1, Employee employee2) {
////                return employee1.getName().compareTo(employee2.getName());
////            }
////        });
//
//        Collections.sort(employees,( employee1,  employee2)->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for(Employee employee:employees)
//        {
//            System.out.println(employee.getName());
//        }
//
////        String sillyString = doStringStuff(new UpperConcat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase()+s2.toUpperCase();
////            }
////        },
////        employees.get(0).getName(),employees.get(1).getName());
////        System.out.println(sillyString);
//
//
//        //UpperConcat uc =(s1,s2)-> s1.toUpperCase()+s2.toUpperCase();  to use one expression in lambda expression
//
//
//        UpperConcat uc = ( s1, s2) -> {                               // to use multiple statement in lambda expression
//            String result = s1.toUpperCase() + " " + s2.toUpperCase();
//            return result;
//            //uc = ( s3, s4) -> s3.toUpperCase() +" "+ s4.toUpperCase();
//        };
//        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);
//
//        sillyString = doStringStuff(uc, employees.get(2).getName(), employees.get(3).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s =anotherClass.doSomething();
        System.out.println(s);
    }
    public final static  String doStringStuff(UpperConcat uc,String s1, String s2)
    {
        return uc.upperAndConcat(s1,s2);
    }
}

interface UpperConcat
{
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass{
    public String doSomething()
    {
        int i=0;

        UpperConcat uc =(s1,s2) ->{

            System.out.println("The lambda expression class is :"+getClass().getSimpleName());
            //System.out.println("i in the lambda expression = "+ i);
            String result = s1.toUpperCase()+s2.toUpperCase();
            return result;
        };




//        {
//            UpperConcat uc = new UpperConcat() {
//                @Override
//                public String upperAndConcat(String s1, String s2) {
//                    System.out.println("i within anonymous class = "+i);
//                    return s1.toUpperCase() + s2.toUpperCase();
//                }
//            };
            System.out.println("The another class is : " + getClass().getSimpleName());

            //i++;
//            System.out.println("i= "+i);

            return Main.doStringStuff(uc, "String1", "String2");


        }

        public void printValue()
        {
            int number = 25;
            Runnable r=()->
            {
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("The value is "+number);
            };
            new Thread(r).start();
        }
//        UpperConcat uc = (s1,s2) -> {
//            System.out.println("The lambda expression class is : "+getClass().getSimpleName());
//            String result = s1.toUpperCase()+s2.toUpperCase();
//            return result;
//        };

//        System.out.println("The anotherClass's name is:" +getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class name is: "+getClass().getSimpleName());
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }






//class CodeToRun implements Runnable
//{
//    @Override
//    public void run() {
//        System.out.println("Printing from runnable");
//    }
//}