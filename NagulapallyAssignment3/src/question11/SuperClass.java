package question11;

import java.sql.SQLException;

//public class SuperClass {
	 class SuperClass
	{
	    void methodOfSuperClass()
	    {
	        System.out.println("Super class method is not throwing any exceptions");
	    }
	}
	 
	class SubClass extends SuperClass
	{
	    @Override
	    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
	    {
	        System.out.println("can be overrided with any unchecked Exception");
	    }
	}
	 
	class SubClassOne extends SuperClass
	{
	    @Override
		static
	    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
	    {
	        System.out.println("Can be overrided with any number of Unchecked Exceptions");
	    }
	 public static void main(String[] args) {
		 methodOfSuperClass();
		
	}
	 
	class SucbClassTwo extends SuperClass
	{
	    @Override
	    void methodOfSuperClass()
	    {
	        //Compile time error
	        //Can not be overrided with checked exception
	    }
	}
	}
//}
