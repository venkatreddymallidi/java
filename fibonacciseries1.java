import java.util.Scanner;
class series
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter no to print series upto that no");
int no=input.nextInt();
System.out.println("fibonacci series upto "+no+" are:");
int a=0,b=1;
System.out.print(a+" "+b+" ");
int c=a+b;
for(int i=1;c<=no;i++)
{
System.out.print(c+" ");
a=b;
b=c;
c=a+b;
}
}
}