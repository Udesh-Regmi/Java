class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = height = depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class Boxweight extends Box {
    double weight;

    Boxweight(Boxweight ob) {
        super(ob);
        weight = ob.weight;
    }

    Boxweight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Boxweight() {
        super();
        weight = 12;
    }

    Boxweight(double len, double m) {
        super(len);
        weight = m;
    }

}

public class Superclass {
    public static void main(String[] args) {
        Boxweight box1 = new Boxweight(1.05, 2.0, 30.4, 40.5);
        Boxweight box2 = new Boxweight(1.05, 2.0);  
        Boxweight box3 = new Boxweight();
        Boxweight box4 = new Boxweight(box1);

        double vol;

        vol = box1.volume();
        System.out.println("Volume of box1 is " + vol);
        System.out.println("Mass of box1 is " + box1.weight);

        vol = box2.volume();
        System.out.println("Volume of box2 is " + vol);
        System.out.println("Mass of box2 is " + box2.weight);

        vol = box3.volume();
        System.out.println("Volume of box3 is " + vol);
        System.out.println("Mass of box3 is " + box3.weight);

        vol = box4.volume();
        System.out.println("Volume of box4 is " + vol);
        System.out.println("Mass of box4 is " + box4.weight);
    }
}
