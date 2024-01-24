package thuat_toan;

import java.util.Scanner;

public class toan_tu {

        public static void main(String[] args) {
           int a, b;
           Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: "); //print thay vì println, nó sẽ in ra, nhưng không xuống dòng

        a = sc.nextInt(); // sc.nextInt() là cách để lấy giá trị từ bàn phím, nó sẽ chờ tới khi chúng ta nhập một số.
        System.out.print("Nhap b: ");
        b = sc.nextInt();

           System.out.print("a * b = ");
           System.out.print((a * b));
           System.out.print((a / b));
           System.out.printf("\na / b = " + (a / b));
        }
}
