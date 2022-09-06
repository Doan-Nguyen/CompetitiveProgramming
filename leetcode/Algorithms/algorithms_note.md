# Algorithms note 

## 1. Searching

### 1.1 Binary searching

+ Linear Search Approach: 
  + Time complexity: O(n)

+ Binary Search Approach: 
  + thực hiện việc sorted array bằng việc lặp lại chia đôi tìm kiếm cho 1 nửa.
  + Idea: sử dụng các mảng đã sắp xếp để giảm việc tìm kiếm xuống O(log(n)).

+ Pseudo-code:
```
binarySearch(arr, x, low, high)
    //          repeat till low = high
    while (low <= high):   
        mid = (low + high)/2
        if (x == arr[mid]):
            return mid
        else if (x > arr[mid]):
            low = mid + 1
        else:
            high = mid - 1
    return -1            
```

+ Đánh giá: 
  + Thuật toán vẫn hơi chậm. 
  + Cải thiên: 
    + **Decrease-and-conquer**:  
    ```
    mid = low + (high - low)/2;
    ```
## 2. Sorting

## 3. Techniques

### 3.1 Two pointers

+ ví dụ 1: [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)

+ **Note**: phần này mình tham khảo nhiều nguồn:
  + [Lý thuyết- Kĩ thuật hai con trỏ](https://vnoi.info/wiki/algo/basic/two-pointers.md)
  + [Lý thuyết- Two Pointers Technique](https://www.geeksforgeeks.org/two-pointers-technique/?ref=gcse)
  + [Practice](https://leetcode.com/tag/two-pointers/)

