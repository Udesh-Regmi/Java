// WAP to illustrate constructor overloading using rectangle class 

class Rectangle{
    double width, height; 
    String areaName; 

    Rectangle(){
        width = height = 1; 
    }
    Rectangle(double side, String areaName){
        width = height = side; 
        this.areaName = areaName;

    }
    Rectangle( double width, double height, String areaName){
        this.width = width; 
        this.height = height; 
        this.areaName = areaName;
    }
    public void displayArea(){
        double area= width*height; 
        System.out.println(" The area of the rectangle needs to be placed in "+ this.areaName +" having length " + this.width + " and height of " + this.height + " is " + area);
    }
}



public class ConstructorOverloadingRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); 
        rect1.displayArea();
        Rectangle rect2 = new Rectangle(32.2, 11.4, " Kathmandu"); 
        rect2.displayArea();
        Rectangle rect3 = new Rectangle(90.21, "Pokhara"); 
        rect3.displayArea();
        
    }
}