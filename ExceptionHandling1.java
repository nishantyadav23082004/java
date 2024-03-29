class ExceptionHandlingDemo1{
	public static void main(String[] args){
		System.out.println("Hello World");
		try{
			int a=9/0;		//ArithmeticException division by 0
			int ar[]=new int[10];
			ar[11]=100;		//ArrayIndexOutOfBoundsException
		}
		catch(ArithmeticException e){
			System.out.println("You have done some Arithmetic mistake");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You have done some ArrayIndexOutOfBounds mistake");
		}
		catch(Exception e){
			System.out.println("You have done some mistake");
		}
		System.out.println("Exception handling is done");
	}
}
