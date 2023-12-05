package pkg5december;

public class MatrixTools {

    public static void main(String[] args) {
        int rows, cols;
        double sumRow;    
        //double[][] test = new double[2][3];
        double[][] test = {{2,1,-4},
                           {-1,5,2},
                           {2,1,2}};
        maxAbs(test);
        System.out.println("Max abs: "+maxAbs(test));
        double[][] normTest = NormalMatrix(test);
        
        
        
        
        
        //symetricDiagonal(test);
        
    }

    //public static int[] MatrixSoucet() {
        
        //return null;
    //}

    public static double[][] NormalMatrix(double[][] a){
        //1.Projdeme pole a najdeme max abs hod.
        double maxAbs = maxAbs(a);
        double [][] b = new double [a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j] = a[i][j] / maxAbs;
            }
        }
        return b;
    }
    public static double maxAbs(double[][] a){
        double maxAbs = -Double.MAX_VALUE;
        double absElement;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                absElement = Math.abs(a[i][j]);
                if(absElement>maxAbs){
                    maxAbs = Math.abs(a[i][j]);
                }
            }
        }
        return maxAbs;
    }
    
    public static void printMatrix(double[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.format("%5.2f ",matrix[i][j]);
            }
        System.out.println("");
        }
    }
    //Zapište program, který bude testovat, zda zadaná čtvercová matice celých čísel je symetrická. Symetrii lze
    //testovat podle hlavní diagonály, podle vedlejší diagonály, dle vertikální osy, horizontální osy.
    public static boolean symetricDiagonal(int[][] a){
         for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a[0].length; j++){
                if(a[i][j]!=a[j][i]){return false;}
                    System.out.println("neni");
                }
            }
        return true;
    } 
    
    public static boolean symetricAddDiagonal(int[][] a){
        for(int i=0; i<a.length-1; i++){
            for(int j=i; j<=a[0].length-i-2; j++){
                if(a[i][j]!=a[a[0].length-1-i][a.length-1-j]){return false;}
                    System.out.println("neni");
                }
            }
        return true;
    }
    
    //public static boolean symetricVertical(){
        
       // return false;
        
   // }
    /*Zapište program, který bude testovat, zda zadaná matice je stochastická. Stochastická matice je taková matice,
    která obsahuje pouze nezáporné prvky a zároveň součet prvků v každém řádku je roven jedné.
    */
    public static void stochastickaMatice(double[][] matrix,int rows, int cols, double sumRow){
        rows = matrix.length;    
        cols = matrix[0].length;   
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]>0){
                    for(int m = 0; m < rows; m++){    
                        sumRow = 0;    
                        for(int n = 0; n < cols; n++){    
                        sumRow = (int) (sumRow + matrix[i][j]);    
                    }    
                        System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
                    }     
                }if(sumRow != 1){
                    System.out.println("neni");
                }else{
                    System.out.println("neni");
                }
            }
        }
    }

    
    
    
}
   
    
    
