package sample_project;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the two integer number:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = gcd(x,y);
        System.out.println("gcd of "+ x + " and " + y + " is : "+ gcd);
    }

    public static int gcd(int x,int y) {
        while(y!=0) {
        	int temp=y;
        	y = x % y;
        	x = temp;
        	
        }
        return x;
    }
		
}


