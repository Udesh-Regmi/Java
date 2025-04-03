import java.util.Scanner;

// Customer class with overloaded display methods
class Customer {
    private String customerName;
    private int customerAccountNo;
    private String customerMobileNo;

    // Constructor to initialize customer details
    public Customer(String customerName, int customerAccountNo, String customerMobileNo) {
        this.customerName = customerName;
        this.customerAccountNo = customerAccountNo;
        this.customerMobileNo = customerMobileNo;
    }

    // Function Overloading: Display customer info by account number
    public void displayInfo(int accountNo) {
        if (this.customerAccountNo == accountNo) {
            System.out.println("Customer Found:");
            System.out.println("Account No: " + customerAccountNo);
            System.out.println("Name: " + customerName);
            System.out.println("Mobile No: " + customerMobileNo);
        }
    }

    // Function Overloading: Display all customer details
    public void displayInfo() {
        System.out.println("\nCustomer Details:");
        System.out.println("Account No: " + customerAccountNo);
        System.out.println("Name: " + customerName);
        System.out.println("Mobile No: " + customerMobileNo);
    }
}

// Bank class to manage multiple customers
class Bank {
    private Customer[] customers = new Customer[10]; // Initial array size
    private int customerCount = 0;

    // Method to add a new customer
    public void addCustomer(String name, int accountNo, String mobileNo) {
        if (customerCount == customers.length) {
            // Resize the array if it's full
            Customer[] newCustomers = new Customer[customers.length * 2];
            System.arraycopy(customers, 0, newCustomers, 0, customers.length);
            customers = newCustomers;
        }
        customers[customerCount++] = new Customer(name, accountNo, mobileNo);
        System.out.println("Customer Added Successfully!");
    }

    // Method to search and display a customer by account number
    public void findCustomer(int accountNo) {
        boolean found = false;
        for (int i = 0; i < customerCount; i++) {
            if (customers[i] != null) {
                customers[i].displayInfo(accountNo);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Customer with Account No " + accountNo + " not found.");
        }
    }

    // Method to display all customers
    public void displayAllCustomers() {
        if (customerCount == 0) {
            System.out.println("No customers found.");
        } else {
            for (int i = 0; i < customerCount; i++) {
                if (customers[i] != null) {
                    customers[i].displayInfo();
                }
            }
        }
    }
}

// Main class to execute the program
public class FunctionOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. View Customer by Account No");
            System.out.println("3. View All Customers");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Account No: ");
                    int accountNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Mobile No: ");
                    String mobileNo = scanner.nextLine();
                    bank.addCustomer(name, accountNo, mobileNo);
                    break;
                    
                case 2:
                    System.out.print("Enter Account No to Search: ");
                    int searchAccountNo = scanner.nextInt();
                    bank.findCustomer(searchAccountNo);
                    break;

                case 3:
                    bank.displayAllCustomers();
                    break;
                
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
