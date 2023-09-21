#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>

int main(){
	int data_processed;
	int file_pipes[2];
	const char some_data[] = "Hello World";
	char buffer[BUFSIZ + 1];
	pid_t fork_result;
	memset(buffer, '\0', sizeof(buffer));
	//printf("hi\n");
	if (pipe(file_pipes)==0){
		fork_result = fork();
		printf("hi\n");
		if(fork_result == -1){
			fprintf(stderr, "fork_failure");
			exit(EXIT_FAILURE);
		}
		else if(fork_result == 0){//child
			sleep(2);
			data_processed = read(file_pipes[0], buffer, BUFSIZ);
			printf("Child read %d bytes : %s\n", data_processed, buffer);
			exit(EXIT_SUCCESS);
		}
		else{//parent
			data_processed = write(file_pipes[1], some_data, strlen(some_data));
			printf("Parent wrote %d bytes : %s\n", data_processed, some_data);
		}
	}
	exit(EXIT_SUCCESS);
}
