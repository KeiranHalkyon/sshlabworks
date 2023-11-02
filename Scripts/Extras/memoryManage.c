#include<stdio.h>
#include<stdlib.h>

struct Node{
	int pid, start, length;
	struct Node* next;
};
typedef struct Node Node;

void alloc(Node *head, int pid, int length){
	Node *proc=(Node *)malloc(sizeof(Node)), *hole=head->next;
	proc->pid=pid;
	proc->start=hole->start;
	proc->length=length;
	hole->start+=length;
	hole->length-=length;
	if(hole->length<=0){
		proc->next=hole->next;
		free(hole);
	}
	else proc->next=hole;
	head->next=proc;
}

int dealloc(Node *head, int pid){
	Node *pre=head, *temp=head->next;
	while(temp!=NULL){
		if(temp->pid!=pid){
			pre=temp;
			temp=temp->next;
			continue;
		}
		temp->pid=-1;
		if(temp->next->pid==-1){
			Node *nt=temp->next;
			temp->length+=nt->length;
			temp->next=nt->next;
			free(nt);
		}
		if(pre->pid==-1){
			pre->length+=temp->length;
			pre->next=temp->next;
			free(temp);
		}
		return 1;
	}
	return 0;
}

void printL(Node *head){
	Node *temp=head->next;
	while(temp!=NULL){
		printf("PID : %d\tStart : %d\tLength : %d\n",temp->pid,temp->start,temp->length);
		temp=temp->next;
	}
}

int main(){
	Node *head=(Node*)malloc(sizeof(Node));
	head->pid=head->start=head->length=-2;
	head->next=(Node*)malloc(sizeof(Node));
	head->next->pid=-1;
	head->next->start=0;
	head->next->length=100;
//	printL(head);
	alloc(head,112,4);
//	printL(head);
	alloc(head->next,3456,50);
	printL(head);
	printf("------------------\n");
	int dl=dealloc(head,3456);
	printL(head);
	printf("D : %d\n-----------\n",dl);
	/*dl=dealloc(head,3456);
	printL(head);*/
}
