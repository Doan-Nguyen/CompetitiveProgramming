#include "header/tree.h"
#include "iostream"

using namespace std;

Node* createTree(){
    /* 
               1
            /     \
           2       3
          / \     / \
         4  5    6   7
                    / \
                   8   9
    */
    Node* root_node = new Node(1);
    Node* second_node = new Node(2);
    Node* third_node = new Node(3);
    Node* fourth_node = new Node(4);
    Node* fifth_node = new Node(5);
    Node* sixth_node = new Node(6);
    Node* seventh_node = new Node(7);
    Node* eighth_node = new Node(8);
    Node* ninth_node = new Node(9);
    //
    root_node->leftNode = second_node;
    root_node->rightNode = third_node;
    second_node->leftNode = fourth_node;
    second_node->rightNode = fifth_node;
    third_node->leftNode = sixth_node;
    third_node->rightNode = seventh_node;
    seventh_node->leftNode = eighth_node;
    seventh_node->rightNode = ninth_node;
    //
    return root_node;
}

int main(){
    //  create root
    Node* newTree = new Node(0);
    newTree = createTree();
    //      get height of tree
    // int height_tree = heightTree(newTree);
    // cout << "Height of tree: " << height_tree << endl;
    //      get size of tree
    // int size_tree = sizeTree(newTree);
    // cout << "Size of tree: " << size_tree << endl;
    /*      depth first      */
    inOrderTraversalDepthFirst(newTree);

    return 0;
}