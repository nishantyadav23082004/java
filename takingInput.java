import java.util.*;
class StudentDetail{
	float checkResult(String name,int rNo,float tgpa1,float tgpa2,float tgpa3){
		float result=(tgpa1+tgpa2+tgpa3)/3;
		return result;
	}
	void checkEligForPlac(float cgpa){
		if(cgpa>=7.5){
			System.out.println("Student is eligible for placement");
		}
		else{
			System.out.println("Student is not eligible for placement");
		}
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name: ");
		String n=s.nextLine();
		System.out.print("Enter roll number: ");
		int r=s.nextInt();
		System.out.print("Enter tgpa1: ");
		float t1=s.nextFloat();
		System.out.print("Enter tgpa2: ");
		float t2=s.nextFloat();
		System.out.print("Enter tgpa3: ");
		float t3=s.nextFloat();
		StudentDetail obj1=new StudentDetail();
		float cgpa=obj1.checkResult(n,r,t1,t2,t3);
		System.out.println("Student cgpa: "+cgpa);
		obj1.checkEligForPlac(cgpa);
	}
}