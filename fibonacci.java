public class fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
        // int ans = fibo(7);
        // System.out.println(ans);
    }    

    static int fiboFormula(int n) {
        return (int)(Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5));
    }
    

    static int fibo(int n) {
        if(n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
