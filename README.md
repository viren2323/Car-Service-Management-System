#Car Service Management System
A Java-based console application that manages car servicing, billing, and parking allocation. The system allows customers to register, select services, generate invoices, and park their cars efficiently.

Features
✅ Customer Registration – Add customer details and car information.
✅ Service Management – Select services like car wash, oil change, and more.
✅ Automated Billing – Generate invoices with service details and total cost.
✅ Parking Allocation – Assign a unique pillar number for parked cars.
✅ Parking Lookup – Retrieve parking details using the car number.
✅ Exception Handling – Ensures valid inputs and smooth execution.


Technologies Used
Java (Core logic, OOP)
Collections API (HashMap, ArrayList, HashSet)
Singleton Design Pattern (for Parking Service)
Exception Handling (to manage invalid inputs)

Project Structure

Car Service Management System  
 ├── CarServiceAndBillingsApp.java  # Main Application  
 ├── Car.java                      # Car details  
 ├── Customer.java                  # Customer details  
 ├── Service.java                    # Service details  
 ├── GarageService.java              # Manages services and customers  
 ├── Invoice.java                    # Generates bills  
 ├── Parking.java                    # Parking details  
 ├── ParkingService.java             # Handles parking management  
