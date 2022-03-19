#ifndef STACK_HPP
#define STACK_HPP

#include <iostream>
#include "../../array_linkedlist/header/node.h"


const int max = 100;

class StackWithArray{
    private:
        int top_index;
        int arrays[max];
    
    public:
        // initialze stack
        StackWithArray(){
            top_index = -1;
        }

        bool isEmpty(){
            if (top_index == -1){
                return true;
            }
            else{
                return false;
            }
        }

        void push(int input_value){
            //  check stack full
            if (top_index == max - 1){
                std::cout << "Stack full" << std::endl;
            }
            else{
                arrays[++top_index] = input_value;
            }
        }

        int pop(){
            if (isEmpty()){
                std::cout << "Stack empty, you can not pop" << std::endl;
            }
            else{
                top_index -= 1;
                return arrays[top_index];
            }
        }

        int stackTop(){
            if (isEmpty()){
                std::cout << "Stack empty" << std::endl;
            }
            else{
                return arrays[top_index];
            }
        }
};

class StackWithLinkedList{
    private:
        Node *head, *tail;
    
    public:
        StackWithLinkedList(){
            head = NULL;
            tail = NULL;            
        } 
};

Node* popStack(Node* oldNode){
    /* remove first element ~ popFront in linkedlist */
    if (oldNode == NULL){
        std::cout << "Nothing to pop" << std::endl;
        return NULL;
    }
    else{
        std::cout << "here " << oldNode->next->next << std::endl;
    }
}


Node* pushStack(Node* oldNode, Node *newNode){
    /* push new node into stack ~ push front in linked list
    */
    if (newNode == NULL){
        std::cout << "Nothing to push" << std::endl;
        return NULL;
    }
    else{
        // gan node moi cung tro den vi tri giong head
        newNode->next = oldNode;
        // cap nhat head se tro den node moi
        oldNode = newNode;
        return oldNode;
    }
}

int peek(){
    /* return the top element */
}

#endif