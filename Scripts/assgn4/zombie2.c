#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

void main(){
	int i;
	int p=fork();
	if(p==0){
		for(i=0;i<20;i++){
			printf("I am child\n");
			sleep(1);
		}
	}
	else{
		printf("I am parent\n");
		while(1);
	}
}
