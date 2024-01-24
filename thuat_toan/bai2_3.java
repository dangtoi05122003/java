package thuat_toan;

import java.util.Scanner;

public class Bai2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        String S1 = sc.nextLine();
        int t = 0;

        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) != '.') {
                t += Integer.parseInt(String.valueOf(S1.charAt(i)));
            }
        }

        System.out.println("Tổng các chữ số nhị phân: " + t);
        sc.close(); // Đóng đối tượng Scanner
    }
}