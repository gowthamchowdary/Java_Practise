import java.util.Scanner;
  class Vowels
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println("enter the character:");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch=='a'||ch=='A')
      System.out.println("vowel");
       if(ch=='e'||ch=='E')
          System.out.println("vowel");
       if(ch=='i'||ch=='I')
          System.out.println("vowel");
      if(ch=='o'||ch=='O')
        System.out.println("vowel");
           if(ch=='u'||ch=='U')
          System.out.println("vowel");
      else
        System.out.println("constraint");
          }
  }
      