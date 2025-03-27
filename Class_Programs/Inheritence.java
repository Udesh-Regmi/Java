
class Box {
    double width, height, depth;

    // Construct clone of an object
    Box(Box ob) { // Pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    // All dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    // No dimensions specified
    Box() {
        width = height = depth = -1;
    }
    // Constructor when cube is created.
    Box(double len) {
        width = height = depth = len;
    }
    // Compute the volume
    double volume(){
        return width* height * depth;
    }
}
class Boxweight extends Box{
    double weight; 
    Boxweight( double w, double h, double d, double m){
        width = w; 
        height = h; 
        depth = d; 
        weight = m; 
    }
    
    
}
public class Inheritence {
    public static void main(String[] args) {
        Boxweight box1 = new Boxweight(10, 20, 15, 67);
        Boxweight box2 = new Boxweight(1, 2, 5, 7);
        double vol; 

        vol = box1.volume();
        System.out.println("---------------------For Box-1 ------------------ ");

        System.out.println(" Volume of box 1 is  " + vol);
        System.out.println(" Weight of box 1 is  " + box1.weight);

        vol = box2.volume();
        System.out.println("---------------------For Box-2 ------------------ ");

        System.out.println(" Volume of box 2 is  " + vol);
        System.out.println(" Weight of box 2 is  " + box1.weight);
    }
    

}
