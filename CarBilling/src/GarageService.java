import java.util.*;

public class GarageService {

    Customer customer;
    Map<String, Customer> customerMap;
    List<Service> availableService;
    Scanner sc = new Scanner(System.in);

    public GarageService() {
        this.customerMap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadService();
    }

    private void loadService(){
        availableService.add(new Service("Car Wash", 700));
        availableService.add(new Service("Car Paint", 2000));
        availableService.add(new Service("Tyre Change", 3000));
        availableService.add(new Service("Oiling", 500));
        availableService.add(new Service("Puncture", 50));
    }

    public void addCustomer(){
        System.out.println("Enter Customer Name: ");
        String name = sc.next();
        System.out.println("Enter Customer Phone: ");
        String phone = sc.next();
        System.out.println("Enter Car Name: ");
        String carName = sc.next();
        System.out.println("Enter Car Model: ");
        String carModel = sc.next();
        System.out.println("Enter Car Number: ");
        String carNumber = sc.next();

        Car car = new Car(carName, carModel, carNumber);
        customer = new Customer(name, phone, car);
        customerMap.put(carNumber, customer);
    }

    public void addService(){
        Invoice invoice = new Invoice(customer);
        while (true){
            System.out.println();
            System.out.println("------------Available Service------------");
            for (int i = 0; i < availableService.size(); i++) {
                Service service = availableService.get(i);
                System.out.println((i+1) + " " + service.getName() + " : Rs. " + service.getPrice());
            }
            System.out.println();
            System.out.println("Enter service number what you want to do (0 for finished): ");
            int choice = sc.nextInt();
            if(choice==0) break;
            if(choice>0 && choice<=availableService.size())
                invoice.addService(availableService.get(choice-1));
            else System.out.println("Invalid choice.");
        }
        invoice.printInvoice();
        System.out.println();
        System.out.println("If you want to Parked the car press 1 or 0 for exit : ");
        try{
            int ch = sc.nextInt();
            if (ch==1) {
                ParkingService parkingService = ParkingService.getInstance();
                parkingService.parkedCar(customer.getCar());
                System.out.println("Car Parked. Thank You!");
            }else {
                System.out.println("Exiting...");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

}
