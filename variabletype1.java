/*local variable which is defined in a method of class
local variable scope within the block of that method*/
class Localvariable
{
//Instance variable
String var="instance variable";
void method()
{
//local variable
String var="local variable";
System.out.println("inside the method"+var);
}
public static void main(String args[])
{
Localvariable obj1=new Localvariable();
obj1.method(); //calling method to executes it contents
System.out.println("main method"+obj1.var); //prints value of instance variable but not value of local variable because out of scope
}
}
