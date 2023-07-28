#include<stdio.h>
#include<stdlib.h>

void flyodWarshall(int n, int d[][n],int pi[][n]){
	for(int k=1;k<n;k++)
		for(int i=1;i<n;i++)
			for(int j=1;j<n;j++)
				if(d[i][j]>d[i][k] + d[k][j]){
					d[i][j] = d[i][k] + d[k][j];
					pi[i][j] = pi[k][j];
				}
}

void printA(int n, int a[][n]){
	for(int i=1;i<n;i++){
		for(int j=1;j<n;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
}

void main(){
	int n;
	printf("Enter no. of vertices : ");
	scanf("%d",&n);
	n++;
	int d[n][n], pi[n][n];
	
	printf("Enter Adjacency Matrix with weight : \n");
	for(int i=1;i<n;i++)
		for(int j=1;j<n;j++){
			scanf("%d",&d[i][j]);
			if(d[i][j]!=0){
				pi[i][j] = i;	
			}
			else{
				pi[i][j] = -1;
				d[i][j] = (i==j)? 0:9999;
			}
		}
	flyodWarshall(n, d, pi);
	
	printf("\nShortest Paths : \n\n");
	printA(n,d);
	
	printf("\n\nPredecessor Matrix : \n");
	printA(n,pi);
}
