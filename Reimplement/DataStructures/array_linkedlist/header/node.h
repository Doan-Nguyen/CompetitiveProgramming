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

void printList(Node* n){
    while(n != NULL){
        std::cout << "Node's value: " << n->data << std::endl;
        // next node
        n = n->next;
    }
}

#endif