import java.util.Scanner;
  class Voting
    {
      public static void main(String args[])
      {
        int age;
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18)
        {
          System.out.println("eligible for voting");
          }
        else
        {
          System.out.println("not eligible for voting");
        }
      }
    }