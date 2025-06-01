import java.util.Scanner;

public class SimpleInterest {
    private double principal;//attributes
    private double time;
    private double rate;
    public void setPrincipal(double principal) { // Setter 
        this.principal = principal;
    }
    public void setTime(double time) {
        this.time = time;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getPrincipal() {// Getter 
        return principal;
    }

    public double getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }
    public double calculateInterest() {
        return (principal * time * rate) / 100;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleInterest si = new SimpleInterest();

        // Take input from user
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        si.setPrincipal(principal);

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();
        si.setTime(time);

        System.out.print("Enter rate (per annum): ");
        double rate = scanner.nextDouble();
        si.setRate(rate);
       System.out.println("\n--- Simple Interest Details ---");
        System.out.println("Principal: " + si.getPrincipal());
        System.out.println("Time (in years): " + si.getTime());
        System.out.println("Rate (per annum): " + si.getRate() + "%");
        System.out.println("Simple Interest: " + si.calculateInterest());

        scanner.close();
    }
}
