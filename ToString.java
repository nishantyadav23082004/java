java.util.*;
class StudentDemo{
	String n;
	int a;
	StudentDemo{
		this.n=n;
		a=age;
	}
	public String toString(){						//Override the toString method of the object class to print the value
		return "name of the student is: "+n+" having an age "+a;
	}
}
class Main{
	public static void main(String[] args){
		StudentDemo s1=new StudentDemo("Jagdish",19);
		System.out.println(s1);						//If you do not override, it will print address value
	}
}