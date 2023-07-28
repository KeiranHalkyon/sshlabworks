#include<stdio.h>
#include<stdlib.h>

int binarySearch(int a[], int lb, int ub, int val){
	if(lb<=ub){
		int mid = (lb + ub)/2;
		if(val<a[mid])
			return binarySearch(a,lb,mid-1,val);
		else if(val>a[mid])
			return binarySearch(a,mid+1,ub,val);
		else return mid;
	}
	return -1;
}

void sort(int a[], int n){
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++)
			if(a[j]>a[j+1]){
				int t= a[j];
				a[j]= a[j+1];
				a[j+1]= t;
			}
}

void main(){
	int n, val;
	printf("Enter no. of values : ");
	scanf("%d",&n);
	int a[n];
	for(int i=0;i<n;i++){
		printf("Enter : ");
		scanf("%d",&a[i]);
	}
	sort(a, n);
	printf("Enter value to be searched : ");
	scanf("%d", &val);
	int f = binarySearch(a, 0, n-1, val);
	if(f == -1) printf("%d not present in array\n",val);
	else printf("%d present at %d position\n",val,f+1);
}
