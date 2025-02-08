public class BankAccount{
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(){
        balance = 0.0;
    }

    public BankAccount(String accountname , String number , Double bal){
        accountHolderName = accountname;
        accountNumber = number;
        balance = bal;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public void getDetails(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.printf("Balance: %.2f",balance);
    }

    public static void main(String[] args){
        BankAccount account1 = new BankAccount("John Snow","123456789",1000.0);
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.getDetails();
    }
}