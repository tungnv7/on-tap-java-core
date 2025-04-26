# Lập trình Hướng Đối tượng (OOP)

Lập trình hướng đối tượng là một phương pháp phân tích, thiết kế và lập trình, giúp đơn giản hóa việc cung cấp một số khái niệm:

- **Object (Đối tượng)**
    - Là một thực thể cụ thể trong thế giới thực hoặc trong hệ thống.
    - Có trạng thái (thuộc tính) và hành vi (phương thức).
    - Ví dụ: Một chiếc xe có thuộc tính như màu sắc, tốc độ, và phương thức như chạy, dừng.
- **Class (Lớp)**
    - Là bản thiết kế (blueprint) để tạo ra các đối tượng.
    - Định nghĩa các thuộc tính và phương thức mà đối tượng sẽ có.
    - Ví dụ: Lớp `Car` định nghĩa các thuộc tính như `color`, `speed` và phương thức như `drive()`, `stop()`.
- **Inheritance (Kế thừa)**
    - Cho phép một lớp con (subclass) thừa hưởng các thuộc tính và phương thức của lớp cha (superclass).
    - Giúp tái sử dụng mã và mở rộng chức năng.
    - Ví dụ: Lớp `ElectricCar` kế thừa từ lớp `Car` và thêm thuộc tính `batteryLevel`.
- **Polymorphism (Đa hình)**
    - Cho phép một hành vi có thể được thực hiện theo nhiều cách khác nhau.
    - Thường được thực hiện thông qua ghi đè (overriding) hoặc nạp chồng (overloading).
    - Ví dụ: Phương thức `drive()` có thể hoạt động khác nhau giữa `ElectricCar` và `GasCar`.
- **Abstraction (Trừu tượng)**
    - Ẩn các chi tiết phức tạp và chỉ hiển thị các tính năng cần thiết.
    - Thường được thực hiện qua lớp trừu tượng (abstract class) hoặc giao diện (interface).
    - Ví dụ: Một giao diện `Vehicle` định nghĩa phương thức `move()` mà mọi phương tiện phải triển khai.
- **Encapsulation (Đóng gói)**
    - Bảo vệ dữ liệu bằng cách giới hạn quyền truy cập trực tiếp vào các thuộc tính.
    - Sử dụng các phương thức getter/setter để truy cập và thay đổi dữ liệu.
    - Ví dụ: Thuộc tính `speed` trong lớp `Car` được khai báo `private` và chỉ có thể truy cập qua `getSpeed()` hoặc `setSpeed()`.