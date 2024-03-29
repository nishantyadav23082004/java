
class AirthmeticDemo
{
public static void main(String st[])
{

System.out.println(10&10);
//00001010
//00001010
//so & will be 00001010 and its decimal val is 10
System.out.println(10|10);
//00001010
//00001010
//so & will be 00001010 and its decimal val is 10
System.out.println(~10);
//00001010
//11110101
//00001010

System.out.println(~3);
//00000011
//11111100
//00000100
System.out.println(~-3);

System.out.println("o/p of 10<<2 : "+(10<<2));
//00001010
//001010..
//00101000

System.out.println("o/p of 10>>2 : "+(10>>2));
//00001010 bit format of 10
//..000010 its a right shift so shift the bit from right side and fill the remaning bit by 0 cos the last left significant bit is 0
//00000010
System.out.println("o/p of 3>>2 : "+(3>>2));
//00000011
//..000000
//00000000
System.out.println("o/p of -10>>2 : "+(-10>>2));
// 00001010 its a -ve num so take the 2 com.
// 11110110 now shift the bit
// ..111101 to fill the remaining bit check the bit on left side if its one fill it by 1
// 11111101 so here u have 1 as left significant bit so take the 2 com
//00000011

System.out.println("o/p of -16>>2 : "+(-16>>2));
//00010000
//11110000
// 111100
//11111100
//00000100 -4
System.out.println("o/p of -16>>2 : "+(-16>>>2));
//00010000
//11110000
// 111100
//00111100}}