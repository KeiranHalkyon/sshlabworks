#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<errno.h>
int main(){
	printf("I am parent process\n");
	
	char *arg_ptr[4];
	arg_ptr[0] = "childEXECV.c";
        arg_ptr[1] = "Hi from child";
        arg_ptr[2] = "Bye from child";
        arg_ptr[3] = NULL;

	int st = execvp("./Cexecv", arg_ptr);
	printf("Error: %i\n", errno);
}
