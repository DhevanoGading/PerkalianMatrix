package perkalianmatrix;

/**
 *
 * @author MOKLET-2
 */
public class PerkalianMatrixA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matA[][] = {{6,3},{4,8}};
        int matB[][] = {{1},{2}};
        int matC[][] = new int [matA.length][matB[0].length];
        
        for (int baris=0; baris<matA.length; baris++){
            for (int kolom=0; kolom<matB[0].length; kolom++){
                for (int x=0; x<matB.length; x++){
                    matC[baris][kolom] += matA[baris][x] * matB[x][kolom];
                }
                System.out.print(matC[baris][kolom]);
            }
            System.out.println();
        }
    }
}
