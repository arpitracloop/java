public class Main
{
    public static void main(String[] args)
    {
        Customer customer = new Customer("James",55);

        Customer anotherCustomer;

        anotherCustomer = customer;

        anotherCustomer.setBalance(20);

        System.out.println("Balance for customer "+ customer.getBalance());
    }
}
