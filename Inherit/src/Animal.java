public class Animal {
    private String Name;
    private int body;
    private int size;
    private int brain;
    private int weight;

    //Constructor

    public Animal(String name, int body, int size, int brain, int weight) {
        Name = name;
        this.body = body;
        this.size = size;
        this.brain = brain;
        this.weight = weight;
    }

    //Gettters and Setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Methods

    public void eat()
    {
        System.out.println(getName()+" is eating...");
    }

    public void move(int speed)
    {
        System.out.println("Animal is moving at "+speed);
    }

    public void run()
    {
        System.out.println("Animal is running...");
    }
}
