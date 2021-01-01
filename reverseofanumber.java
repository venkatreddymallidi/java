import java.util.Scanner;

class reverse
{
public static void main(String args[])
{
int rev=0,rem;
Scanner input=new Scanner(System.in);
System.out.println("Enter a number to get it reverse");
int num=input.nextInt();
int original=num;
while(num!=0)  // iterate(execute given conditions) the loop until number not equal to zero
{
rem=num%10;
rev=rev*10+rem;  //rev*10 helps to change digits ones to tens to hundreds (0 at last)so easy to add remainder to get rev of that number
num=num/10;
}
System.out.println("reverse of given number:"+rev);

}
}