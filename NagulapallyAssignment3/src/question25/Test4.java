package question25;

	import java.util.ArrayList;
	import java.util.List;
	 
	public class Test4{  
	    public static void main(String[] args) {  
	    	List<String> names = new ArrayList<String>();
	    	names.add("Jai");
	    	names.add("Mahesh");
	    	names.add("Ajay");
	    	names.add("Hemant");
	    	names.add("Vishal");
	    	int count = 0;
	    	for (String str : names) {
	    	   if (str.length() < 5) 
	    		count++; 
	    	}
	            System.out.println(count+" strings with length less than 5");
	    }  
	}


