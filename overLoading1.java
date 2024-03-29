import java.util.*;
class Student{
	void get(){
		System.out.println("Non static parent class method");
	}
	static void show(){
		System.out.println("static parent class method");
	}
}
class Admission extends Student{
	void get(){
		System.out.println("Non static child class method");
	}
	static void show(){
		System.out.println("static child class method");
	}
}
class OveridingStaticNonStatic{
	public static void main(String[] a){
		Student s1=new Student();
		s1.get();
		s1.show();
		Student s2=new Admission();
		s2.get();
		s2.show();
	}
}