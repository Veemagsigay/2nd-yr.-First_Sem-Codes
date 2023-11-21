public class Cashier extends Employee {
private double salary;

public Cashier(String name) {
super(name);
}

public double getSalary() {
return salary;
}

public void setSalary(double salary) {
this.salary = salary;
}

public String employeeTask() {
return super.getName() + " is the new cashier of " + super.barName + " and has a salary of " + getSalary();
}
}