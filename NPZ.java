import java.util.Scanner;
  class NPZ
  {
    public static void main(String args[])
    {
      int a;
      System.out.println("enter a value:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a>0)
      {
        System.out.println("is a positive number");
      }
    else if(a<0)
    {
     System.out.println("is a negative number"); 
    }
      else
    {
    System.out.println(" is a zero");
      }
    }
  }