import java.util.Scanner;
class Sorting
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter the size of the array");
int size=input.nextInt();
int arr[]=new int[size];
System.out.println("enter "+size +" elements into the array");
for(int i=0;i<size;i++)
{
arr[i]=input.nextInt();
}
System.out.println("elements in ascending order");
for(int i=0;i<size-1;i++)
{
for(int j=i+1;j<=size-1;j++)
{
if(arr[i]>arr[j])
{
int temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
System.out.println("elements in ascending order");
for(int i=0;i<size;i++)
{
System.out.println(arr[i]);
}
}
}