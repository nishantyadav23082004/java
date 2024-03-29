import java.util.*;
class staticBlock{
	static int count;
	int i;
	static{
		count=100;
		System.out.println("Class Wake Up");
	}
	public static void main(String a[]){
		System.out.println("Good Morning");
	}
}