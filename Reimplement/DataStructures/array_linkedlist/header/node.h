#ifndef NODE_H
#define NODE_H

#include <iostream>

struct Node{
    int data;
    Node* next;
};

Node* createNode(int val){
    // Node* newNode = new Node();
    Node* newNode = new Node;
    newNode->data = val;
    newNode->next = NULL;
    //
    return newNode;
}

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