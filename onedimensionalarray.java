import java.util.Scanner;
class array
{
public static void main(String args[])
{
int i=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int size=input.nextInt();
int arr[]=new int[size];  // declaring an array
System.out.println("Enter elements into the array:");
for( i=0;i<size;i++)
{
arr[i]=input.nextInt();   //taking elements into array and stored in a sequence
}
System.out.println("Entered elements are :");
for( i=0;i<size;i++)
{
System.out.print(arr[i]+" ");
}
}
}