#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<signal.h>

void heartBreak(int sig){
	printf("But you didn't have to cut me off\n");
	sleep(1);
	printf("Make out like it never happened and that we were nothing\n");sleep(1);
	printf("And I don't even need your love\n");sleep(1);
	printf("But you treat me like a stranger, and that feels so rough");sleep(1);
	printf("No, you didn't have to stoop so low\n");sleep(1);
	printf("Have your friends collect your records and then change your number\n");sleep(1);
	printf("I guess that I don't need that, though\n");sleep(1);
	printf("Now you're just somebody that I used to know\n");sleep(1);
        raise(SIGQUIT);
}
void main(){
	signal(SIGINT,heartBreak);
	while(1){
		printf("Hi!");
		sleep(1);
	}
}
