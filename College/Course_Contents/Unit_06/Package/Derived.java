package Course_Contents.Unit_06.Package;
public class Derived extends Protection {
    public Derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        // System.out.println("n_pri = " + n_pri); // Error: n_pri has private access in p1.Protection
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
    
}
