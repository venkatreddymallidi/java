import java.util.Scanner;
class value
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter ascii codes to get it's corresponding value:");
char ch=input.next().charAt(0);  //input take input from user and next func take it as string and charAt(0) fun takes char at 0th index in the string
int num=ch; //int is 4 bytes and  char is 2 bytes so jvm automatically convert datatype of lowersize to higher
System.out.println("value of entered ascii code : "+num);
}
}