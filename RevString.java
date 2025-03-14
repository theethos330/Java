import java.io.*;

public class RevString {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s =  br.readLine();
	char[] ch = s.toCharArray();
	for (int i=0; i<ch.length/2; i++) {
	    char temp = ch[i];
	    ch[i] =  ch[ch.length -1-i];
	    ch[ch.length -1-i] = temp;
	}	
	s = ch.toString();
	s = "";
	for(char c: ch) {
	   s+=c;
	}
	System.out.println(s);
    }
}
