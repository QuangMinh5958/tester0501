package org.example;

import java.util.Scanner;

public class baitap2 {

    // --Mô hình IPO--
    // - input
    // giá trị từ phía người dùng

    // - process
    // giá trị từ người dùng nhập đi thực hiện logic yêu cầu của bài toán

    // - output
    // giá trị đầu ra từ yêu cầu của đề

    static int tongLuong (int ngay ,int luong){
        return ngay * luong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số ngày làm: ");
        int ngay = scanner.nextInt();

        System.out.println("Nhập số tiền lương 1 ngày: ");
        int luong = scanner.nextInt();

        System.out.println("Tổng lương: " + tongLuong(ngay, luong));
    }
}
