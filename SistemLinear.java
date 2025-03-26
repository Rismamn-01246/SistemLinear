import java.util.Scanner;

public class SistemLinear {
    public static void main(String[] args) {
       double a1, b1, c1, a2, b2, c2, x, y; 
       Scanner dis = new Scanner (System.in);
       System.out.print("Masukkan nilai a1 : ");
        a1 = dis.nextDouble();
        System.out.print("Masukkan nilai b1 : ");    
        b1 = dis.nextDouble();
        System.out.print("Masukkan nilai c1 : ");
        c1 = dis.nextDouble();
        System.out.print("Masukkan nilai a2 : ");
        a2 = dis.nextDouble();
        System.out.print("Masukkan nilai b2 : ");
        b2 = dis.nextDouble();
        System.out.print("Masukkan nilai c2 : ");
        c2 = dis.nextDouble();
        double faktor1 = a1;
        double faktor2 = a2;
        a1 = a1 * faktor1;
        b1 = b1 * faktor1;
        c1 = c1 * faktor1;
        a2 = a2 * faktor2;
        b2 = b2 * faktor2;
        c2 = c2 * faktor2;
        double eliminasi1 = b1 - b2;
        double eliminasi2 = c1 - c2;
        y = eliminasi2 / eliminasi1;
        x = (c1 - (b1 * y)) / a1;
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
    }
    
}
