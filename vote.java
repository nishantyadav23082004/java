class Person{
	public static void main(String a[]){
		int age=Integer.parseInt(a[0]);
		if(age>=18){
			System.out.println("You are eligible to vote");
		}
		else{
			System.out.println("You cannot vote");
		}
	}
}