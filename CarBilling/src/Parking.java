public class Parking {
    private int pillarNo;
    private Car car;

    public Parking(int pillarNo, Car car) {
        this.pillarNo = pillarNo;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public int getPillarNo() {
        return pillarNo;
    }
}