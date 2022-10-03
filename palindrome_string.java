import java.util.Scanner;


class Palindrome{
	public static void main(String args[]){
		String a,b="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		a = sc.nextLine();
		int length = a.length();
		for(int i = length - 1;i>=0;i--){
			b = b + a.charAt(i);
		}
		if(a.equals(b)){
			System.out.println("Palindrome String");
		}
		else{
			System.out.println("Not Palindrome String");
		}
	}
}
