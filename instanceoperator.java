class first
{
}
class second extends first 
{
}
class check
{
public static void main(String args[])
{
first f1=new first();
second s1=new second();
System.out.println("f1 is instance of first :"+(f1 instanceof first)); /*instanceof used to check a object belongs to a class or subclass or interface*/
System.out.println("f1 is instance of second :"+(f1 instanceof second)); //f1 is not obj of second
System.out.println(" s1 is instance of  second :"+(s1 instanceof  second));
System.out.println(" f1 is instance of first :"+(s1 instanceof first)); /*because second inherits first s1 is also a object of second*/
}
}