import java.util.*;
class Student{
	String name;
	public boolean check(double cgpa){
		if(cgpa>=7.0){
			return true;
		}
		else{
			return false;
		}
	}
}
class Placement extends Student{
	Scanner sc=new Scanner(System.in);
	public void register(){
	}
	public static void main(String[] args){
		double cgpa=8.9;
		Student s1=new Student();
		if(s1.check(cgpa)){
			System.out.println("You are eligible for placement");
		}
		else{
			System.out.println("You are NOT eligible for placement");
		}
	}
}