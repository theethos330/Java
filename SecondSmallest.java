public class SecondSmallest {
    public static void main(String[] args) {
    	int[] arr = {22, 10, 5, 55, 2};
	int s,ss=0;
	s = arr[0];
	for (int i=1; i<5; i++) {
	   if (arr[i] < s) {
	   	ss = s;
		s = arr[i];
	   }
	}

	System.out.println(s + " " + ss);
    }
}
