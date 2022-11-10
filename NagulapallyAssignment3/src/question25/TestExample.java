package question25;

	import java.util.Arrays;
	 
	public class TestExample {
		public static void main(String args[]){
		//Creating an integer array   
	        int[] arr = {15,81,11,20,6,19};  
	        //Iterating array elements  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }  
	        //Parallel sorting   
	        Arrays.parallelSort(arr);  
	        System.out.println("\nArray elements after sorting");  
	        //Iterating array elements  
	        for (int i : arr) {  
	            System.out.print(i+" ");  
	        }      
		}  
	}


