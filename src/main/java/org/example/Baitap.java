package org.example;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);

//        System.out.println("Tên người dùng: ");
//        String name = scanner.nextLine();
//        System.out.println("Lương 1 ngày: ");
//        int monney = scanner.nextInt();
//        System.out.println("Tổng số ngày làm: ");
//        int day = scanner.nextInt();
//
//        System.out.println("Tổng lương: " + day * 10);

        System.out.println("Nhập tên người dùng: ");
        String name = scanner.nextLine();

        System.out.println("Nhập điểm toán: ");
        float toan = scanner.nextInt();

        System.out.println("Nhập điểm Lý: ");
        float ly = scanner.nextInt();

        System.out.println("Nhập điểm Hóa: ");
        float hoa = scanner.nextInt();

        System.out.println("Người dùng tên " + name + "có điểm trung bình 3 môn là " + (toan + ly + hoa)/3);
    }
}
