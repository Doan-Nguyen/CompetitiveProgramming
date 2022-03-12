#ifndef LINKEDLIST_HPP
#define LINKEDLIST_HPP

#include "node.h"
#include <iostream>

using namespace std;


class LinkedList{
    private:
        Node *head, *tail;
    public:
        LinkedList(){
            head = NULL;
            tail = NULL;
        }

        Node* createNode(int value){
            Node* newNode = new Node;
            //
            newNode->data = value;
            newNode->next = NULL;
            //
            return newNode;
        }

        void addNode(int value){
            /*
            visualization: https://www.cpp.edu/~ftang/courses/CS240/lectures/slist.htm
            */
            // allocate node
            Node* newNode = new Node;
            newNode = createNode(value);
            //
            if (head == NULL){
                head = newNode;
                tail = newNode;
            }
            else{
                // noi tail -> new node
                tail->next = newNode;
                // update tail
                tail = tail->next;
            }
        }

        void pushFront(int key){
            // create new node
            Node* new_node = new Node();
            new_node->data = key;
            //  newNode tro den cung vi tri voi head   
            new_node->next = head;
            //  newNode dc gan la head hien tai
            head = new_node;
            if (tail == NULL){
                tail = head;
            }
        }

        // void topFront(){
        //     /*
        //     return front item
        //     */
        //     if (head->next == NULL){
        //         cout << "Linked list empty" << endl;
        //     }
        //     else{
        //         return head->next;
        //     }
        // }

        void popFront(){
            // Update head to node 2nd
            if (head == NULL){
                cout << "Error" << endl;
            }
            head = head->next;
            if (head == NULL){
                tail = NULL;
            }
        }

        void pushBack(int value){
            /*
            Visualization: https://drive.google.com/file/d/1YCFs4a8lzYLOLIGOLo1RiSha_ouw3HaG/view?usp=sharing
            */
            Node* newNode = new Node;
            newNode = createNode(value);
            newNode->next = tail;
            //
            if (tail == NULL){
                head = newNode;
                tail = newNode;
            }
            else{
                tail->next = newNode;
                tail = newNode;
            }
        }

        void popBack(){
            /*
            Visualization: https://drive.google.com/file/d/1Qw26H0jPMS9Bjw9MF3_ogUINUnC97FAv/view?usp=sharing
            */
            if (head == NULL){
                cout << "Error: empty list" << endl;
            }
            if (head == tail){
                head = NULL;
                tail = NULL;
            }
            else{
                Node* tmp = new Node;
                tmp = head;
                while(tmp->next->next != NULL){
                    tmp = tmp->next;
                }
                tmp->next = NULL;
                tail = tmp;
            }
        }

        void addAfter(Node* givenNode, int value){
            //
            Node* node_temp = new Node;
            node_temp->data = value;
            // node_temp->next = this->head->next;
            node_temp->next = givenNode->next;
            givenNode->next = node_temp;
        }

};





#endif