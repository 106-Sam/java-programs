import java.util.*;
class errorDivision{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter Num1 and Num2:");
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();
			int result = Num1/Num2;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException AE){
			System.out.println("Exception Handled : "+AE);
		}
		catch(NumberFormatException NFE){
			System.out.println("Exception Handled : "+NFE);
		}
	}
}
