/*
Reference:
https://www.coursera.org/learn/data-structures/supplement/XRXNY/slides-and-external-references
*/

#include <iostream>
#include "header/linkedlist.h"

using namespace std;



int main(){
    /*
        Create single linked list includes 3 nodes
    */
    LinkedList a;
    // Node* head = NULL;
    a.addNode(5);
    a.addNode(10);
    // a.popBack();
    a.addAfter(7);
    a.printLinkedList();

    return 0;
}

