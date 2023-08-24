#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int gl=5;

void main(){
	int pid, i=10;
	pid = fork();
	if(pid<0){
		printf("Fork unsuccessful\n");
		exit(0);
	}
	else if(pid == 0){
		//child pid, process id, parent pid
		//will work on unforked
		//i=45;
		i++;
                printf("i %d gl %d\n",i,gl);
		printf("%d %d %d\n",pid,getpid(),getppid(),i);
		sleep(3);

	}
	else{
		i++;
		gl++;
		printf("i %d gl %d\n",i,gl);
		printf("%d %d %d\n",pid,getpid(),getppid());
	}
	printf("Ended\n");
}
