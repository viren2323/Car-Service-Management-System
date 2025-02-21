import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        ParkingService parkingService = ParkingService.getInstance();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Car Service Center");
            System.out.println("Press 1 for create billing.");
            System.out.println("Press 2 for Check Parking.");
            System.out.println("Press 3 for exit.");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        garageService.addCustomer();
                        garageService.addService();
                        break;
                    case 2:
                        System.out.println("Enter Car Number: ");
                        String carNumber = sc.next();
                        parkingService.getParkingDetails(carNumber);
                        break;
                    case 3:
                        System.out.println("--------------Thank You--------------");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input");
                break;
            }
        }
    }
}