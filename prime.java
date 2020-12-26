import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int count=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter a number:");
int no=input.nextInt();
if(no==1)
{
System.out.println("not a prime number");}
else
{
for(int i=2;i<=no/2;i++)
{
if(no%i==0)
{
count++;
break;
}
}
if(count==0)
{
System.out.println("prime number");
}
else 
{
System.out.println("not a prime number"); 
}
}
}
}