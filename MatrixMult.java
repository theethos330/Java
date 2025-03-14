import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    	int[][] mat1 = new int[10][10];
	int[][] mat2 = new int[10][10];
	int[][] mat3 = new int[10][10];
	int m, n, p, q;

	System.out.print("Enter the number of rows and columns of matrix 1: ");
	m = in.nextInt();
	n = in.nextInt();
	System.out.println("Enter the elements: ");
	for (int i=0; i<m; i++) {
	    for (int j=0; j<n; j++) {
	    	mat1[i][j] = in.nextInt();
	    }
	}
	System.out.print("Enter the number of rows and columns of matrix 2: ");
        p = in.nextInt();
        q = in.nextInt();

	System.out.println("Enter the elements: ");
	for (int i=0; i<p; i++) {
            for (int j=0; j<q; j++) {
                mat2[i][j] = in.nextInt();
            }
        }

	if (n == p) {
	    for (int i=0; i<m; i++) {
            	for (int j=0; j<q; j++) {
		    mat3[i][j] = 0;
                    for (int k=0; k<p; k++) {
		    	mat3[i][j] += mat1[i][k] * mat2[k][j];
		    }
            	}
            }
	}

	System.out.println("The multiplied matrix is: ");
	for (int i=0; i<m; i++) {
	     for (int j=0; j<q; j++) {
	     	System.out.print(mat3[i][j] + "\t");
	     }
	     System.out.println();
	}

    }
}
