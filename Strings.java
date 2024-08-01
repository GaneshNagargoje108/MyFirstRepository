//STRING IS IMMUTABLE IN JAVA THAT MEAN ONCE YOU CREATE THE STRING WE CANNOT CHANGE IN IT BUT USING STRINGBUILDER YOU CAN

package sample_project;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String fullname = sc.nextLine();
		String a = "GANESH ";
		String b = "NAGARGOJE";
		//concatenation
		String c = a+b;
		System.out.println(c);
		//to find length of string use string_name.length() function
		//length of string c
		System.out.println(c.length());
		
		//To print the string char by char use string_name.charAt(i)
		for(int i=0;i<c.length();i++) {
			System.out.print(c.charAt(i)+"\n");
			
		}
		//to compare two strings use string_1.compareTo(string_2) it gives 0 or any positive number or any negative number
		// if '0' strings are equal
		//if 'positive number' string_1 is greater than string_2
		//if 'Negative number' string_2 is greater than string_1
		if(a.compareTo(b)==0) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}
