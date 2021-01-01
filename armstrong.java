import java.util.Scanner;  // importing scanner function from util package
class armstrong
{
public static void main(String args[])
{
int lastdigit,cube=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter a number to check it armstrong or not");
int num=input.nextInt();
int original=num;   //we make a copy of given number to compare it to the result(because we do various arithmetic on it so it values changed)
while(num>0) 
{
lastdigit=num%10; // for getting lastdigit of given number
cube=cube+lastdigit*lastdigit*lastdigit; // we assign lastdigit cube to cube
num=num/10; // getting remaining digits expect last digit which was already cubed
}
if(original==cube)
{
System.out.println(original+" is a armstrong number");
}
else
{
System.out.println(original+" is not a armstrong number");
}
}
}

