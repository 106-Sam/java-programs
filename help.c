#include<stdio.h>

int main(){
	int m,n,a[100][100],b[100][100],c[100][100];
	printf("Enter m, n values for A matrix:\n");
	scanf("%d%d",&m,&n);
	printf("Enter A matrix values:\n");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	}
	printf("Enter m,n values for B matrix:\n");
	scanf("%d%d",&m,&n);
	printf("Enter B matrix values:\n");
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			scanf("%d",&b[i][j]);
		}

	}
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				c[i][j]+=a[i][k]*b[k][j];
			}

		}

	}
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			printf("%d ",c[i][j]);
		
		}
		printf(" ");
	}
}
