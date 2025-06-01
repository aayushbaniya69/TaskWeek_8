public class Dog {// Attributes
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog(" ", " ");
        Dog dog2 = new Dog(" ", " ");
        dog1.setName("kaley");
        dog1.setBreed("aaa");
        dog2.setName("Tampu");
        dog2.setBreed("abbbb");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}
