import java.util.Scanner;
import java.lang.Math;
class DisariumNumber
{ 
 public static void main(String args[])
 {
  int count=0,sum=0;
  Scanner input=new Scanner(System.in);
  System.out.println("enter no of digits");
  int size=input.nextInt();
  int arr[]=new int[size+1];
  System.out.println("please enter a "+size+" digit number:");
  int no=input.nextInt();
  int num=no;
  for(int i=size;no>0;i--)
  { 
   arr[i]=no%10;
   no=no/10;
  }
  for(int i=1;i<=size;i++)
  {
   sum=sum+(int)Math.pow(arr[i],i);
  }
  if(sum==num)
  {
   System.out.println(num+" is a disarium number");
  }
  else
  {
   System.out.println(num+" is not a disarium number");
  }
 }
}