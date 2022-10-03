#include<stdio.h>
#include<string.h>

int main(){

	int n,a[10][10];
	// Input key matrix
	printf("Enter n value:\n");
	scanf("%d",&n);
	printf("Enter %d Key in Matrix:\n",n+n);
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		
			scanf("%d",&a[i][j]);
		}
	}
	printf("The Key Matrix:\n");
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			printf("%d ",a[i][j]);
		}
		printf("\n\n");
	}
	// input plaintext
	int c[100], d[100],b[100][100];
	char msg[100];
	int det=0,t=0;
	printf("Enter plain text\n");
	scanf("%s",&msg);
	// Plain Text to Number
	for(int i=0;i< strlen(msg);i++){
		c[i]=msg[i] - 65;
		printf("%d ",c[i]);
	}
	for(int i=0;i<strlen(msg);i++){
		t = 0;
		for(int j=0; j< strlen(msg);j++){
			t = t + (a[i][j] * c[j]);		
		}
		d[i]=t%26;
	}
	// Encryption 
	printf("Encrypted Cipher Text:\n");
	for(int i=0;i<strlen(msg);i++){
		printf(" %c",d[i] + 65);
	for(int i=0; i< strlen(msg);i++){
		t = 0;
		for(int j =0;j<strlen(msg);j++){
			t = t + (b[i][j] * d[j]);
		}
		c[i] = t % 26;
	
	}
	}


}
