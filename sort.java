import java.util.*;

class SmallNum{
	public static void main(String args[]){
		int t,i,j;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n = sc.nextInt();
		System.out.println("Enter Elements:");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(a[i]<a[j]){
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<n;i++){
			System.out.print("Smallest number : " +a[0]);
		}
		
	}
}
