import java.util.Scanner;

class sortStr{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter no. of Strings:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++){
			str[i]=new String(sc.next());
		}
		for(int i=0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(str[i].compareTo(str[j])>0){
					String tmp = str[i];
					str[i]= str[j];
					str[j]=tmp;
				}
			}		
		}
		System.out.print("");
		System.out.print("Sorted Strings: ");
		for(int i=0;i<n;i++){
			System.out.println(str[i]);
		}
	}	
}
