import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

ArrayList tableNumbers = new ArrayList<>();

String MangerName, CachName, WaitName, userInput;
double MangerSalary, CashSalary, WaiterSalary;
int tableNumber;
double tip;

MangerName = in.nextLine();
Manager manager = new Manager(MangerName);
MangerSalary = in.nextDouble();
manager.setSalary(MangerSalary);
in.nextLine();

CachName = in.nextLine();
Cashier cashier = new Cashier(CachName);
CashSalary = in.nextDouble();
cashier.setSalary(CashSalary);
in.nextLine();

WaitName = in.nextLine();
Waiter waiter = new Waiter(WaitName);
WaiterSalary = in.nextDouble();
waiter.setSalary(WaiterSalary);
in.nextLine();

boolean selection = true;

while (selection) {
tableNumber = in.nextInt();
tableNumbers.add(tableNumber);
in.nextLine();
tip = in.nextDouble();
waiter.setTip(tip);
in.nextLine();
userInput = in.nextLine();

if (userInput.equalsIgnoreCase("n")) {
selection = false;
break;
}
}

System.out.println(manager.employeeTask());
System.out.println(cashier.employeeTask());
System.out.println(waiter.employeeTask());
System.out.print(waiter.getName() + " serviced the following table(s) ");
for (int i = 0; i < tableNumbers.size(); i++) {
if ((i + 1) < tableNumbers.size()) {
System.out.print(tableNumbers.get(i) + ", ");
} else if ((i + 1) == tableNumbers.size()) {
System.out.print(tableNumbers.get(i));
}

}
System.out.println("\n" + cashier.getName() + " has taken a total of " + tableNumbers.size() + " order(s)");

in.close();
}
}