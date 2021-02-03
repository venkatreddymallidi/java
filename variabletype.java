/*Instance variable is declared in class*/
class Instancevariable
{
String a="instance variable";
public static void main(String args[])
{
Instancevariable obj1=new Instancevariable();//object created
Instancevariable obj2=new Instancevariable();
System.out.println("obj1:"+obj1.a);
System.out.println("obj2:"+obj2.a);
obj1.a="value changed";
System.out.println("obj1:"+obj1.a);  /*instance variable varies from object to object*/
System.out.println("obj2:"+obj2.a);
}
}