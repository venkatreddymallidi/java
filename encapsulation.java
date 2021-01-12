/*encapsulation : simply binding objects and methods together 
encapsulation nothing but a class(combination of objects and methods)*/
class Employeecount
{
private int numofemployees=0;     //private keyword for use a variable within the class not accesed in other classes
public void setnoofemployees(int count)  //creating a method in a class 
{                                                                          //declaring a parameter to get value from main method
numofemployees=count;                               //void type means this method dont return any value
}                                                                           //value got from main methos is assigned to normal method varible
public int getnoofemployees()    //here int type used because this function return an integer value
{
return numofemployees;
}
}                                                  //public means a member accessed by  all classes
public class Encapsulation 
{
public static void main(String args[])
{
Employeecount obj=new Employeecount();  //creating a object for Employeecount class to access the class
obj.setnoofemployees(5618);      //by using on object of class(Employeecount) we send data to setnoofemployee method
System.out.println("no of employees:"+obj.getnoofemployees());  //function calling using object and return passes value to this method
}
}

