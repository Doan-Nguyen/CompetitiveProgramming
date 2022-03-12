#ifndef STACK_HPP
#define STACK_HPP

#include <iostream>


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

};

#endif