public class Customer
{
    private String name;
    private double balance;

    //Customer
    public Customer(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
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

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}
