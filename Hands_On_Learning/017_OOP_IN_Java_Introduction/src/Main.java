class Vehicle {
    private int engine;
    private int chasis;
    private String carName;
    private float engineCC;

    // Constructor
    public Vehicle(String carName, int engine, int chasis, float engineCC) {
        this.carName = carName;
        this.engine = engine;
        this.chasis = chasis;
        this.engineCC = engineCC;
    }
    public Vehicle(){
        // this is how you call a constructor from another constructor
        // internally: new Vehicle("default", 1000, 0000, 1500.00f);
        this ("default", 1000, 0000, 1500.00f);
    }

    // Getter
    public String getCarName() {
        return carName;
    }

    // Setter
    public void changeCarName(String carName) {
        this.carName = carName;
    }

    // Optional: for debugging
    @Override
    public String toString() {
        return "Vehicle{" +
                "carName='" + carName + '\'' +
                ", engine=" + engine +
                ", chasis=" + chasis +
                ", engineCC=" + engineCC +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Basics of OOP in JAVA. Class, Objects, Constructors and Keywords");

        Vehicle v1 = new Vehicle("Toyota", 1011, 2012, 1500.0f);
        System.out.println("Car Name: " + v1.getCarName());
        // declaring of class
        Vehicle v2;
        // Initializing the class with new keyword along with userdefined constructor.
        v2= new Vehicle("Porsche", 1212, 9090, 5600.56f);

        // If no constructor is made by the user then default constructor is called. But in this example we are declaring the constructor by ourselves so we need to declare the default constructor also.
        Vehicle v3 = new Vehicle();
        v3.changeCarName("Maruti-Suzuki-Alto");
        System.out.println(v3.toString());

        v1.changeCarName("BMW");
        System.out.println("Updated Car Name: " + v1.getCarName());
    }
}
