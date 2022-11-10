package question25;


	interface AddInterface{  
	    void add(int a, int b);  
	}  
	 
	public class LambdaExpressionExample {
		public static void main(String args[]){
			//Using lambda expressions
			AddInterface addInterface=(a, b)->{
				 System.out.println(a + b);				 
			};
			addInterface.add(10, 20);  
		}
	}


