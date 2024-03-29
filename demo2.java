import java.util.*;
class Marks{
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	void setMarks(int i,float j,float c,float cp){
		id=i;
		javaMarks=j;
		cMarks=c;
		cppMarks=cp;
	}
	void displayMarks(){
		System.out.println(id);
		System.out.println(javaMarks);
		System.out.println(cMarks);
		System.out.println(cppMarks);
	}
}
class Result extends Marks{
	float total,avg;
	void compute(){
		float total=javaMarks+cMarks+cppMarks;
		float avg=total/3;
	}
	void showResult(){
		System.out.println("total "+total);
		System.out.println("average "+avg);
	}
}
class SingleInheritanceDemo{
	public static void main(String args[]){
		int id1=Integer.parseInt(args[0]);
		float m1=Float.parseFloat(args[1]);
		float m2=Float.parseFloat(args[2]);
		float m3=Float.parseFloat(args[3]);
		Result obj1=new Result();
		obj1.setMarks(id1,m1,m2,m3);
		obj1.displayMarks();
		obj1.compute();
		obj1.showResult();
	}
}