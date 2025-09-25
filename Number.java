/*Task: 

Write a Java program that reads a number and prints the first digit, last digit, their addition, in the format:
<firstdigit><lastdigit>--<firstdigit>+<lastdigit>--<sum>

Example:
Input: : 12345
Output: :6*/
public class Number{
	public static void main(String args[]){
		int num=12345;

		int ldigit=num%10;
		int fdigit=num;
		for(;fdigit>10;){
	/*12345>10 -true fdigit=1234
	  1234>10 -true  fdigit=123
	  123>10 -true fdigit=12
	  12>10  -true  fdigit=1
	  1>10   -false so exit from the Loop
*/
			fdigit=fdigit/10;
		}
		int sum= fdigit + ldigit;
		System.out.println("First Digit  "+fdigit);
		System.out.println("Last Digit  "+ldigit);
		System.out.println("Sum of Last and First Digits  "+sum);

	}

}
