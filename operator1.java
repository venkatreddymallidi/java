import java.io.DataInputStream;
class operator
{
public static void main(String args[]) throws Exception
{
DataInputStream input=new DataInputStream(System.in); 
System.out.println("Enter a number to increment it by 1");
int a=Integer.parseInt(input.readLine());
System.out.println("Enter a number to decrement it by 1");
int b=Integer.parseInt(input.readLine());
a++;  //a=a+1 or a+=1
System.out.println("value of a ="+a);
b--; //b=b-1 or b-=1
System.out.println("value of b ="+b);
}
}
