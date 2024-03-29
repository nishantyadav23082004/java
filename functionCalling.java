class Person{
	String name;
	int age;
	static int totalPerson=0;
	public void setValue(String name,int age){
		this.name=name;
		this.age=age;
		totalPerson++;
		System.out.println("Name: "+name+"\nAge: "+age);
	}
	public static void showTotalPerson(){
		System.out.println("Total persons: "+totalPerson);
	}
	public static void main(String args[]){
		Person p1=new Person();	      // Calling non-static function
		p1.setValue("Aakash",33);
		Person p2=new Person();
		p2.setValue("Raunac",40);
		showTotalPerson();           // Calling static function
	}
}