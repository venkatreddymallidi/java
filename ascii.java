import java.util.Scanner;
class ascii
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a number for its ascii code");
int num=input.nextInt();  //here int is 4 bytes and char is 2 bytes ,data type of higher size cannot be assigned to datatype of lower size
char ascii=(char)num;  // so we use explicit typecasting to convert higher to lower an extra code is to be writtened not done by jvm 
System.out.println("Ascii code of given number :"+ascii);
}
}