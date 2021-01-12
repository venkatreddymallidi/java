class Employee
{
int numofemployee=0;
int setnoofemployee(int count)
{
numofemployee=count;  //1 now value from main method is stored in count and assigned to another variable

System.out.println("In method:"+numofemployee);//print the value

return numofemployee;//sends the value to 2(funccalling)
}

}
class Encapsulation
{
public static void main(String args[])  //first checks for main method and execute lines of main method
{

Employee obj=new Employee();

obj.setnoofemployee(4555);  //calling method and passing a parameter to that called method and compiler now shift to 1(called method)

//2 here no print statement to print the result so value form return not printed it stored in this function

System.out.println("(In main)num of employee(calling a method in employee class using that class object):"+obj.setnoofemployee(4555));//again function calling and sending value to called function again same process but here print statement is there so result printed

//System.out.println(numofemployee); shows error not defined because we another class variable using obj of that class

System.out.println("In main method(Employee variable used using object of that class):"+obj.numofemployee);//numofemployee are accesed because of public keyword ,if private used this variable accesed upto employee class only

}
}