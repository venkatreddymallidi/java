class cmdlnarg
{
public static void main(String args[])   //args is array type of string
{
int sum=0;
for(int i=0;i<args.length;i++)  //args.length value equal to no of value given by the user
{
sum=sum+Integer.parseInt(args[i]);    /*values we given taken as string so we string to int by Integer.parseInt() method*/
}
System.out.println("sum="+sum);  //give output as java cmdlnarg 1 3 4
                                                        //output:sum=8
}
}
