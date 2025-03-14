import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
    	int[][] mat = new int[3][2];
	int[][] trans = new int[2][3];
	Scanner in = new Scanner(System.in);
	
	for (int i=0; i<3; i++) {
	   for (int j=0; j<2; j++) {
	   	mat[i][j] = in.nextInt();
	   }
	}
	System.out.println("Entered matrix: ");
	for (int row[]: mat) {
	   for (int e: row) {
	   	System.out.print(e + " ");
	   }
	   System.out.println();
	}

	for (int i=0; i<3; i++) {
           for (int j=0; j<2; j++) {
               trans[j][i] = mat[i][j];
           }
           
        }

	System.out.println("Transpose matrix: ");
	for (int i=0; i<2; i++) {
	   for (int j=0; j<3; j++) {
	       System.out.print(trans[i][j] + " ");
	   }
	   System.out.println();
	}
    }
}
