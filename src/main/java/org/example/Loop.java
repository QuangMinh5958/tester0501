package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //Loop while

//        --giá trị ban đầu--
//        while(--điều kiện--) {
//            --thực hiện logic--
//
//            --thay đổi giá trị ban đầu--
//        }

        // Bài tập: Viết chương trình cho phép người dùng nhập số n, in ra giao diện n lần dòng hello testing 05

        System.out.println("Nhập số lần lặp: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (0 < n) {
            System.out.println("hello testing 05");
            n--;
        }

        //Vòng lặp do... while
//        giá trị ban đầu
//        do {
//            --thực hiện logic--
//
//            --làm thay đổi giá trị ban đầu--
//        } while (--điều kiện--)

        int index = 1;
        do {
            System.out.println("Giá trị i: " + index);
            index++;
        } while (index <= 5);

        //Vòng lặp for
        //for(--giá trị khởi tạo-- ; --điều kiện-- ; --cập nhật giá trị khởi tạo--)
        for(int j = 1; j <= 5; j++) {
            System.out.println("Giá trị j: " + j);
        }

        //Bài tập 1:
        System.out.println("Nhập giới hạn 1: ");
        int numN1 = scanner.nextInt();
        int totalN1 = 0;
        for (int k1 = 0; k1 <= numN1; k1++) {
            totalN1 += k1;
        }
        System.out.println("Tổng N1: " + totalN1);

        //Bài tập 2:
        System.out.println("Nhập giới hạn2: ");
        int numN2 = scanner.nextInt();
        int totalN2 = 0;
//        for (int k2 = 0; k2 <= numN2; k2++) {
//            if (k2 % 2 == 0) {
//                totalN2 += k2;
//            }
//        }
        //Cách 2:
        // Lấy số chẵn
        for (int k2 = 0; k2 <= numN2; k2+=2) {
            totalN2 += k2;
        }
        //Lấy số lẻ => đổi k2 = 1
        //chia hết cho 3 => k2 = 3, k2+=3

        System.out.println("Tổng N2: " + totalN2);
    }
}
