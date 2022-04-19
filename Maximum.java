import java.util.Scanner;
  class Maximum
  {
    public static void main(String args[])
    {
      int a,b;
      System.out.println("enter a,b value:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      if(a>b)
      {
        System.out.println(" a is big");
      }
      else{
        System.out.println(" b is big");
      }
    }
  }