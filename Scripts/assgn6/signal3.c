#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<signal.h>

int main(){
	pid_t ppid, pid, cpid;
	ppid = getpid();
	pid = fork();
	if(ppid == getpid())
		printf("Parent\n");
	else if(cpid == getpid())
		printf("Child\n");
	if(pid > 0){
		int i = 0;
		while(i++ < 5){
			printf("In the parent process.\n");
			sleep(1);
		}
	}
	else if(pid == 0){
		int i = 0;
		while(i++ < 10){
			printf("In the child process.\n");
			sleep(1);
			if(i==3){
				kill(ppid, SIGKILL);
				printf("Parent killed. I'm orphan!!!\n");
			}
		}
	}
	else{
		printf("Something bad happened\n");
		exit(EXIT_FAILURE);
	}
}
//hi
