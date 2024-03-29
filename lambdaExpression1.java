interface calculator{
	void calculate();
}
class LambdaDemo2{
	public static void main(String[] s){
		calculator ob=()->System.out.println(10+10);
		ob.calculate();
		calculator ob1=()->System.out.println(10-10);
		ob1.calculate();
		calculator ob2=()->System.out.println(10*10);
		ob2.calculate();
		calculator ob3=()->System.out.println(10/10);
		ob3.calculate();
	}
}