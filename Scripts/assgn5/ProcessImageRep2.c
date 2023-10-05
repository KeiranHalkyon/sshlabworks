#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main(){
	char* command="ls";
	char* argument_list[]={"ls","-l",NULL};
	//char* argument_list[]={NULL};
	printf("Before calling execvp()\n");

	int status_code = execvp(command, argument_list);
	//execvp() will take control of the process
	if(status_code==-1){
		printf("Process did not terminate correctly\n");
		exit(1);
	}
	printf("This line will not be printed if execvp() runs correctly\n");
	return 0;
}
