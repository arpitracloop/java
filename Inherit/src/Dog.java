public class Dog extends Animal {
    private int tail;
    private int eyes;
    private int legs;
    private int teeth;


    public Dog(String name, int brain, int weight, int tail, int eyes, int legs, int teeth) {
        super(name, 1, 1, brain, weight);
        this.tail = tail;
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;


    }

    private void chew() {
        System.out.println(getName() + " is chewing...");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating...");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println(getName()+" is walking...");
        move(5);
    }

    public void run()
    {
        System.out.println(getName()+" is running...");
        move(10);
    }
}
