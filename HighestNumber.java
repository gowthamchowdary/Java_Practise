/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
public static void main(String args[]){
//Declare the three variables
int x,y,z;
//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
 
*/
Scanner sc= new Scanner(System.in);
 System.out.println("Enter the first number");
 x=sc.nextInt();
System.out.println("enter the second number");
y=sc.nextInt();
System.out.println("enter the third value");
z=sc.nextInt();
 
//check which number is highest using if else condition
if (x>y && x>z)
{
  System.out.println("highest nummber is:" +x);
}
else if(y>z)
{
  System.out.println("highest number is:"+y);
  }
else
{
  System.out.println("highest number is:"+z);
}
//Print the highest of three numbers
} 
}