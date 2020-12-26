import java.util.Scanner;
class typecast
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter first number");
int a=input.nextInt();
System.out.println("Enter second number");
int b=input.nextInt();
float c=a/b;
System.out.println("division of "+a+" and "+b+"  is :implicit "+c);
c=(float)a/b;
System.out.println("division of "+a+" and "+b+" is :explicit "+c);
}
}

