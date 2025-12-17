package day8_streamAPIs_map_min_max_methods.notesQuestions.map_collect.question2;

public class Car {
    // Fields
    private String brand;
    private String model;
    private double price;
    // Constructor
    public Car(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Getter-Setter Methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overridden toString()
    public String toString(){
        return "Car [Brand: " + this.brand + ", Model: " + this.model + ", Price: " + this.brand + "]";
    }
}
