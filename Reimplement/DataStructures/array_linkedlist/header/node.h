#ifndef NODE_H
#define NODE_H

#include <iostream>

struct Node{
    int data;
    Node* next;
};


int length(Node* head){
    Node* current = head;
    int count = 0;
    while(current != NULL){
        count += 1;
        current = current->next;
    }
    return count;
}


#endif