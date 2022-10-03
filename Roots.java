class Roots{
	public static void main(String args[]){
		int a=5,b=6,c=2,d,r1,r2;
		d= b*b-4*a*c;
		if (d>0){
			r1 = int(-b + sqrt(b*b-(4*a*c)))/(2*a);
			r2 = int(-b-sqrt(b*b-(4*(a*c))))/(2*a);
			System.out.println(r1,r2);
		}
		else{
			if(d==0){
				r1=int(-b+sqrt(b*b-(4*a*c)))/(2*a);
				System.out.println("The roots are real & equal" + r1);
			}
			else{
				System.out.println("The roots are imaginary");
			}
		}
	}
}
