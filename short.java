class Short{
	public static void main(String args[]){
		short b=127;
		short b1=20;
		short b2=(short)(b+b1);
		byte b3=(byte)(b2);             // Narrowing, holding short in byte
		System.out.println(b2);
		System.out.println(b++);
		System.out.println(++b1);
		System.out.println(b3);
		double d1=10.41342299;
		System.out.println(d1);
		char ch1='A';
		System.out.println(ch1);
		char ch2=97;
		System.out.println(ch2);      // Takes ASCII value of a, that is 97
		char ch3=(char)65.1;
		System.out.println(ch3);
		boolean b10=true;
		System.out.println(b10);
		boolean b11=false;
		System.out.println(b11);
	}
}