# Grokking Coding Interview Patterns in Java

## Section 1: Sliding window

### 1.1 Introduction
+ **Mục tiêu**: Giảm việc sử dụng các vòng lặp lồng nhau.
+ **Đặc trưng**:
  + Biến thể của kĩ thuật 2 con trỏ. 
    + Các con trỏ đóng vai trò thiết lập giới hạn cho cửa sổ.
  + Được hình thành trên 1 phần của cấu trúc dự liệu có tính lặp.
  + Đươc dùng để xử lý dữ liệu trong 1 phân đoạn cùng thời điểm.
+ **Áp dụng khi**:
  + Cần tính toán lặp lại trên tập hợp các dữ liệu liền kề.
    + Tính lặp đi lặp lại trực tiếp/gián tiêp dẫn đến giải pháp cuối.
  + Nên chỉ dùng khi việc tính toán tại 1 window có độ phức tạp nhỏ. (E.g: O(1), log(), ...)
+ **Không nên áp dụng khi**:
  + Dữ liệu k cho phép truy cập ngẫu nhiên
  + Có thể xử lý dữ liệu toàn bộ thay vì phân đoạn.

### 1.2 Find maximum in sliding window
+ Statement: Cho 1 dãy đầu vào, 1 cửa sổ có kích thước _w_. Tìm các giá trị lớn nhất tại mỗi cửa sổ khi trượt trên dãy số.

### 1.3 Minimum window subsequence
+ Statement: Cho 2 chuỗi _str1_ & _str2_. Tìm chuỗi con _substr_ liên tiếp trong str1 sao cho:
  + Tất cả các kí tự _str2_ đều có trong _substr_
  + Thứ tự các kí tự trùng nhau giữa _str2_ & _substr_ giống nhau.
+ Note:
  + nếu str1.length < str2.lenght -> return empty
  + nếu có nhiều substr -> return substring bên trái xa nhất
+ Pseudocode:
```
i1, i2 := 0
if (str1[i1] == str2[i2]):
  i1, i2 ++
s2, e2
s1
e1 = s1 + 1
if (str1[s1] == str2[i2]):
```

## Section 2: Two pointers

### 1.1 Introduction
+ **Mục tiêu**: Lặp qua một mảng/danh sách cho đến khi thỏa mãn điều kiện.
+ **Đặc trưng**:
  
+ **Áp dụng khi**:
  + dữ liệu đầu vào có thể duyệt theo kiểu tuyến tính. E.g: array, linked list ...
  + đã được sắp xếp.
  + Bài toán:
    + so sánh hoặc hoán đổi các giá trị bởi 2 chỉ mục
    + các chỉ số di chuyển dọc theo 1 mảng/chuỗi riêng biệt.

### 1.2 Sum of Three Values

+ Pseudocode:
```
result_list = []
sort(input_arr)
loop through the entire array & set 2 pointers (low & high)
  low := 0
  high := last_index
currSum = input_arr[low] + input_arr[high]
if currSum > sum:
   result_list.add(high)
```
