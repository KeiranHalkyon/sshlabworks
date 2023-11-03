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

Node* firstFit(Node *head,int val){
	Node *temp,*temp1;
	temp=head;
	temp1=temp;
	temp=temp->next;
	while(temp!=NULL){
		if(temp->pid<0){
			if(((temp->length)-val>=0)){
				return temp1;
			}
		}
		temp1=temp;
		temp=temp->next;
	}
	return NULL;
}

Node* bestFit(Node *head,int val){
	Node *temp,*temp1,*temp2=NULL;
	temp=head;
	temp1=temp;
	temp=temp->next;
	int var=-1;//variable to store lengthth of hole
	while(temp!=NULL){
		if(temp->pid<0){//hole finding
			if((temp->length)-val==0){
				return temp1;
			}
			else if((temp->length)-val>0){
		        if((var-(temp->length)>0 && var!=-1) || var==-1){
		 		 	var=temp->length;
		 		 	temp2=temp1;
				}
				//return temp2;
			}
		}	
		temp1=temp;
		temp=temp->next;
	}
	return temp2;
}

Node* worstFit(Node *head,int val){
	Node *temp,*temp1,*temp2=NULL;
	temp=head;
	temp1=temp;
	temp=temp->next;
	int var=-1;//variable to store lengthth of hole
	while(temp!=NULL){
		if(temp->pid<0){//hole finding
			if((temp->length)-val>0){
		        if((var-(temp->length)<0 && var!=-1) || var==-1){
		 		 	var=temp->length;
		 		 	temp2=temp1;
				}
				//return temp2;
			}
			/*else{//process encountered
				temp1=temp;
				temp=temp->next;
			}*/
		}
		temp1=temp;
		temp=temp->next;
	}
	return temp2;
}

void printL(Node *head){
	Node *temp=head->next;
	while(temp!=NULL){
		printf("PID : %d\tStart : %d\tLength : %d\n",temp->pid,temp->start,temp->length);
		temp=temp->next;
	}
}

void printN(Node *head){
	if(head==NULL){
		printf("Null pointer\n");
		return;
	}
	printf("PID : %d\tStart : %d\tLength : %d\n",head->pid,head->start,head->length);
}

/*void memPlot(Node *head){
	Node *temp=head->next;
	int l;
	while(temp!=NULL){
		printf("-------\n");
		char ch=(temp->pid>=0)?'#':'x';
	}
}*/

int main(){
	Node *head=(Node*)malloc(sizeof(Node)), *temp;
	head->pid=head->start=head->length=-2;

	head->next=(Node*)malloc(sizeof(Node));
	head->next->pid=-1;
	head->next->start=0;
	head->next->length=100;

	//printL(head);
	alloc(head,112,4);
	//printL(head);
	alloc(head->next,3456,50);
	printL(head);
	printf("------------------\n");
	int dl=dealloc(head,112);
	printL(head);
	printf("D : %d\n-----------\n",dl);
	/*dl=dealloc(head,3456);
	printL(head);*/
	temp=worstFit(head,3);
	printN(temp);
}
