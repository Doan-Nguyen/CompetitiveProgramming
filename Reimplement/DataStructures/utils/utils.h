#include "iostream"
#include "../array_linkedlist/header/node.h"

using namespace std;

void printList(Node* n){
    while(n != NULL){
        std::cout << "Node's value: " << n->data << std::endl;
        // next node
        n = n->next;
    }
}