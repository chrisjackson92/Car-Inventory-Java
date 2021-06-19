/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author chris
 */
public class Car {
    Scanner input = new Scanner(System.in);

    // members of the class
    private String vin = "";
    private String model = "";
    private int year;
    private double mileage;
    private double price;

    public Car() {

    }

    // define class in constructor
    public Car(String vin, String model, int year, double mileage, double price) {

        // set definitions to the attributes
        this.vin = vin;
        this.model = model;
        if (year > 1970) {
            this.year = year;
        }
        if (mileage >= 0) {
            this.mileage = mileage;
        }
        if (price > 1000) {
            this.price = price;
        }
    }

    public String getVin() { // public (return type) method name with parenthesis
        return vin; // return the member;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(int year) throws InputMismatchException {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) throws InputMismatchException {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InputMismatchException {
        this.price = price;
    }

    public String toString() {
        return String.format("Vin: %s %nModel: %s %nYear: %s %nMileage: %s %nPrice: %s %n%n", vin, model, year, mileage,
                price);
    }

    public void makeChange(int changeThis) {

        if (changeThis == 1) {
            System.out.println("Enter new vin number: ");
            String newVin = input.next();
            setVin(newVin);
        }

        if (changeThis == 2) {
            System.out.println("Enter new model number: ");
            String newModel = input.next();
            setModel(newModel);
        }

        if (changeThis == 3) {

            System.out.println("Enter new year number: ");
            try {
                int newYear = input.nextInt();
                setYear(newYear);
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Please enter a whole  number.");
                int newYear = input.nextInt();
                setYear(newYear);
            }

        }

        if (changeThis == 4) {
            System.out.println("Enter new mileage number: ");
            try {
                double newMileage = input.nextDouble();
                setMileage(newMileage);
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Please enter a positive number.");
                double newMileage = input.nextDouble();
                setMileage(newMileage);
            }
        }

        if (changeThis == 5) {
            System.out.println("Enter new price number: ");
            try {
                double newPrice = input.nextDouble();
                setPrice(newPrice);
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Please enter a number above 1000.");
                double newPrice = input.nextDouble();
                setPrice(newPrice);
            }

        }
    }
}