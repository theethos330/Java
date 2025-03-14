import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;

public class RandomString {
    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();

        for (int i=0; i<size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 20;
        String name = generate(n);
        System.out.println(name);

        String sentence = "Hi h  sh  kks   hf";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        // split
        String arr = "Titus Rahul Jobit Ivin";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}
