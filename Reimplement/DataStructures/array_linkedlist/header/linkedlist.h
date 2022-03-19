/* 
Refer: http://diendan.congdongcviet.com/threads/t25238::danh-sach-lien-ket-co-ban-linked-list-basic.cpp
 */
#ifndef LINKEDLIST_HPP
#define LINKEDLIST_HPP

#include "node.h"
#include <iostream>

using namespace std;


int lengthLinkedList(Node* head_input){
    int count = 0;
    while(head_input != NULL){
        count ++;
        head_input = head_input->next;
    }
    return count;
}


/*              Insertion                   */
Node* pushFront(Node* head_node, int val){
    /*  
    Step 1: create new node & assign val
    Step 2: set new node's next pointer
    Step 3: Set current's next pointer
    */
    Node* new_node = createNode(val);
    //      
    if (head_node == NULL){
        head_node = new_node;
    }
    else{
        new_node->next = head_node;
        head_node = new_node;
    }
    //    
    return head_node;
}


Node* pushBack(Node* head_node, int val){
    Node* new_node = createNode(val);
    //
    
}


void traversalLinkedList(Node* head_input){
    if (head_input == NULL){
        cout << "Linked list empty" << endl;
        return;
    }
    while(head_input != NULL){
        cout << "value: " << head_input->data << endl;
        head_input = head_input->next;
    }
    
}

#endif