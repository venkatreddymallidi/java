import java.util.Scanner;
class matrixaddition
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter row size:");
int r=input.nextInt();
System.out.println("Enter column size:");
int c=input.nextInt();
int m1[][]=new int[r][c];
int m2[][]=new int[r][c];
int m3[][]=new int[r][c];
System.out.println("Enter "+r*c+" elements into first matrix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m1[i][j]=input.nextInt();
}
}
System.out.println("Enter "+r*c+" elements into second matrix:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m2[i][j]=input.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
 m3[i][j]=0;
m3[i][j]=m1[i][j]+m2[i][j];
}
}
System.out.println("sum of two matrices:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(m3[i][j]+" ");
}
System.out.println();
}
}
}
