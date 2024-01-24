package thuat_toan;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int x = sc.nextInt();
        int sum = 0;

        while (x != 0) {
            sum += x % 2;
            x = x / 2;
        }

        System.out.println("Tổng các chữ số nhị phân: " + sum);
        sc.close(); // Đóng đối tượng Scanner
    }
}