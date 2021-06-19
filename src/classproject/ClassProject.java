
package classproject;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class ClassProject {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<Car> carList = new ArrayList<>();
        int userMenuSelection = 0;
        int objectCount = 0;
        do{
            System.out.println("Menu Options \n"
                    + "1. Add new car to list. \n"
                    + "2. Remove a car from list. \n"
                    + "3. Change a car in the list\n"
                    + "4. Display details of a car. \n"
                    + "5. Display details of all cars. \n"
                    + "6. Get average mileage from all the cars.\n"
                    + "7. Get cash offer for a car.\n");
            System.out.println("Please enter the number of the action to perform or 0 to end the program.");
            userMenuSelection = input.nextInt();
            menuSelection(userMenuSelection, carList);
            
        }while(userMenuSelection != 0);
    }
    
    static public void menuSelection(int menuSelection, ArrayList<Car> carList){
        if (menuSelection == 1){
                System.out.println("Enter vin number of the new car.");
                String vin1 = input.next();
                System.out.println("Enter model of the new car.");
                String model = input.next();
                System.out.println("Enter year of the new car.");
                int year = input.nextInt();
                System.out.println("Enter mileage of the new car.");
                double mileage = input.nextDouble();
                System.out.println("Enter price of the new car.");
                double price = input.nextDouble();
                
                Car car = new Car(vin1, model, year, mileage, price);
                carList.add(car);
            }
            if (menuSelection == 2){
                System.out.println("Enter vin of the car to remove.");
                String vin = input.next();
                System.out.println("Enter model of the new car to remove.");
                String model = input.next();
                System.out.println("Enter year of the new car to remove.");
                int year = input.nextInt();
                System.out.println("Enter mileage of the new car to remove.");
                double mileage = input.nextDouble();
                System.out.println("Enter price of the new car to remove.");
                double price = input.nextDouble();
                
                Car car = new Car(vin, model, year, mileage, price);
                carList.remove(car);
            }
            if (menuSelection == 3){
                System.out.println("Which car do you want make a change to? ");
                int carChoice = input.nextInt();
        
                Car car = carList.get(carChoice);
        
                System.out.printf("Car Edit List"
                                + "1. Vin%n"
                                + "2. Model%n"
                                + "3. Year%n"
                                + "4. Mileage%n"
                                + "5. Price%n%n"
                        + "Enter edit choice: ");
                int editChoice = input.nextInt();
                car.makeChange(editChoice);
            }
            
            
            if (menuSelection == 4){
                System.out.println("Enter the number of the car you want to view. ");
                int carChoice = input.nextInt();
                Car car = carList.get(carChoice);
                System.out.println(car.toString());
            }
            if (menuSelection == 5){
                for (int i = 0; i < carList.size(); i++){
                    Car car = carList.get(i);
                    System.out.println(i + ".\n" +car.toString() + "\n ");
                }
            }
            if (menuSelection == 6){
                double totalMileage = 0;
                for (int i = 0; i < carList.size(); i++){
                    Car car = carList.get(i);
                    totalMileage = totalMileage + car.getMileage();
                }
                double averageMileage = totalMileage / carList.size();
                System.out.println("Average mileage: " + averageMileage);
            }
            if (menuSelection == 7){
                System.out.println("Enter the number of the car you want to view. ");
                int carChoice = input.nextInt();
                Car car = carList.get(carChoice);
                System.out.printf("Car: %s%n"
                                + "Price: $%.2f%n%n", car.getModel(), car.getPrice());
                System.out.printf("How do you feel about the car? (1. likes the car, 2. somewhat likes the car, 3. not easily swayed)");
                int carSatisfaction = input.nextInt();
                if (carSatisfaction == 1){
                    double currentPrice = car.getPrice();
                    double discountPrice = currentPrice - 100;
                    System.out.printf("Car: %s%n"
                                    + "Original price: $%.2f%n"
                                    + "discount: $%.2f%n"
                                    + "New price: $%.2f%n%n",car.getModel(), currentPrice, 100.0, discountPrice);
                }
                if (carSatisfaction == 2){
                     double currentPrice = car.getPrice();
                    double discountPrice = currentPrice - 200;
                    System.out.printf("Car: %s%n"
                                    + "Original price: $%.2f%n"
                                    + "discount: $%.2f%n"
                                    + "New price: $%.2f%n%n",car.getModel(), currentPrice, 200.0, discountPrice);
                }
                if (carSatisfaction == 3){
                     double currentPrice = car.getPrice();
                    double discountPrice = currentPrice - 500;
                    System.out.printf("Car: %s%n"
                                    + "Original price: $%.2f%n"
                                    + "discount: $%.2f%n"
                                    + "New price: $%.2f%n%n",car.getModel(), currentPrice, 500.0, discountPrice);
                }
            }
    }
    
}
/*
•	Ability to add a car to the array and set all of the values for it with input from the user
•	Ability to ask the user which car in the array they wish to change in some way, and then make that change. 
        (Hint: Have it in a separate method you are calling and print a message 
        and ask them what they want to change and number them so you can do a 
        separate If/Else or Switch. Then ask them for the value to change it to,
        and do it there. …don’t try to do it in the main menu.)
•	Display a message with all the data for a car the user chooses. 
•	Display the data for all the cars (currently in the array) for the user.
•	Display the average mileage for all of the cars on the lot.
•	Display the lowest price for all of the cars on the lot.

*/