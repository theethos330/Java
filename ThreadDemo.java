class MyThread extends Thread {
    public void run() {
    	try {
	    System.out.println(Thread.currentThread().getName());
	    System.out.println(Thread.currentThread().getPriority()); 
	} catch(Exception e) {
	    System.out.println(e);
	}
    }
}

class NewThread implements Runnable {
    public void run() {
    	try {
	    System.out.println(Thread.currentThread().getId());
	    System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
	} catch(Exception e) {
	    System.out.println(e);
	}
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
    	for (int i=0; i<4; i++) {
	    Thread t = new Thread(new NewThread());
	    t.start();
	}
    }
}
