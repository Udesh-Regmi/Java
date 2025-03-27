// package Unit_01.02_OperatorInJava;

public class Bitwise_Operator {
    public static void main(String[] args) {
        String binary[] = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 5; 
        int b = 7; 
        int c = a & b;
        int d = a | b;
        int e = a ^ b; 
        int f = ~a; 
        int g = a << 2; 
        int h = a >> 2; 
        int i = a >>> 2; 
    
        System.out.println(" a = " + binary[a]);
        System.out.println(" b = " + binary[b]);
        System.out.println(" a&b = " + binary[c]);
        System.out.println(" a|b = " + binary[d]);  
        System.out.println(" a^b = " + binary[e]);
        System.out.println(" ~a = " + binary[f]);
        System.out.println(" a << 2 = " + binary[g]);
        System.out.println(" a >> 2 = " + binary[h]);
        System.out.println(" a >>> 2 = " + binary[i]);
    }
}
