abstract class BankAccount{
    private String full_name;
    private long acc_no;
    private long balance;

    //Constructor 
    public BankAccount(String full_name, long acc_no, long balance){
        this.full_name = full_name;
        this.acc_no = acc_no;
        this.balance = balance;        
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    public String getName(){
        return full_name;
    }
    public void setName(){
        this.full_name = full_name;
    }

    public long getAccNo(){
        return acc_no;
    }
    public void setAccNo(){
        this.acc_no = acc_no;
    }

    public long getBal(){
        return balance;
    }
    public void setBal(){
        this.balance = balance;
    }



    public void accountInfo(){
        System.out.println("Name: " + full_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAcc extends BankAccount {
    public SavingsAcc(String full_name, long acc_no, long balance){
        super(full_name, acc_no, balance);
    }

    @Override
    public void accountInfo(){
        System.out.println("Full Name: " + getName());
        System.out.println("Account Number: " + getAccNo());
        System.out.println("Balance: " + getBal());
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount customer1 = new SavingsAcc("Aryan R", 1203456789, 100001000);
        BankAccount customer2 = new SavingsAcc("Ram", 1234568794 , 1023456);

        System.out.println("Aryan R's Account details: ");

        customer1.accountInfo();

        System.out.println();

        System.out.println("Ram's Account details");

        customer2.accountInfo();
        System.out.println();

        System.out.println("Aryan Deposits 5000");
        customer1.deposit(5000);

        System.out.println();
        customer1.accountInfo();

        System.out.println();

        System.out.println("Ram withdraws 1000");
        customer2.withdraw(1000);

        System.out.println();

        customer2.accountInfo();
    }
}