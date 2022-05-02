/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;
class Temperature
{
//Define the main method
public static void main(String args[]) 
  {
    int i,d;
//Declare the variables and initialize
//int daynumber=0;
Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of days:");
  d=sc.nextInt();
  float a[]=new float[d];
  for(i=0;i<d;i++)  
{
  System.out.println("enter the temperature of the day:"+(i+1));
  a[i]=sc.nextFloat();
  }
    float min=a[0];
    for(i=0;i<d;i++)
      {
        if(a[i]<min)
   {
     min=a[i];
   }
      }
System.out.println("The lowest temperature of the week 3 is "+(float)min+" celsius");
}
}

