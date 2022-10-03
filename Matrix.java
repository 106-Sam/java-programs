import java.util.*;

class Matrix{
	public static void main(String args[]){
		int i,j,m,n,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m,n values:");
		m = sc.nextInt();
		n = sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int mul[][]=new int[m][n];
		System.out.println("Enter A elements:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j] = sc.nextInt();
			}
		
		}
		System.out.println("Enter B elements:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Product of Two matrices:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				for(k=0;k<n;k++){
					mul[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
			
	}
}
