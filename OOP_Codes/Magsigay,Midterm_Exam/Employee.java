public abstract class Employee {
private String name;
protected final String barName;

public abstract String employeeTask();

public abstract void setSalary(double salary);

public Employee(String name) {
this.name = name;
this.barName = "JAVA Bar";
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}
}