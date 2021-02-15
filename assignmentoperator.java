import java.util.Scanner;
class assignmentoperator
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a number");
int num1=input.nextInt();
System.out.println("Enter another number");
int num2=input.nextInt();
System.out.println("addition  :"+(num1+=num2)); //num1=num1+num2
System.out.println("substraction :"+(num1-=num2));//num1=num1-num2
System.out.println("multiplication :"+(num1*=num2));//num1=num1*num2
System.out.println("division :"+(num1/=num2));//num1=num1/num2
System.out.println("remainder :"+(num1%=num2));//num1=num1%num2
}
}