import java.util.Scanner;
class grades
{
public static void main(String args[])
{
int avg;
Scanner input=new Scanner(System.in);
System.out.println("enter your marks");
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
int d=input.nextInt();
avg=a+b+c+d/4;
if(avg>=75)
{
System.out.println("A grade");
}
else if (avg<75&&avg>=60)
{
System.out.println("B grade");
}
else if(avg<60&&avg>=50)
{
System.out.println("C grade");
}
else if(avg<50&&avg>=35)
{
System.out.println("D grade");
}
else
{
System.out.println("fail");
}
}
}