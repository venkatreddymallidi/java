import java.util.Scanner;
class matrixmultiplication
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter row,column size of first matrix:");
int r1=input.nextInt();
int c1=input.nextInt();
int m1[][]=new int[r1][c1];
System.out.println("Enter row,column size of second matrix");
int r2=input.nextInt();
int c2=input.nextInt();
int m2[][]=new int[r2][c2];
int m3[][]=new int[r1][c2];
if(r1!=c2 || c1!=r2)
{
System.out.println("matrix multiplication is not possible");
}
else
{
System.out.println("Enter elements into the matrix");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
m1[i][j]=input.nextInt();
}
}
for(int i=0;i<r2;i++)
{
for(int j=0;j<c2;j++)
{
m2[i][j]=input.nextInt();
}
}
for(int i=0;i<r1;i++)
{
for(int j=0;j<c2;j++)
{
m3[i][j]=0;
for(int k=0;k<c1;k++)
{
m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
}
}
}
System.out.println("product of first and second matrix:");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c2;j++)
{
System.out.print(m3[i][j]+"  ");
}
System.out.println();
}
}
}
}
