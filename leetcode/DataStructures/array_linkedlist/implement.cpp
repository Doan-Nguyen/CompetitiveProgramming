#include <iostream>
using namespace std;

int a [] = {1, 2, 3, 4};
int result=0;

int main(){
    for(int i=0; i < 5; i++){
        result += a[i];
    }

    cout << "Results: " <<result << endl;
    return 0;
}