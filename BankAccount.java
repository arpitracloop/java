public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //Setters
    public void setAccountNumber(long accnum)
    {
        this.accountNumber = accnum;
    }
    public void setBalance(double bal)
    {
        this.balance = bal;
    }
    public void setCustomerName(String name)
    {
        this.customerName = name;
    }
    public void setEmail(String mail)
    {
        this.email = mail;
    }
    public void setPhoneNumber(int num)
    {
        this.phoneNumber = num;
    }

    //Getters

    public long getAccountNumber()
    {
        return this.accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public String getEmail()
    {
        return this.email;
    }

    public int getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void deposite(double amount)
    {
        this.balance += amount;
        System.out.println("Balance :" + getBalance());
    }
    public void withdraw(double money)
    {
        if(this.balance < money)
        {
            System.out.println("Insufficient Funds");
        }
        else
        {
            this.balance -= money;
            System.out.println("Balance :" + getBalance());
        }
    }
}
