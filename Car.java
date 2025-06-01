public class Car {
   
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        if (rentalPricePerDay >= 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Invalid! Must be greater than 0.");
            this.rentalPricePerDay = 0;
        }
        this.isAvailable = true; 
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRentalPricePerDay(double price) {
        if (price >= 0) {
            this.rentalPricePerDay = price;
        } else {
            System.out.println("Rental price cannot be negative.");
        }
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    // Method to return the car
    public void returnCar() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car was not rented.");
        }
    }

    public void printCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price/Day: $" + rentalPricePerDay);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Rented"));
    }

    public static void main(String[] args) {
        Car car1 = new Car("Avay", "Lama", 555.0);

        System.out.println("Initial Car Information : ");
        car1.printCarDetails();
        
        System.out.println("Renting the car");
        car1.rentCar();

        System.out.println("Renting again");
        car1.rentCar();

        System.out.println("Returning the car");
        car1.returnCar();

        System.out.println("Final Car Information : ");
        car1.printCarDetails();
    }
}
