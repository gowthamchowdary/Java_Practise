/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class PrimeNumbers {

//Add main method here
public static void main(String args[]){

//Declare variables num1, num2, i, count and initialize count as zero
int i,number,count;
//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);
Scanner sc= new Scanner(System.in);

/*
Take start value as input and read using scanner object
System.out.print("Enter Starting Number : ");
int start = sc.nextInt();
*/

System.out.println("enter the a value:");
  int a=sc.nextInt();
  System.out.println("enter the b value:");
  int b=sc.nextInt();
  
//Take end value as an input and read using scanner object
System.out.println("prime  numbers from a to b are: ");
//check for all the integer numbers which is between the two numbers given, using for loop
for(number =a; number <=b; number++)
  {
/*Inside the loop, check if the number can be divided by other numbers. You will need another loop for this.
  If it is divisble by other numbers (except 1 and itself), then move on to check the next number
  Else, print the prime number and then move on to the next number
*/
 count =0;
    for (i=2; i<= number/2 ;i++){
      if(number%i==0)
      {
        count++;
        break;
      }
    }
      if(count==0 && number!=1)
      {
        System.out.println(number +" ");
      }
    }
  }
}
