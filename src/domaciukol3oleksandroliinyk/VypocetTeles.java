package domaciukol3oleksandroliinyk;
import java.util.Scanner;
public class VypocetTeles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej delku stran pro pocet a polomer(a, b, c; r): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r = sc.nextDouble();
        
        double ObjemKvadru = a*b*c;
        double PlochaKvadru = 2*(a*b+b*c+a*c);
        
        double ObjemKrychle = a*a*a;
        double PlochaKrychle = 6*a*a;
        
        double ObjemKoule = (4*Math.PI*r*r*r)/3;
        double PlochaKoule = 4*r*r*Math.PI;
        
        double ObjemPravCtyrsten = ((Math.sqrt(2)*a*a*a)/12);
        double PlochaPravCtyrsten = (Math.sqrt(3*a*a));
        
        System.out.println("Objem a plocha kvadru: " + ObjemKvadru + "m3, "
                + PlochaKvadru + "m2");
        System.out.println("Objem a plocha krychle: " + ObjemKrychle + "m3, "
                + PlochaKrychle + "m2");
        System.out.println("Objem a plocha koule: " + ObjemKoule + "m3, "
                + PlochaKoule + "m2");
        System.out.println("Objem a plocha pravidelneho ctyrstence: " 
                + ObjemPravCtyrsten + "m3, " + PlochaPravCtyrsten + "m2");
    }
    
}
