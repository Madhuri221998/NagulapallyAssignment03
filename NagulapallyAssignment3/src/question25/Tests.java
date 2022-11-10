package question25;

	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.Arrays;
	 
	public class Tests{  
	    public static void main(String[] args) {  
	    	try {
	            long noOfWords = Files.lines(Paths.get("D:\\test.txt"))
	                                    .flatMap(l->Arrays.stream(l.split(" +")))
	                                    .distinct()
	                                    .count();
	            System.out.println("No Of Words: "+noOfWords);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }  
	}


