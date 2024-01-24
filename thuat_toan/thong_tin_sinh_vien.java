package thuat_toan;

import java.util.Scanner;

public class thong_tin_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong sinh viên cua lop: ");
        int sv = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String S[][] = new String[sv][5];

        for (int i = 0; i < sv; i++) {
            System.out.print("Nhap thong tin cua sinh viên thu " + (i + 1) + "\n");
            System.out.print("Ho tên: ");
            S[i][0] = sc.nextLine();
            System.out.print("Điểm Toan: ");
            S[i][1] = sc.nextLine();
            System.out.print("Điểm Ly: ");
            S[i][2] = sc.nextLine();
            System.out.print("Điểm Hoa: ");
            S[i][3] = sc.nextLine();
            S[i][4] = String.valueOf((Double.parseDouble(S[i][1]) + Double.parseDouble(S[i][2]) + Double.parseDouble(S[i][3])) / 3);
        }

        System.out.println("Danh sach sinh viên:");

        for (int j = 0; j < sv; j++) {
            for (int j2 = 0; j2 < 5; j2++) {
                System.out.print(S[j][j2] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}