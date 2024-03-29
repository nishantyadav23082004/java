import java.util.*;
class Student{
	public void show(String sem,String c1,String c2){
		System.out.println(sem+" "+c1+" "+c2);
	}
	public void show(String sem,String c1,String c2,String c3){
		System.out.println(sem+" "+c1+" "+c2);
	}
	protected void show(String sem,String c1,String c2,String c3,String c4){
		System.out.println(sem+" "+c1+" "+c2);
	}
}
class Examination extends Student{
	void show(String c1,String c2){
		System.out.println(c1+" "+c2);
	}
}
class Overloading{
	public static void main(String[] a){
		new Student().show("4","CSE","MEC");
		new Examination().show("CSE","MEC");
	}
}