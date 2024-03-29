interface calculator{
	int calculate();
}
class LambdaDemo4{
	public static void main(String[] s){
		calculator ob=()->100;
		System.out.println(ob.calculate());
		calculator ob1=()->10-10;
		System.out.println(ob1.calculate());
		calculator ob2=()->10*10;
		System.out.println(ob2.calculate());
		calculator ob3=()->10/10;
		System.out.println(ob3.calculate());
	}
}