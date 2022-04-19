import java.util.Scanner;
  class EvenOdd
  {
    public static void main(String args[])
    {
      int a;
      System.out.println("enter a value:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
     if(a%2==0) 
     {
       System.out.println("the given number is a even number");
     }
      else{
        System.out.println("the given number is odd number");
      }
    }
  }