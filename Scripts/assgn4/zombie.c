#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main(){
	int p;
	p=fork();
	if(p==0)
		printf("Child process\n");
	else if(p>0){
		sleep(5);
		printf("Parent Process\n");
		printf("Zombie process\n");
		while(1){}
		return 1;
	}
}
