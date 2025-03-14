public class Reverse {

    static int sum = 0;

    static void reverseNum(int num) {
        
        if (num == 0) {
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;
        reverseNum(num/10);
    }

    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    public static void main(String[] args) {
        System.out.println(rev2(123));
        int num = 12345;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
