
import java.util.*;
public class Main {
    
    public static void main(String[] args){
        try{
        Scanner in = new Scanner(System.in);

        
        SavingsAccount bank = new SavingsAccount(in.nextInt());
    
        in.nextLine();
    
       
        double deposit = in.nextDouble();
        in.nextLine();
        
       
        double withdraw = in.nextDouble();
        in.nextLine();
        
        
        
        System.out.println("Savings Account " + bank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());
        bank.deposit(deposit);
        
        System.out.println("Savings Account " + bank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());
        bank.withdraw(withdraw);
        System.out.println("Savings Account " + bank.getAccountNumber() + " Current balance: " + bank.getCurrentBalance());

        CheckingAccount checkbank = new CheckingAccount(in.nextInt());
       
        in.nextLine();
      
        double checkdeposit = in.nextDouble();
        in.nextLine();
        
        
        double checkwithdraw = in.nextDouble();
        in.nextLine();
        

        System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: " + checkbank.getCurrentBalance());
        checkbank.deposit(checkdeposit);

        System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: " + checkbank.getCurrentBalance());
        checkbank.withdraw(checkwithdraw);
        System.out.println("Checking Account " + checkbank.getAccountNumber() + " Current balance: " + checkbank.getCurrentBalance());

        }

        catch (Exception e){
            System.out.println("Invalid Input");
        }


    }
}
