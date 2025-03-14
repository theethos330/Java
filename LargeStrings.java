public class LargeStrings {
    public static void main(String[] args) {
        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("I am TJ");
        sb.append("!");
        sb.insert(4, " Mr.");
        sb.replace(4, 8, " ");
        sb.delete(4, 6);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        // constructor 2 - already a string initialized in it
        StringBuffer sb2 = new StringBuffer("Titus");

        // constructor 3 - specifying the size
        StringBuffer sb3 = new StringBuffer(30);
    }
}
