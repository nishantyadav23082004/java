import java.util.*;
interface BookOrder
{
double order(String name,int num_item);

}
class Customer
{
public static void main(String st[])
{
Scanner sc=new Scanner(System.in);
String name="";
System.out.println("Enter ur name ");
name=sc.next();
int items=0;
System.out.println("Enter the total item u want to order");

items=sc.nextInt();
BookOrder order1=(n,i)->{
System.out.println("Customer "+n+" is booking the order with total items "+i);
return i*200;
};
System.out.println("Order 1 total bill is "+order1.order(name,items));
System.out.println("Enter ur name ");
name=sc.next();

System.out.println("Enter the total item u want to order");
items=sc.nextInt();
BookOrder order2=(n,i)->{
System.out.println("Customer "+n+" is booking the order with total items "+i);
return i*200;
};
System.out.println("Order 2 total bill is "+order2.order(name,items));
System.out.println("Enter ur name ");
name=sc.next();

System.out.println("Enter the total item u want to order");
items=sc.nextInt();
BookOrder order3=(n,i)->{
System.out.println("Customer "+n+" is booking the order with total items "+i);
return i*200;
};
System.out.println("Order 2 total bill is "+order3.order(name,items));


}
}