public class Car {
    private String name;
    private String model;
    private String carNumber;

    public Car(String name, String model, String carNumber) {
        this.name = name;
        this.model = model;
        this.carNumber = carNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCarNumber() {
        return carNumber;
    }
}