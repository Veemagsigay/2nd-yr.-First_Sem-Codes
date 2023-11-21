
import java.util.*;
public class Main {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        SavingsAccount bank = new SavingsAccount(in.nextInt());
    
        in.nextLine();
    
       
        double deposit = in.nextDouble();
        in.nextLine();
        bank.deposit(deposit);
       
        double withdraw = in.nextDouble();
        in.nextLine();
        bank.withdraw(withdraw);
        
        
        System.out.println("Savings account " + bank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());
        System.out.println("Deposited: " + deposit);

        
        System.out.println("Savings account " + bank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());
        System.out.println("Withdrawed: " + withdraw);

        CheckingAccount checkbank= new CheckingAccount(in.nextInt());
       
        in.nextLine();
      
        double checkdeposit = in.nextDouble();
        in.nextLine();
        checkbank.deposit(checkdeposit);
        
        double checkwithdraw = in.nextDouble();
        in.nextLine();
        checkbank.withdraw(checkwithdraw);

        System.out.println("Savings account " + checkbank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());
        System.out.println("Deposited: " + checkdeposit);

        System.out.println("Savings account " + checkbank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());
        System.out.println("Withdrawed: " + checkwithdraw);

        


    }
}
