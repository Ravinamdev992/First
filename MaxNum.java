package oct04;

	import java.util.Scanner;

	public class MaxNum{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input two numbers
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
	        
	        // Find the maximum using the ternary operator
	        double maximum = (num1 > num2) ? num1 : num2;
	        
	        System.out.println("The maximum number is: " + maximum);
	    }
	}



