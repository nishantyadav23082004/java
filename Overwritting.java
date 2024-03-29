import java.util.*;
class Person{
	public void display(){
		System.out.println("I am not a Person but I belong to the class person");
	}
}
class Teacher extends Person{
	public void display(){
		System.out.println("I belong to the class Teacher");
	}
}
class Doctor extends Person{
	public void display(){
		System.out.println("I belong to the class Doctor");
	}
}
class Main{
	public static void main(String[] args){
		Teacher t=new Teacher();
		t.display();
		Doctor d=new Doctor();
		d.display();
	}
}