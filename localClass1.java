import java.util.*;
class Person{
	String name="Jagdish";
	int age=18;
	void license(){
		if(age>=18){
			int lic=678;
			int reqid=90;
			class License{
				void generate(){
					System.out.println("Geneated for "+name+" having an age "+age+" and the licnum is "+lic);
				}
			}
			License l=new License();
			l.generate();
			System.out.println(reqid++);
		}
	}
	public static void main(String[] st){
		Person p=new Person();
		p.license();
	}
}