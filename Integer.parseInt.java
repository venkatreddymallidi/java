import java.util.Scanner;
class method
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a number which taken as string");
String s=input.nextln();
s=s+5;  //In java when a no is added to string,then no is converted into string 
System.out.println("string + int ="+s);
int i;
i=Integer.parseInt(s); //by using this method string is converted into integer
i=i+5;
System.out.println("int + int ="+i);
}
}

