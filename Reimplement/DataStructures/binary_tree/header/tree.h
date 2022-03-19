#ifndef TREE_HPP
#define TREE_HPP

#include <iostream>
#include <algorithm>

using namespace std;

/*     Root         */
struct Node{
    int data;
    Node* leftNode;
    Node* rightNode;

    Node(int val){
        data = val;
        leftNode = NULL;
        rightNode = NULL;
    }
};



int heightTree(Node* inputTree){
    if (inputTree == NULL){
        return 0;
    }
    return 1 + std::max(heightTree(inputTree->leftNode), 
                        heightTree(inputTree->rightNode));
}

int sizeTree(Node* inputTree){
    /* 
    Note: size of tree = number_all_nodes - 1 (root)
    */
    if (inputTree == NULL){
        return 0;
    }
    return 1 + sizeTree(inputTree->leftNode) + 
               sizeTree(inputTree->rightNode);
}

void inOrderTraversalDepthFirst(Node* inputTree){
    /*  Di chuyen lan luot cac cay con dong cap    */
    if (inputTree == NULL){
        // exit function
        return;
    }
    inOrderTraversalDepthFirst(inputTree->leftNode);
    cout << inputTree->data << endl;
    inOrderTraversalDepthFirst(inputTree->rightNode);
}

void preOrderTravesalDepthFirst(Node* inputTree){
    if (inputTree == NULL){
        return;
    }
    cout << inputTree->data << endl;
    preOrderTravesalDepthFirst(inputTree->leftNode);
    preOrderTravesalDepthFirst(inputTree->rightNode);
}

void postOrderTravesalDepthFirst(Node* inputTree){
    if (inputTree == NULL){
        return;
    }
    postOrderTravesalDepthFirst(inputTree->leftNode);
    postOrderTravesalDepthFirst(inputTree->rightNode);
    cout << inputTree->data << endl;
}

void levelTraversalBreadthFirst(Node* inputTree){
    
}

#endif 