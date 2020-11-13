
public class JoinExample {
	
	public static void main(String[]args) {
      Thread th1 = new Thread(new myClass2(), "-->th1");
		      Thread th2 = new Thread(new myClass2(), "-->th2");
		      Thread th3 = new Thread(new myClass2(), "-->th3");
		         
		      th1.start();
		      try {
		    	  th1.join();
		      }catch(InterruptedException ie) {
		    	  ie.printStackTrace();
		      }
		      th2.start();
		      try {
		    	  th2.join();
		      }catch(InterruptedException ie) {
		    	  ie.printStackTrace();
		      }
		      th3.start();
		      try {
		    	  th3.join();
		      }catch(InterruptedException ie) {
		    	  ie.printStackTrace();
		      }
		    
		      
	}

}

class myClass2 implements Runnable{

	@Override
	public void run() {

		Thread t= Thread.currentThread();
		
		System.out.println("Thrad started"  + t.getName());
		
		try {
			
			Thread.sleep(4000);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thrad ended" + t.getName());
	}
	
}