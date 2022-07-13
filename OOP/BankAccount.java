package OOP;

public class BankAccount
{
    private int accountNumber;
    private double balance; 
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setCustName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int getAccNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getCustName()
    {
        return customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public double deposit(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Invalid value");

            return balance;
        }

        return balance + amount;
    }

    public double withdraw(double amount)
    {
        if(amount < 0)
        {
            System.out.println("Invalid value");

            return balance;
        }
        
        if(balance < 0)
        {
            System.out.println("Insufficient fund");

            return 0;
        }

        return balance - amount;
    }
}