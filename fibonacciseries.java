import java.util.Scanner;
class series
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter no of term of the series");
int r=input.nextInt();
System.out.println("fibonacci series upto "+r+" terms:");
int a=0,b=1;
System.out.print(a+" "+b+" ");
int c=a+b;
for(int i=3;i<=r;i++)
{
System.out.print(c+" ");
a=b;
b=c;
c=a+b;
}
}
}