import java.util.Scanner;
  class vowels
  {
    public static void main(String args[])
    {
      int ch;
      System.out.println("enter the character:");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||  ch=='u'||ch=='A'|| ch=='E'||ch=='I'|| ch=='O'||ch=='U' )
      {
 System.out.println("vowel");
      }
    else
    {
      System.out.println("consenents"); 
    }
}
  }

