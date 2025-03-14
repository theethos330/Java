class EvenThread implements Runnable {
    public void run() {
	System.out.println("Even numbers from 1 to 100");
    	for (int i=2; i<=100; i+=2) {
	   System.out.print(i + " "); 
	}
	try {
	    Thread.sleep(1000);
	} 
	catch (Exception e) {
	    System.out.println(e);
	}
    }
}

class OddThread implements Runnable {
    public void run() {
    	System.out.println("Odd numbers from 1 to 100");
	for (int i=1; i<100; i+=2) {
           System.out.print(i + " ");
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
	Thread et = new Thread(new EvenThread());
    	et.start();
	
	try {
	    et.join(); 
	}
	catch (Exception e) {
	    System.out.println(e);
	}
	Thread ot = new Thread(new OddThread());
	ot.start();
    }
}
