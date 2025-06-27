package model;

import java.util.Objects;

public class Car {
    private final String vin; // Vehicle Identification Number
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String vin, String make, String model, int year, double price) {
        if (vin == null || vin.isEmpty()) {
            throw new IllegalArgumentException("VIN must not be empty");
        }
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getVin() { return vin; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return String.format("Car [VIN=%s, Make=%s, Model=%s, Year=%d, Price=%.2f]", vin, make, model, year, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
