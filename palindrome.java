import java.util.Scanner;
class palindrome{
	public static void main(String args[]){
		int n,sum=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		int tmp=n;
		while(n>0){

			r = n % 10;
			sum = (sum*10)+r;
			n = n/10;

		}
		if (tmp==sum){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not a Palindrome");
		}
	
	}

}
