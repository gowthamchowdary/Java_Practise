import java.util.*;
  class Addition
    {
      int add(int a,int b)
      {
        return(a+b);
      }
      int add(int d,int e,int c)
      {
        return(d+e+c);
      }
      Double add(double a,double b)
      {
       return(a+b); 
      }
    }
class Overloading
  {
    public static void main(String args[])
    {
      Addition a=new Addition();
      int x=a.add(2,3);
      int y=a.add(3,4,5);
      double z=a.add(9.3,8.3);
      System.out.println(x+" "+y+" "+z);
    }
  }
    