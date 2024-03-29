import java.util.*;
class Person{
	String Pname;
	int Page;
	Person(){
		Pname=name;
		Page=age;
	}
	void display(){
		System.out.println("Name of Person: "+Pname+" with age: "+Page);
	}
}
class Employee extends Person{
	String Ename;
	int Eage;
	Employee(){
		Ename=name;
		Eage=age;
	}
	void display(){
		System.out.println("Name of Employee: "+Ename+" with age: "+Eage);
	}		
}
class Student extends Person{
	String Sname;
	int Sage;
	Student(){
		Sname=name;
		Sage=age;
	}
	void display(){
		System.out.println("Name of Student: "+Sname+" with age: "+Sage);
	}	
}
class Result{
	void callPerson(){

	}
	void callPerson(){

	}
}

//DownCasting is to cast the Parent class into the Child class(It is done by the programmer)

//UpCasting is to cast the Child class into the Parent class(It is done by the compiler automatically)

/* This would give you an error
downCastingUpCasting.java:1: error: class, interface, or enum expected
java.util.*;
^
1 error
*/