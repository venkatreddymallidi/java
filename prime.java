import java.util.Scanner;
class checkprime
{ 
public static void main(String args[])
{
int factor=0,m;
Scanner input=new Scanner(System.in);
System.out.println("enter a no to check it prime or not");
int no=input.nextInt();
m=no/2;  /*factor of no is upto that no/2*/
if(no==0 || no==1)  //0 and 1 are not prime
 {
System.out.println(no +"is not a prime number");
}
else
{
for(int i=2;i<=m;i++)
{
if(no%i==0)

System.out.println(no +"not  a prime number"); //finding factors other than itself and 1
factor=1;
break;
}
}
if(factor==0){
System.out.println(no +"prime number");
}
}
}
}
 