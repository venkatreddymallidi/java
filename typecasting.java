import java.util.Scanner;
class typecast
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter first number");
int a=input.nextInt();
System.out.println("Enter second number");
int b=input.nextInt();
float c=a/b; /*implicit typecasting not extra code required to convert one data type to another*/                   
System.out.println("division of"+a+"  and "+"b"+" implicit :" +c);
float d=(int)a/b; /*explicit additonal code written i.e,variabel=(data)expression*/
System.out.println("division of"+a+"  and "+"b"+" explicit :" +c);
}
}

