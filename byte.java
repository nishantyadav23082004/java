class Byte{
	public static void main(String args[]){
		byte b=127;
		System.out.println(b);
		System.out.println(b++);
		System.out.println(++b);
		byte b1=(byte)132;
		System.out.println(b1);
		System.out.println(++b1);
		byte s=10+10;
		System.out.println(s);
		byte s2=(byte)(120+10);
		System.out.println(s2);
		byte x='A';
		System.out.println(x);  // would give 65, that is the ASCII value of 'A'
	}
}