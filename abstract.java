import java.util.*;
abstract class Student{
  public abstract void StudentCourseProgress(String name, int reg, String suspiciouscase, float progress);
}
class Platform extends Student{
	public void StudentCourseProgress(String name, int reg, String suspiciouscase, float progress){
		if(progress==50 && suspiciouscase=="mild"){
			System.out.println("Allowed");
		}
		else if(progress>50 && suspiciouscase=="major"){
			System.out.println("Not Allowed");
		}
		else{
			System.out.println("Not Allowed");
		}
		System.out.println("Platform Report: Name: " + name + ", Reg No: " + reg + ", Suspicious Case: " + suspiciouscase + ", Progress: " + progress);
	}
}
class Main{
	public static void main(String[] args) {
		Platform obj1 = new Platform();
		obj1.StudentCourseProgress("Anshul", 121, "major", 0.85f);
		obj1.StudentCourseProgress("Jagdish", 474, "mild", 0.6f);
  }
}

