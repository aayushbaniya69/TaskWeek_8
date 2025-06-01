// public class Employee {// Attributes
//     private String name;
//     private String jobTitle;
//     private double salary;
//     public Employee(String name, String jobTitle, double salary) { // Constructor
//         this.name = name;
//         this.jobTitle = jobTitle;
//         this.salary = salary;
//     }
//     public void setName(String name) {// Setter 
//         this.name = name;
//     }
//     public void setJobTitle(String jobTitle) {
//         this.jobTitle = jobTitle;
//     }
//     public void setSalary(double salary) {
//         this.salary = salary;
//     }
//     public String getName() { // Getter
//         return name;
//     }
//     public String getJobTitle() {
//         return jobTitle;
//     }
//     public double getSalary() {
//         return salary;
//     }
//     public double calculateRaise(double percentage) {
//         return salary + (salary * percentage / 100);
//     }

//     public void updateSalary(double percentage) {
//         this.salary = calculateRaise(percentage);
//     }
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Job Title: " + jobTitle);
//         System.out.println("Salary: " + salary);
//     }
//     public static void main(String[] args) {
//         Employee emp = new Employee("Alice", "Software Engineer", 50000);
//         System.out.println("Before Salary Update:");
//         emp.displayInfo();
//         emp.updateSalary(10); 
//         System.out.println("\nAfter 10% Raise:");
//         emp.displayInfo();
//     }
// }



public class Employee {
    private String name;
    private String employeeId;
    private double salary;
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = (salary >= 0) ? salary : 0;
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
    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Salary increased by " + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public void decreaseSalary(double amount) {
        if (amount > 0 && salary - amount >= 0) {
            salary -= amount;
            System.out.println("Salary decreased by " + amount);
        } else {
            System.out.println("Invalid amount. Salary cannot go below zero.");
        }
    }
    public void displayInfo() {
        System.out.println("\nEmployee Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "EMP001", 5000);

        emp.displayInfo();

        emp.increaseSalary(1000);  
        emp.decreaseSalary(2000);  
        emp.decreaseSalary(5000);  

        emp.displayInfo();
    }
}

