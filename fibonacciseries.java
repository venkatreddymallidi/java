import java.util.Scanner;
class series
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter no of terms of the series");
int t=input.nextInt();
System.out.println("fibonacci series upto "+t+" terms are:");
int a=0,b=1;
System.out.print(a+" "+b+" ");
int c=a+b;
for(int i=3;i<=t;i++)  //i value from 3 because we already printed 2 terms
{
System.out.print(c+" "); // empty quotes for tab space
a=b;  //swaping a,b values
b=c;
c=a+b;
}
}
}