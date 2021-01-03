import java.util.Scanner;
class primerange
{
public static void main(String args[])
{
int count=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter a number to print primes upto that no:");
int num=input.nextInt();
for(int i=2;i<=num;i++)  //generating no from 2 to given no to check prime or not
 {
   count=0;  //for number to number count must be zero
  for(int j=2;j<=i/2;j++)  /*checking factors other one and itself of corresponding i value 
                          i/2=a no has factors upto half of its value*/
    {
   if(i%j==0)  
    {
     count++;  //checking factors except 1&itself,if factors found we increment the count value  
      break;  
 }
  }
   if(count==0) //factors 0(except 1 and itself) then prime
    {
      System.out.println(i);
    }
  }
}
}

