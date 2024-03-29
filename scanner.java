import java.util.*;
class ScannerDemo
{
public static void main(String sr[])
{
Scanner s=new Scanner(System.in);//create the object to take the input from console so pass System.in
System.out.println("Enter the age:");
int age=s.nextInt();//use this to read int value

System.out.println("Entered age is: "+age);
System.out.println("Enter the name:");
s.nextLine();//use this to empty the buffer whereever applicable like not given te option to enter
String name=s.nextLine();//use this to read whole line
System.out.println("Entered name is: "+name);
System.out.println("Ente the cgpa : ");
float f=s.nextFloat();//use this to read the float value
System.out.println("Entered cgpa is: "+f);

//use s.nextDouble() to read double value s.nextLong() to read long value s.nextByte() to read byte s.nextShort() to read short value and s.next().charAt(0) to print char of specific index
}
}