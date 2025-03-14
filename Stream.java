public class Stream {
    public static void main(String[] args) {
        // skip("", "baccdah");
        // System.out.println(skip2("baccdah"));

        // System.out.println(skipAppAndNotApple("iamnotapplw"));

        subseq("", "abc");
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }

    }

    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
    
    static String skipAppAndNotApple (String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppAndNotApple(up.substring(3));
        }
        else {
            return up.charAt(0) + skipAppAndNotApple(up.substring(1));
        }
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
