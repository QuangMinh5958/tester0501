package org.example;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Câu lệnh if
        // if(--điều kiện--) {--thực hiện logic--}

        //Điều kiện đúng
        if(9 > 2) {
            System.out.println("điều kiện đúng");
        }
        //Điều kiện sai
        if(9 < 2) {
            System.out.println("điều kiện sai");
        }

        //Viết chương trình kiểm tra xem hôm nay có phải ngày đi học không?
        int day = 4;
        if(day == 4 || day == 8) {
            System.out.println("hôm nay đi học!");
        }

        // Câu if... else
        // if(--điều kiện--) {--thực hiện logic1--} else {--thực hiện logic2--}
        int a = 8;
        int b = 10;
        if (a > b) {
            System.out.println("Số a lớn hơn b");
        } else {
            System.out.println("Số b lớn hơn số a");
        }

        //Bài tập 1
//        System.out.println("Nhập tuổi của bạn: ");
//        int age = scanner.nextInt();
//        if(age > 18) {
//            System.out.println("Bạn đã đủ tuổi học ĐH");
//        } else {
//            System.out.println("Bạn chưa đủ tuổi học ĐH");
//        }

        // Toán tử 3 ngôi ->           điều kiện ? thực hiện logic 1 : thực hiện logic 2
//        String result = age > 18 ? "Bạn đủ tuổi học ĐH" : "Bạn không đủ tuổi học ĐH";
//        System.out.println(result);

        //if(--Điều kiện 1--) {--logic1--} else if(--Điều kiện 2--) {--logic2--}....
        int c = 10;
        if (c == 10) {
            System.out.println("Số 10");
        } else if (c == 11) {
            System.out.println("số 11");
        } else if (c == 12) {
            System.out.println("số 12");
        } else {
            System.out.println("Vui lòng nhập lại số!");
        }

        //Bài tập 2
//        System.out.println("Nhập điểm toán: ");
//        float diemToan = scanner.nextInt();
//        System.out.println("Nhập điểm lý: ");
//        float diemLy = scanner.nextInt();
//        System.out.println("Nhập điểm hóa: ");
//        float diemHoa = scanner.nextInt();
//
//        float dtb = (diemToan + diemLy + diemHoa)/3;
//
//        if(dtb < 5 ) {
//            System.out.println("Học sinh yếu");
//        } else if (dtb >= 5 && dtb <= 6) {
//            System.out.println("Học sinh trung bình");
//        } else if (dtb > 6 && dtb <= 7) {
//            System.out.println("Học sinh khá");
//        } else if (dtb > 7 && dtb <= 8) {
//            System.out.println("Học sinh giỏi");
//        } else if (dtb > 8 && dtb <= 10) {
//            System.out.println("Học sinh xuất sắc");
//        } else {
//            System.out.println("Vui lòng nhập lại!");
//        }

        //Bài tập 3
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Tổng điện tiêu thụ: ");
        int kw = scanner.nextInt();
        int monney = 0;

        if (0 <= kw && kw <= 50) {
            monney = kw * 500;
        } else if (50 < kw && kw <= 100) {
            monney = 50*500 + (kw - 50) * 650;
        } else if (100 < kw && kw <= 200) {
            monney = 50*500 + 50*650 + (kw - 100) * 850;
        } else if (200 < kw && kw <= 350) {
            monney = 50*500 +50*650 + 100*850 + (kw-200) * 1100;
        } else if (kw > 350) {
            monney = 50*500 +50*650 + 100*850 + 200*1100 + (kw - 350) * 1300;
        } else {
            System.out.println("Vui lòng nhập lại!");
        }
        System.out.println("Khách hàng" + name + "có số tiền điện phải đóng là" + monney);


        // Switch/ case
        int d = 25;
        switch (d) {
            case 5:
                System.out.println("số 5");
                break;
            case 10:
                System.out.println("số 10");
                break;
            default:
                System.out.println("vui lòng nhập lại");
        }
        //---Lưu ý---: nên switch/case - giá trị so sánh là giá trị cụ thể, điều kiện đơn giản (==)
    }
}
