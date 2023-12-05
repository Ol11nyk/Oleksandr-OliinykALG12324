
package pkg5december;

import java.util.Scanner;

//test 2 1 -4 -1 5 2
public class U7_2NormalMatrixProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        //in reading matrix from user
        
        //create later at home a method for this shit
        System.out.println("Zadej rozmery matice: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] matrix = new double [m][n];
        System.out.println("Zadej hodnoty matice: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
               matrix[i][j] = sc.nextDouble();
            }
        }
        //normovani matice
        double[][] normMatrix = MatrixTools.NormalMatrix(matrix);
        //vypis normovane matice
        for(int i=0; i<normMatrix.length; i++){
            for(int j=0; j<normMatrix[i].length; j++){
                System.out.format("%5.2f ",normMatrix[i][j]);
            }
        System.out.println("");
        }
    }
}
