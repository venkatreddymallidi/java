/*sum 
    of 
      digits of given number*/
import java.util.Scanner;
class sum
{

public static void main(String args[])
{
int rem,sum=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int num=input.nextInt();
while(num!=0)
{
rem=num%10; //by dividing with 10 we get remainder(last digit)
sum=sum+rem;
num=num/10;  // getting remaining digits(expect lastdigit used above)
}
System.out.println("sum of given number:"+sum);
}
}
 