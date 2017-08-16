#include<stdio.h>
#include<stdlib.h>
#define GETC ({char x;scanf("%c ", &x);x;})
#define GETL ({long x;scanf("%li\n", &x);x;})
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
Node *start,*midPosition;
int count=0,flag=0;
void print(Node *first,char c){

}
void insert(long value){
	//printf("\ntrying to insert %li",value);
	//count = 0;
	Node *current = create(value);
	Node *i;
	i = start;
	if(i){
	   flag=0;
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
					flag=1;
				}
				else{ //if there is no previous element
					start=current;
					start->next=i;
					i->prev = start;
					count++;
					flag=1;
				}
			}else{
				//Try swapping trick
				if(!i->next){
					i->next = current;
					current->prev = i;
					count++;
					flag=1;
				}
			}
			i=i->next;
			if(flag==1){
				if((count-1)%2==0){
					if(midPosition->number < value){
						midPosition=midPosition->next;
					}
				}else{
					if(midPosition->number > value){
						midPosition=midPosition->prev;
					}
				}
				printf("\nInserted %li and New Mid position is %li and no of elements is %d",value,midPosition->number,count);
				if(count%2==0)
					printf("\n Double Mid is %1.1f",((double)midPosition->number+(double)midPosition->next->number)/2);
				else
					printf("\n Single Mid is %li",midPosition->number);
					
				break;
			}
		}//If not eligible for complete split add at tail and break //if(i==start || ){
	}else{
		start = create(value);
		start->number = value;
		midPosition = start;
		count++;
		printf("\nInserted %li and New Mid position is %li and no of elements is %d",value,midPosition->number,count);
		if(count%2==0)
			printf("\n Double Mid is %1.1f",((double)midPosition->number+(double)midPosition->next->number)/2);
		else
			printf("\n Single Mid is %li",midPosition->number);
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
	// printf("\nDetails are------------: %1.1f",(3/2));
	// printf("\nDetails are------------: %1.5f",x);
	// float x=3.1345;
	long t,i;
	t=GETL;
	char choice[t];
	long value[t];
	for(i=0;i<t;i++){
		choice[i]=GETC;
		value[i]=GETL;
	}
	for(i=0;i<t;i++){
		// printf("\n%c %li	",choice[i],value[i]);
		if(choice[i] == 'a'){
			insert(value[i]);
			//print(start,NULL);
		}
		else if(choice[i] == 'r'){
			delete(value[i]);
			//print(start,choice[i]);
		}
	}
}
