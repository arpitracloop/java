public class Dog extends Animal
{
    //private
    private int eyes;
    private int brain;
    private int tail;

    public Dog(String name, int size, int weight, int eyes, int brain, int tail)
    {
        super(name, 1, 1, size, weight);

    }
    public void walk()
    {
        System.out.println("Dog.walk() is called");
        move();
    }
}
