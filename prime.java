import java.util.Scanner;
class checkprime
{
public static void main(String args[])
{
int count=0;
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
int num=input.nextInt();
if(num==1 || num==0)
{
System.out.println(num+"not a prime number");
}
else
{
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(num+" is a prime number");
}
else
{
System.out.println(num+"is not a prime number");
}
}
}
}