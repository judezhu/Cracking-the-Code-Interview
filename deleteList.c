/*
 * deleteList.c
 *
 *  Created on: Feb 19, 2014
 *      Author: judezhu
 */
//assume this list can't be empty
//assume there is no global head pointer

#include <stdio.h>
#include <stdlib.h>

struct node {
	int value;
	struct node *next;
};

//delete all the nodes which has the same value with num
void deleteNode1 (struct node *head, int num){
	//check whether list is null
	if(head == NULL){
		printf("this list is empty");
	}
	else{
		//the list is not empty, then

		//if head has this value
		if(head->value == num){
			if(head->next == NULL){
				printf("this list has only one node. couldn't delete");
			}
			else
			{	//doesn't have the pointer to head, so couldn't change the value of head
				//do a trick like this
				head->value = head->next->value;
				free(head->next);
				head->next = head->next->next;
				printf("Remove %d from the head of the list.\n", num);
			}
		}
		else{
			struct node *prev = head;
			while(prev->next!= NULL){
				if(prev->next->value == num){
					if(prev->next->next!=NULL){
						free(prev->next);
						prev->next = prev->next->next;
						printf("remove %d from this list.\n", num);

					}
					else{
						free(prev->next);
						prev->next = NULL;
						printf("remove %d from the end of this list.\n", num);
					}
				}
				else{
					prev = prev->next;
				}
			}
		}
	}

}


/* Utility function to insert a node at the begining */
void push(struct node **head_ref, int new_data)
{
    struct node *new_node =
        (struct node *)malloc(sizeof(struct node));
    new_node->value = new_data;
    new_node->next = *head_ref;
    *head_ref = new_node;
}

/* Utility function to print a linked list */
void printList(struct node *head)
{
    while(head!=NULL)
    {
        printf("%d ",head->value);
        head=head->next;
    }
    printf("\n");
}

int main(){
	struct node *head;

	/* Create following linked list
      12->15->10->11->5->6->2->3 */
	push(&head,3);
	push(&head,10);
	push(&head,10);
	push(&head,15);
	push(&head,12);

	printf("Given Linked List: ");
	printList(head);

	deleteNode1(head, 12);
	deleteNode1(head, 10);
	deleteNode1(head, 3);
	printf("Modified Linked List: ");
	printList(head);

	return 0;
}
