import java.util.*;
import java.util.Stack;

public class collection2{
	public static void main(String args[]){
		Stack<Integer> s = new Stack<>();
		int pos, var, ele;
		Scanner sc = new Scanner(System.in);  
		while(true){
			System.out.println("1. Insertion , 2. Deletion , 3. Display ");
			System.out.println("Please enter the variable value");
			var=sc.nextInt();
			switch(var){	
				case 1: System.out.println("Enter element");
				        ele=sc.nextInt();
				        s.push(ele);
				        System.out.println(s);
				        break;
				case 2: s.pop();
			 		System.out.println(s);
			 		break;
			 	case 3: System.out.println(s);
			         	break;
			 }
 		}
 	}
 }	

