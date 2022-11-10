package question5;

import java.io.IOException;

public class StringBuffer {
	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

		//public class BufferTest{  
	    public static void main(String[] args) throws IOException{  
	        StringBuffer buffer=new StringBuffer("hello");  
	        ((Appendable) buffer).append("java");  
	        System.out.println(buffer);  
	    }  
	}  


//}
