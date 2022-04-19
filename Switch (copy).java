import java.util.Scanner;
class Switch
  {
    public static void main(String args[])
    {
        System.out.println("enter any character:");
        Scanner sc=new Scanner(System.in);
          char ch=sc.next().charAt(0);
      switch(ch)
        {
          case 'a': case 'A':
             case 'e': case 'E':
             case 'i': case 'I':
             case 'o': case 'O':
             case 'u': case 'U':
            System.out.println("its a vowel:");
            break;
          default:
            System.out.println("its a constraints:");
        }
    }
  }