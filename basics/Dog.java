//public class Dog extends Animal
//{
//    //private
//    private int eyes;
//    private int brain;
//    private int tail;
//
//    public Dog(String name, int size, int weight, int eyes, int brain, int tail)
//    {
//        super(name, 1, 1, size, weight);
//
//    }
//    public void walk()
//    {
//        System.out.println("Dog.walk() is called");
//        move();
//    }
//}

public class Dog extends Animal
{
    private int eyes;
    private int teeth;
    private int tail;
    private int legs;

    public Dog(String name, int size, int weight, int eyes, int theeth, int tail, int legs)
    {
        super(name,1,1,size,weight);
        this.eyes=eyes;
        this.legs=legs;
        this.teeth=teeth;
        this.tail=tail;

    }
}