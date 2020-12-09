import java.util.Scanner;
class Gui
{
public static void main(String args[])
{
int a,b;
Scanner input=new Scanner(System.in);
System.out.println("enter a number:");
a=input.nextInt();
System.out.println("enter another number");
b=input.nextInt();
System.out.println("sum of "+a+"and"+b+"is"+(a+b));
System.out.println("concatenationof"+a+"and"+b+"is"+a+b);
}
}