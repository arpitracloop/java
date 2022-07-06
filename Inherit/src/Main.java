public class Main
{
    public static void main(String[] args) {
        Animal animal = new Animal("Google",1,1,1,50);

        Dog dog = new Dog("Barfi",1,40,1,2,4,20);
        dog.eat();
        dog.walk();
        //dog.move();
        dog.run();
    }
}
