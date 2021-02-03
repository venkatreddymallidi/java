/*static variable declared in a class like instance variable 
but its value is common to all object whereas in instance value varies from object to object*/
class Staticvariable
{
static String var="static or class variable";  //static keyword is used to declare variable as static variable this keyword makes difference between static and instance variable
public static void main(String args[])

{
//objects creation
Staticvariable obj1=new Staticvariable();
Staticvariable obj2=new Staticvariable();
System.out.println("obj1:"+obj1.var);
System.out.println("obj2:"+obj2.var);
obj2.var="value changed"; //static variable value changed for obj2 so for obj1 also changed because static variable is common to all variables
System.out.println("obj1:"+obj1.var);
System.out.println("obj2:"+obj2.var);
}
} 
