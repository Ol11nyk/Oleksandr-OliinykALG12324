package domaciukol3oleksandroliinyk;
import java.util.Scanner;
public class KvadratickaRovnice {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        // Uživatel zadá hodnoty koeficientů
        System.out.print("Zadej hodnotu koeficientu a: ");
        double a = sc.nextDouble();
        System.out.print("Zadej hodnotu koeficientu b: ");
        double b = sc.nextDouble();
        System.out.print("Zadej hodnotu koeficientu c: ");
        double c = sc.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double koren1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double koren2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Reálné kořeny:");
            System.out.println("Koren 1: " + koren1);
            System.out.println("Koren 2: " + koren2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Jeden koren:");
            System.out.println("Koren: " + root);
        } else {
            double koren1 = (-b + Math.sqrt(Math.abs(discriminant))) / (2 * a);
            double koren2 = (-b - Math.sqrt(Math.abs(discriminant))) / (2 * a);
            System.out.println("Komplexní kořeny:");
            System.out.println("Koren 1: " + Math.abs(koren1) + "i");
            System.out.println("Koren 2: " + Math.abs(koren2) + "i");
        }
        
        
    }
    
}
