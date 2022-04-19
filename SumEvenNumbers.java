import java.util.Scanner;
class SumEvenNumbers
  {
    public static void main(String args[])
    {
    int sum=0,n;
    System.out.println("enter n value");
   Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
      int i=1;
while(i<=n)
  {
    if(i%2==0)
    {
      sum=sum+i;
    }
    i++;
  }
System.out.println(sum);
  }
  }