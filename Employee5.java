public class Employee5 {

    private String name;
    private String employeeId;
    private double salary;

    public Employee5(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than 0.");
            this.salary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void adjustSalary(double amount) {
        if (salary + amount < 0) {
            System.out.println("Salary must be greater than 0.");
        } else {
            salary += amount;
            System.out.println("Salary updated. New salary: Rs." + salary);
        }
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: Rs." + salary);
    }

    public static void main(String[] args) {
        Employee5 emp1 = new Employee5("Avay Lama", "240521", 50000);

        System.out.println("First Employee Info:");
        emp1.printEmployeeDetails();

        emp1.setName("Avay Theeng");
        emp1.setEmployeeId("240522");

        System.out.println("Increasing salary by Rs. 6000");
        emp1.adjustSalary(6000); 

        System.out.println("Trying to decrease salary by Rs. 1000");
        emp1.adjustSalary(-1000); 

        System.out.println("Final Employee Info:");
        emp1.printEmployeeDetails();
    }
}
