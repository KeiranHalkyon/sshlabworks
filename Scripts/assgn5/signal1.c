#include<stdio.h>
#include<stdlib.h>
#include<signal.h>
#include<unistd.h>
void oh(int sig){
	printf("OH! I have got a signal %d\n",sig);
	//signal(SIGINT, oh); //recalls oh() on ^C
	signal(SIGINT,SIG_DFL);
}
int main(){
	signal(SIGINT,oh);
	while(1){
		printf("Hello World!\n");
		sleep(1);
	}
}
