public class Test {
    static  boolean isPalin(String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(s.length()-1-i) != s.charAt(i)) {
                return false;
            }
         }
	return true;
    }
    public static void main(String[] args) {
    	if (isPalin("sos")) {
	    System.out.println("Is a palindrome");
	}	
    }
}
