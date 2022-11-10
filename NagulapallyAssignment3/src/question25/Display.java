package question25;

	interface Display{  
	    //Default method   
	    default void display(){  
	        System.out.println("Hello Jai");  
	    }  
	    //Abstract method  
	    void displayMore(String msg);  
	}  
	public class DefaultMethods implements Display{  
		//implementing abstract method
	    public void displayMore(String msg){           
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	        DefaultMethods dm = new DefaultMethods(); 
	        //calling default method 
	        dm.display();    
	        //calling abstract method
	        dm.displayMore("Hello w3spoint");    
	    }  
	}


