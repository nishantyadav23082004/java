import java.util.*;
interface Sum{
	void add();
	void mul();
}
class Calc{
	public static void main(String st[]){
		int r=90;
		Sum c=new Sum(){
			int t;
			public void add(){
				System.out.println(t);
			}
			public void mul(){
				get();
			}
			void get(){
				System.out.println("hello");
			}
		};
		c.add();
	}
}