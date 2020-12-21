import java.util.Scanner;
class switchcase
{
public static void main(String args[])
{
int m;
Scanner input=new Scanner(System.in);
System.out.println("enter no of that month");
m=input.nextInt();
switch(m)
{
case 1:System.out.println("31 days");
break;
case 2:System.out.println("28 if leap,29 if non leap year");
break;
case 3:System.out.println("31 days");
break;
case 4:System.out.println("30 days");
break;
case 5:System.out.println("31 days");
break;
case 6:System.out.println("30 days");
break;
case 7:System.out.println("31 days");
break;
case 8:System.out.println("31 days");
break;
case 9:System.out.println("30 days");
break;
case 10:System.out.println("31 days");
break;
case 11:System.out.println("30 days");
break;
case 12:System.out.println("31 days");
break;
default:System.out.println("there is no month with that no");
}
}
}