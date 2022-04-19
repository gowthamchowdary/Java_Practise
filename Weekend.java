import java.util.Scanner;
  class Weekend
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enter n value:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n==1)
      System.out.println("Monday");
      else if(n==2)
    System.out.println("tuesday"); 
     else if(n==3) 
    System.out.println("wednesday");
  else if(n==4) 
    System.out.println("thursady");
       else if(n==5) 
         System.out.println("friday");
       else if(n==6) 
         System.out.println("saturday");
       else if(n==7) 
    System.out.println("sunday");
       else
         System.out.println("is a wrong choice");
      }
  }