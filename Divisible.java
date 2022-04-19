import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
      int a;
    System.out.println("enter a value");
    Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a>=0)
      {
        System.out.println("is a positive number");
      }
      else{
        System.out.println("is a negative number");
      }
    }
  }