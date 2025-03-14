public class Sum {
    public static void main(String[] args) {
        System.out.println(SumOfDigits(23));
    }

    static int SumOfDigits(int num) {

        if (num == 0) {
            return 0;
        }

        return (num%10) + SumOfDigits(num/10);
    }
}
