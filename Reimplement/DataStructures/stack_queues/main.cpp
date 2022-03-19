#include "header/stack.h"
#include "../array_linkedlist/header/node.h"
#include "../array_linkedlist/header/linkedlist.h"
#include "../utils/utils.h"
#include "iostream"

using namespace std;


int main(){
    LinkedList linked_list;
    StackWithLinkedList stackLinkedList;
    //
    Node* newNode = new Node;
    newNode = linked_list.createNode(15);
    Node* newNode1 = new Node;
    newNode1 = linked_list.createNode(5);
    newNode->next = newNode1;
    // printList(newNode);
    //
    Node* newNode2 = new Node;
    newNode2 = linked_list.createNode(20);
    // printList(newNode2);

    // newNode = pushStack(newNode, newNode2);
    Node* n = new Node;
    n = popStack(newNode2);
    // //
    printList(n);
    return 0;
}

