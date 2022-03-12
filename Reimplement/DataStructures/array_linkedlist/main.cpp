/*
Reference:
https://www.coursera.org/learn/data-structures/supplement/XRXNY/slides-and-external-references
*/

#include <iostream>
#include "header/linkedlist.h"
#include "header/node.h"

using namespace std;


Node* simpleLinkedList(){
    // initialize 3 nodes
    Node* haNoi = new Node();
    Node* daNang = new Node();
    Node* saiGon = new Node();
    // connect nodes
    haNoi->data = 1;
    haNoi->next = daNang;
     
    daNang->data = 2;
    daNang->next = saiGon;
    
    saiGon->data = 3;
    saiGon->next = NULL;
    //
    return haNoi;
}

Node* insectionFront(Node* oldNode, int value){
    if (oldNode == NULL){
        cout << "Linked list empty" << endl;
    }
    else{
        //      step 1: initialize node
        Node* newNode = new Node();
        LinkedList linkedList;
        newNode = linkedList.createNode(value);
        //      step 2: connect
        newNode->next = oldNode;
        //      step 3: update
        oldNode = newNode;
        return oldNode;
    }
}

Node* insectionAfterNode(Node* oldNode, int value){
    if (oldNode == NULL){
        cout << "Linked list empty" << endl;
    }
    else{
        /*          Step 1                  */ 
        // create new node with input value
        Node* newNode = new Node();
        //
        LinkedList linkedList;
        newNode = linkedList.createNode(value);
        /*          Step 2                  */ 
        newNode->next = oldNode->next;
        /*          Step 3                  */
        oldNode->next = newNode;
        //
        return oldNode;
    }     
}       

Node* appendNode(Node* oldNode, int value){
    if (oldNode == NULL){
        cout << "Linked list empty" << endl;
    }
    else{
        // get last node
        Node* lastNode = new Node();
        // 
    }
}



int main(){
    /*
        Create single linked list includes 3 nodes
    */
    Node* exNode = simpleLinkedList();
    exNode = insectionAfterNode(exNode, 20);
    printList(exNode);
    // LinkedList a;
    // // Node* head = NULL;
    // a.addNode(5);
    // a.addNode(10);
    // // a.popBack();
    // a.addAfter(7);
    // a.printLinkedList();

    return 0;
}

