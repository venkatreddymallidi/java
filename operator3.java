/* relational operator gives relation between two values*/
import java.io.DataInputStream;
class comparisonoperator
{
public static void main(String args[]) throws Exception
{
DataInputStream input=new DataInputStream(System.in);
System.out.println("Enter a number");
int a=Integer.parseInt(input.readLine());  //here input.readline() method takes string and is converted to int 
System.out.println("Enter another number");
int b=Integer.parseInt(input.readLine());
if(a>b)
System.out.println(a+" is greater than "+b);
if(a<b)
System.out.println(a+" is less than "+b);
if(a==b)
System.out.println(a+" equal to "+b);
if(a!=b)
System.out.println( a+" not equal to "+b);
if(a>=b)
System.out.println( a+" is greater than or equal to "+b);
if(a<=b)
System.out.println(a+" is less than or equal to "+b);
}
}

