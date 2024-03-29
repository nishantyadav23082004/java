interface calculator{
	int calculate(int a,int b);
}
class LambdaDemo3{
	public static void main(String[] s){
		calculator ob=(x,y)->(x*y);
		System.out.println(ob.calculate(10,10));
		calculator ob1=(x,y)->(x/y);
		System.out.println(ob1.calculate(10,10));
	}
}