public class Caars
{
    private int engine;
    private int cylinder;
    private int wheels;

    private String Name;

    public Cars(int cylinder, String name) {
        this.cylinder = cylinder;
        this.Name = name;
        this.wheels=4;
        this.engine=1;
    }
//a
//    public Cars(String name)
//    {
//
//        this.Name=name;
//    }
    public void startEngine ()
    {
        System.out.println("Staring engine...");

    }
    public void accelerate ()
    {
        System.out.println("Accelerating...");
    }
    public void brake ()
    {
        System.out.println("Applying Brakes...");
    }

    public String getName() {
        return Name;
    }

    public int getCylinder() {
        return cylinder;
    }
}


class XUV extends Caars
{
    public XUV(int cylinder, String name) {
        super(cylinder, name);
    }

//    public XUV(String name) {
//        super(name);
//    }

    @Override
    public void startEngine() {
        System.out.println("XUV's engine is going to start...");
    }

    @Override
    public void accelerate() {
        System.out.println("XUV is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("XUV is applying brake...");
    }
}


class Fortuner extends Cars
{
    public Fortuner(int cylinder, String name) {
        super(cylinder, name);
    }
//
//    public Fortuner(String name) {
//        super(name);
//    }

    @Override
    public void startEngine() {
        System.out.println("Fortuner's engine is going to start...");
    }

    @Override
    public void accelerate() {
        System.out.println("Fortuner is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Fortuner is applying brake...");
    }
}

class Tesla extends Cars
{
    public Tesla(int cylinder, String name) {
        super(cylinder, name);
    }
    //    public Tesla(String name) {
//        super(name);
//    }

    @Override
    public void startEngine() {
        System.out.println("Tesla's engine is going to start...");
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Tesla is applying brake...");
    }
}
public class Car
{
    public static void main(String[] args) {
        Cars car = new Cars(4,"XUV");
        car.accelerate();
        car.startEngine();
        car.brake();
    }
}