#include<stdio.h>
#include<stdlib.h>
typedef struct Node{
	long number;
	struct Node *next;
	struct Node *prev;
}Node;
Node *create(long value){
	Node *new = malloc(sizeof(Node));
	new->number=value;
	return new;
}
Node *start,*midPosition,*midPlusOne;
int count=0,flag=0;
void print(Node *first,char c){
	float v;
	Node *t = first;
	// if(first)
		// printf("\nComing inside print with %d",first->number);
	int x;
	if(!first || (c=='r' && flag==0))
		puts("Wrong!");
	else{
		if(count==1)
			printf("%li",first->number);
		else if(count%2==0){
			for(x=1;x<=count/2;x++){
				if(x==count/2){
					v=(float)(first->number+first->next->number)/2;
					printf("%1.1f",v);
					break;
				}
				first=first->next;
			}
		}else{
			for(x=1;x<=count/2;x++){
				if(x==count/2){
					printf("%li",first->next->number);
					break;
				}
				first=first->next;
			}
		}
		// printf("\nList");
		// while(t){
			// printf("- %d",t->number);
			// t=t->next;
		// }
		printf("\n");
	}
}
void insert(long value){
	//count = 0;
	Node *current = create(value);
	Node *i;
	i = start;
	if(i){
	   while(i){
			if(i->number > value){
				if(i->prev){
					// printf("\n here is %d and %d",i->prev->number,i->number);
					i->prev->next = current;
					current->prev = i->prev;
					current->next = i;
					i->prev = current;
					count++;
					// printf("\nstart here is %d",start->number);
					break;
				}
				else{ //if there is no previous element
					start=current;
					current->next=i;
					i->prev = current;
					count++;
					break;
				}
			}else{
				if(!i->next){
					i->next = current;
					current->prev = i;
					count++;
					break;
				}
			}
			i=i->next;
		}
		//If not eligible for complete split add at tail and break
		// if(i==start || ){
			// i->prev->next = current;
			// current->prev = i->prev;
			// current->next = i;
			// i->prev = current;
		// }
	}else{
		start = create(value);
		start->number = value;
		midPosition = start;
		count++;
	}
	// printf("Added and");
	// if(count%2!=0)
		// printf("\t %d and %d by two",midPosition->number,midPlusOne->number);
	// else
		// printf("\tonly one mid %d",midPosition->number);
}
void delete(long value){
	Node *i;
	i = start;
	// if(!start)
		// puts("Wrong!");
	while(i){
		if(i->number == value){
			// printf("coming inside with %d ",i->number);
				// if(i->prev && i->next)
					// puts("\nRemoving Node in the middle");
				// else if(!i->next && !i->prev && i==start)
					// puts("\nonly end");
				// else if(i->prev && i!=start)
					// puts("\nprev of end exists");
				// else if(i->next && !i->prev && i==start)
					// puts("\nnext to first exist");
				// else
					// puts("\nNone happened");
			//middle
			//check it once clear about clearing "prev and next"
			// if(i->prev && i->next){
			if(i->prev && i->next){
				// puts("Removing Node in the middle");
				i->prev->next = i->next;
				i->next->prev = i->prev;
				free(i);
				count--;
				flag=1;
				break;
			}
			//only end or only first
			else if(!i->next && !i->prev && i==start){
				// puts("only end");
				start=NULL;
				free(i);
				flag=1;
				count--;
				break;
			}
			//prev of end exist
			else if(i->prev && i!=start){
				// puts("prev of end exist");
				i->prev->next=NULL;
				free(i);
				flag=1;
				count--;
				break;
			}
			//next to first exist
			else if(i->next && !i->prev && i==start){
				// puts("next to first exist");
				start = i->next;
				free(i);
				flag=1;
				count--;
				break;
			}
			else{	//will come here if only start
				//printf("none happened with %d and %d",i->prev->number,i->number);
				if(start==i){
					// puts("correct");
					free(i);
					start=NULL;
					flag=1;
					count--;
					break;
				}
			}
		}
		i=i->next;
	}
	
	
}
int main(){
	int t,i;
	// float x=3.1345;
	scanf("%d",&t);
	// printf("\nDetails are------------: %1.1f",(3/2));
	// printf("\nDetails are------------: %1.5f",x);
	char choice[t];
	long value[t];
	for(i=0;i<t;i++){
		scanf("\n\n\n %c %li\n",&choice[i],&value[i]);
	}
	for(i=0;i<t;i++){
		// printf("\n%c %d",choice[i],value[i]);
		if(choice[i] == 'a'){
			insert(value[i]);
			print(start,NULL);
		}
		else if(choice[i] == 'r'){
			delete(value[i]);
			print(start,choice[i]);
		}
	}
	return 0;
}