# Data Structures Easy to Advanced Course [link](https://www.youtube.com/watch?v=RBSGKlAvoiM&t=2503s&ab_channel=freeCodeCamp.org)


## Stack

### Stack introduction

+ A stack is a one-ended linear data structure which models a real world stack by having 2 primary operations:
  + push
  + pop
+ Stack's behavior: **L**ast **I**n **F**irst **O**ut

![stack introduction](./figures/stack_introduction.PNG)


+ When & Where is a Stack used ?
  + Used by undo mechanisms in text editors
  + Used in compiler syntax checking for matching brackets '[]' & braces '{}' 
  + Can be used to model a pile of books or plates
  + Used behind the scenes to support recursion by keeping track of previous function calls.
  + Can be used to do a Depth First Search (DFS) on a graph.

+ Complexity:
  + Pushing, Popping, Peeking (truy xuất phần tử ở top), Size: O(1)
  + Searching: O(n)

+ Example - Brackets (pseudo code): 

```
s := initStack()
for bracket in bracketString:
  reversedBracket = getReversedBracket(bracket)
  
  if isLeftBracket(bracket):
    s.push(bracket)
  else if s.isEmpty() || s.pop() != bracket:
    return false
  return s.isEmpty() 
```
  

### Stack implementation

## Stack practice


## Queue 

### Queue introduction

### Queue implementation

### Queue practice 


## Priority queue

### Priority queue introduction

### Priority queue Min Heaps & Max Heaps

### Priority queue Inserting Elements

### Priority queue Removing Elements

### Priority queue code/practice

