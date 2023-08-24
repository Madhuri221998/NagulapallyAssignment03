package question3;

//public class SuperClass {
	class SuperClass {
		   SuperClass get() {
		      System.out.println("SuperClass");
		      return this;
		   }
		}
		public class SuperClas extend SuperClass {
		   SuperClas gebt() {
		      System.out.println("SubClass");
		      return this;
		   }
		   public static void main(String[] args) {
		      SuperClass tester = new SuperClas();
		      tester.get();
		   }
		}

//}
hi madhuri