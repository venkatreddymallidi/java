import java.util.Scanner;
class switch1
{
public static void main(String args[])
{
int a,b,result;
Scanner input=new Scanner(System.in);
System.out.println("enter first number");
a=input.nextInt();
System.out.println("enter second number:");
b=input.nextInt();

if(a>b)
{
result=1;
}
else
{
result=2;
}
switch(result)
{
case 1:
System.out.println("a is greater");
break;
case 2:
System.out.println(" b is greater");
break;

}
}
}