package Lab_Assignments.Vechile.CarDemo;


public class Car extends Vehicle {
    private int carId;
    private String carName;

    public Car(int carId, String carName) {
        super(carId, carName);
        this.carId = carId;
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Car Name: " + carName;
    }
}

