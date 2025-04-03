
package Lab_Assignments.Vechile;

import java.util.Scanner;

import Lab_Assignments.Vechile.CarDemo.*;

public class Packagedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarService carService = new CarService();

        while (true) {
            System.out.println("\n1. Add Car\n2. View All Cars\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Car Name: ");
                    String carName = scanner.nextLine();
                    carService.addCar(carId, carName);
                    break;
                case 2:
                    carService.displayAllCars();
                    break;
                case 3:
                    System.out.println("Exiting Program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

