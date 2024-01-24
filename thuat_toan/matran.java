package thuat_toan;

import java.util.Scanner;

public class matran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so hang cua ma tran: ");
        int m = sc.nextInt();
        System.out.print("Nhap vao so cot cua ma tran: ");
        int n = sc.nextInt();
        int A[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap vao phan tu A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        // In ma trận
        System.out.println("Ma tran vua nhap:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Đóng đối tượng Scanner
    }
}