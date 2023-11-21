import java.util.*;

public class Waiter extends Employee {
private int tableNumber;
private double tip;
private double salary;

public ArrayList tips = new ArrayList<>();

public Waiter(String name) {
super(name);
}

public int getTableNumber() {
return tableNumber;
}

public void setTableNumber(int tableNumber) {
this.tableNumber = tableNumber;
}

public double getTip() {
return tip;
}

public void setTip(double tip) {
this.tip = tip;
tips.add(tip);
}

public double getSalary() {
return salary;
}

public void setSalary(double salary) {
this.salary = salary;
}

public double totalTip(ArrayList<Double> tips) {
double totalTip = 0.0;
for (int i = 0; i < tips.size(); i++) {
totalTip += tips.get(i);
}
return totalTip;
}

public double totalSalary() {
return salary + totalTip(tips);
}

public String employeeTask() {
return super.getName() + " is the waiter of " + super.barName + " and has a salary of " + totalSalary();
}
}