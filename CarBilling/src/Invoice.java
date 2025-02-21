import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Customer customer;
    private List<Service> serviceList;
    private double totalPrice;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
    }

    public void addService(Service service){
        this.serviceList.add(service);
        totalPrice += service.getPrice();
        System.out.println("Service Done");
    }

    public void printInvoice() {
        System.out.println("--------------Invoice--------------");
        System.out.println();
        System.out.println("Name: " + customer.getName() + " | Phone: " + customer.getPhone() +
                " Car Name: " + customer.getCar().getName() + " Model: " + customer.getCar()
                .getModel());
        System.out.println();
        for (int i = 0; i < serviceList.size(); i++) {
            Service service = serviceList.get(i);
            System.out.println((i + 1) + " " + service.getName() + " : Rs. " + service.getPrice());
        }
        System.out.println();
        System.out.println("Total : " + totalPrice);
        System.out.println();
        System.out.println("--------------Thank You--------------");
    }
}
