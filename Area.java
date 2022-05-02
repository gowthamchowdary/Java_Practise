import java.util.*;
 
  class Areaa
    {
     int area(int a,int b)
      {
       System.out.println("area of Rectangle");
       return(a*b);     
        }
       int area(int a)
      {
        System.out.println("area of square");
       return(a*a);     
        }
       double area(double a)
      {
       System.out.println("area of circle");
       return((3.14)*a*a);     
        }
    }
class Area
  {
    public static void main(String args[])
    {
      Areaa a=new Areaa();
      int x=a.area(2,3);
      int y=a.area(2);
      double z=a.area(2);
      System.out.println(+x+""+y+""+z);
    }
  }
    