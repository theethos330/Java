public class Patterns {

    static void rectangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedRightTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void numRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void triangle(int n) {
        for (int row = 0; row <= 2*n; row++) {
            int totalColsInRow;
            // row > n ? 2 * n - row : row;
            if (row > n) {
                totalColsInRow = 2 * n - row;
            } else {
                totalColsInRow = row;
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 5;
        rightTriangle(n);
    }
    

    
}
