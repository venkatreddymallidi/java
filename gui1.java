import java.io.DataInputStream;
class gui
{
public static void main(String args[])throws Exception
{
DataInputStream in=new DataInputStream(System.in);
int a=Integer.parseInt(in.readLine());
int b=Integer.parseInt(in.readLine());
System.out.println(a+b);
}
}