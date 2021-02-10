class demo
{
public static void main(String args[])
{
byte b;
int i=270;
double ld=7.5;
b=(byte)i;  //here int 4 bytes and byte 1 bytes so higher size to lower explicit typecasting used
System.out.println("int "+i+" converted into byte :"+b);
i=(int)ld;      //here double 8 bytes and int 4 bytes so exliplicit
System.out.println("double "+ld+"converted into int : "+i);
b=(byte)ld;  
System.out.println("double "+ld+"converted into byte :"+b);
}
} 