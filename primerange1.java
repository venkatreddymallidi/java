import java.util.Scanner;
class primerange
{
  public static void main(String args[])
  {
    int count=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number to print primes upto that no:");
    int num=input.nextInt();
    System.out.println("primes upto"+num+"are:"); 
     for(int i=2;i<=num;i++)
       {
         count=0;
         for(int j=1;j<=i;j++)
           {  
             if(i%j==0)
               {
                 count++;
               }
            }
         if(count==2)
           {
              System.out.println(i);
           }
       }
   }
}