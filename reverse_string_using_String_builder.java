package sample_project;
import java.util.*;
public class reverse_string_using_String_builder {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.nextLine();   // Taking input from user   
		StringBuilder sb =new StringBuilder(s);  //creating stringBuilder
		for(int i=0;i<sb.length()/2;i++) {
			int front = i;
			int back = sb.length()-i-1;
			char front_char=sb.charAt(front);  //finding the value at front
			char back_char = sb.charAt(back);  //finding the value at back

			
			sb.setCharAt(front, back_char);  //setting the back_char at front position   
			sb.setCharAt(back, front_char);  //setting the front_char at back position  
		}
		//printing the output in systematic manner
		System.out.println("Reverse of "+ s +" is: "+ sb);
	}

}
//STRING BUILDER FUNCTIONS ARE AS FOLLOW 

//INITIALIZING / SETTING STRING BUILDR -> StringBuilder object_name = new StringBuilder(string_name);

//FINDING THE LENGTH OF STRING -> object_name.length();

//FINDING THE CHAR AT I POSITION -> object_name.charAt(I);

//SET CHAR AT X POSITION ->  object_name.setCharAt(X,'char_name');

//INSERT AT Y POSITION -> object_name.insert(Y,'char_name');

//TO DELETE THE CHAR OR SUBSTRING -> object_name.delete(start_index, end_index); 
//where start_index is inclusive and end_index is exclusive

//APPEND THE CHAR AT THE END OF THE STRING -> object_name.append('char_name');
//HERE NEW STRING IS NOT CREATED THE CHANGE IS IN THE SAME STRIND DUE TO THAT CODE IS EFFICIENT 

//The replace method modifies a StringBuilder object by replacing a specified range of characters with a new string.
//->object_name.replace(0, 4, "string");