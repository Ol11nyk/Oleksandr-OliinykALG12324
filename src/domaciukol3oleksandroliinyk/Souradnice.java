package domaciukol3oleksandroliinyk;
import java.util.Scanner;

public class Souradnice {
    public static void main(String[] args) {
    
        Scanner sc  = new Scanner(System.in);
        System.out.println("Zadejte x: ");
        double x = sc.nextDouble();
        System.out.println("Zadejte y: ");
        double y = sc.nextDouble();
        
        if (x>0 && y>0){
            System.out.println("1.kvadrant");
         } else if (x < 0 && y > 0) {
            System.out.println("2.kvadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3.kvadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4.kvadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Bod v nule neboz pocatku");
        } else if(x==0 && y>0 || y<0) {
            System.out.println("Bod na souradnice y");
        } else if (y==0 && x>0 || x<0) {
            System.out.println("Bod na souradnice x");
        }
    }
}

