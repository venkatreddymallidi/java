import java.util.Scanner;
class array
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter row size");
int r=input.nextInt();
System.out.println("Enter column size");
int c=input.nextInt();
int arr[][]=new int[r][c];
System.out.println("enter "+r*c+" elements into the array");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
arr[i][j]=input.nextInt();
}
}
System.out.println("Entered elements are:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}