/*method overloading : In a class more the one methods with same names but with different argument lists*/
class declaration
{
  int res;
  float res1;
  int area(int s)
    {
      res=s*s;
      return res;
    }
  void area (int l, int b)
    { 
      System.out.println("Area of rectangle:"+(l*b));
    }
  void area(float l,float b,float h)
    { 
      res1=l*b*h;
      System.out.println("volume of cubiod:"+res);
    }
}
class methodoverloading
{
  public static void main(String args[])
  {
    declaration d1 = new declaration();
    System.out.println("Area of square:"+ d1.area(10));//based on no of parameters java decide which method to execute
    d1.area(10,20);
    d1.area(10,20,30); 
  }
}
   