import java.util.*;
class A{
	String name;
	Scanner sc=new Scanner(System.in);
	void show(){
		System.out.println("Inside show of class A");
	}
}
class B extends A{
	void show(){
		System.out.println("Enter name: ");
		name=sc.next();
	}
}
class Main{
	public static void main(String arg[]){
		B obj1=new B();
		obj1.show();
		A obj2=new A();
		obj2.show();
		A obj3=new B();
		obj3.show();
	}
}