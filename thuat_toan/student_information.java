package thuat_toan;

import java.util.Scanner;

public class student_information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập vào sv: ");
        int sv = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng sau khi đọc số nguyên
        
        for (int i = 1; i <= sv; i++) {
            System.out.println("Nhập vào họ tên sv thứ " + i);
            String hoTen = sc.nextLine();
            
            System.out.println("Nhập mã sv thứ " + i);
            String ma = sc.nextLine();
            
            // Thực hiện các thao tác khác với thông tin đã nhập
            
        }
        
        sc.close(); // Đóng đối tượng Scanner
    }
}





