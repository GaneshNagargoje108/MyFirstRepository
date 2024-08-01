package sample_project;
import java.util.*;
public class Functions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum = " + add(a,b));
		System.out.println("Mul = " + mul(a,b));
		System.out.println("Factorial of first number = " + factorial(a));

	}
	public static int add(int a, int b) {
		// static is compulsory to call the function inside the main function 
		int sum = a + b ;
		return sum;
	}
	public static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}
	public static int factorial(int a) {
		//this function is only for positive number a
		int fact = 1;
		if(a==0) {
			return 1;
		}
		for(int i=a;i>=1;i--) {
			fact = fact * i;
		}
		return fact;
	}

}
//both main function and the function which you have created are inside the class
//The function call is inside the main function 
//if return type is void means it returns nothing 
