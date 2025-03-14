

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("Tony");

        // System.out.println(sb);
        // sb.setCharAt(0, 'T');
        // System.out.println(sb);

        // sb.insert(2, 'n');
        // sb.delete(3, 4);
        // System.out.println(sb);
        
        // sb.append(" Stark");
        // System.out.println(sb);
        // System.out.println(sb.length());
        for (int i=0; i<sb.length() - 1 - i; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
