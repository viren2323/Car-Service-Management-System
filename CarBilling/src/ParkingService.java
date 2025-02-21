import java.util.*;

public class ParkingService {
    private Map<String, Parking> parkingMap;
    private Set<Integer> occupiedPillars;
    private static ParkingService parkingService = new ParkingService();

    private ParkingService() {
        this.parkingMap = new HashMap<>();
        this.occupiedPillars = new HashSet<>();
    }

    public static ParkingService getInstance(){
        return parkingService;
    }

    public void parkedCar(Car car){
        Random random = new Random();
        int pillarNo = random.nextInt(100);
        while (occupiedPillars.contains(pillarNo)){
            pillarNo = random.nextInt(100);
        }
        Parking parking = new Parking(pillarNo, car);
        parkingMap.put(car.getCarNumber(), parking);
    }

    public void getParkingDetails(String carNumber){
        if(!parkingMap.containsKey(carNumber)) {
            System.out.println("There is no car parked with this number");
            return;
        }
        Parking parking = parkingMap.get(carNumber);
        System.out.println("-------------Parking Details-------------");
        System.out.println();
        System.out.println("Pillar Number : " + parking.getPillarNo());
        System.out.println("Car number : " + parking.getCar().getCarNumber());
        System.out.println("Car Name : " + parking.getCar().getName());
        System.out.println();
        System.out.println("-------------Thank You-------------");
    }
}
