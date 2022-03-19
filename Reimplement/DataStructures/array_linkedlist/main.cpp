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



int main(){
    /*
        Create single linked list includes 3 nodes
    */
    Node* head = new Node;
    head = pushFront(head, 5);
    head = pushFront(head, 10);
    // cout << head << endl;
    // head = pushBack(head, 20);
    traversalLinkedList(head);

    return 0;
}

