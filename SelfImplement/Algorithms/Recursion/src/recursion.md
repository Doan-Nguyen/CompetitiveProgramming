# Recursion

## Định nghĩa 
+ Hàm tự gọi đến chính nó


## Khi nào sử dụng đệ quy ?
+ khi xuất hiện **yếu tố đệ quy**
+ Yếu tố đệ quy:
  + bài toán cơ sở/điều kiện dừng 
  + Công thức quy nạp: đưa về bài toán con nhỏ hơn

## Phân loại đệ quy
+ Bài toán 1: in giá trị của 1 mảng số nguyên
  + in các phần tử theo thứ tự: 0 -> n - 1
  + in các phần tử theo thứ tự: n - 1 -> 0
+ Phân loại đệ quy theo thứ tự thực hiện công việc so với đệ quy:
  + thực hiện trước đệ quy
  + thực hiện sau đệ quy

## Đánh giá
+ Ưu:
  + Ngắn gọn -> dễ implement
+ Nhược:
  + Xử lý không đúng -> StackOverflow
  + Tốn hiệu năng _thời gian_ & _mem_

## Khử đệ quy
+ Tối ưu đệ quy:
  + Đệ quy có nhớ: lưu lại các kết quả đã tính trước đó
  + Tối ưu đệ quy: hạn chế sử dụng đệ quy ~> tính ra kết quả