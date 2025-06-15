package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lệnh xuất
        System.out.println("hello wordh");
        //Snippet lệnh xuất - gõ sout
        System.out.println("Hello bro");

        //Lệnh nhập - Scanner
        Scanner scanner = new Scanner(System.in);

        //Biến - nơi lưu trữ dữ liệu
        //<Kiểu dữ liệu> <tên biến> = <giá trị khởi tao>

        //Kiểu dữ liệu dạng primative value: byte, short, int, long, float, char, boolean, double,...
        //Kiểu dữ liệu tham chiếu: string, array, opject, class, interface
        int age = 24;
        double salary = 1500.15;
        boolean isLogin = true; //false

        //Hằng số - giá trị không đổi
        final double pi = 3.14159;

        // Yêu cầu: cho phép người dụng nhập và xuất ra tên mình
        System.out.println("Nhập tên người dùng: ");
        //Nhận giá trị từ người dùng nhập và xuất ra màn hình
        String name = scanner.nextLine();
        //Xuất ra màn hình
        System.out.println("Xin chào: " + name);

        //Yêu cầu: viết chương trình cho sinh viên nhập tên, lớp, và tuổi và in ra màn hình
        System.out.println("Tên: ");
        String nameSV = scanner.nextLine();
        System.out.println("Lớp: ");
        int ageSV = scanner.nextInt();
        System.out.println("Tuổi: ");
        int lop = scanner.nextInt();

        System.out.println("Tên của bạn: " + nameSV);
        System.out.println("Bạn " + ageSV + " tuổi");
        System.out.println("Học lớp " + lop);

        //Quy tắc đặt tên biến
        // - Bắt buộc chữ cái đầu không được bắt đầu bằng số, không được viết có dấu tiếng việt
        // - Không được đặt trùng với từ khóa của java (public, class, void, static,...)
        // - Đặt tên theo quy tắc camel case - hoTen, tongLuong, ...
    }
}
