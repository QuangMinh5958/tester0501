package org.example;

//Bài tập 3: viết trương trình đánh giá học sinh, cho
// phép nhập vào toán, lý, hóa. Tính điểm trung bình và
// đánh giá học sinh
// <= 5: học sinh yếu
// 5.1-6: học sinh trung bình
// 6.1-7: học sinh khá
// 7.1-8: học sinh giỏi
// 8.1-10: học sinh xuất sắc
// Lưu ý: tách hàm

import java.util.Scanner;

public class baitap3 {

    static float dtb (float toan,float ly, float hoa) {
        return (toan + ly + hoa)/3;
    }

    static String hocLuc (float dtb) {
        if (dtb <= 5) {
            return "học sinh yếu";
        } else if (dtb > 5 && dtb <= 6) {
            return "học sinh trung bình";
        } else if (dtb > 6 && dtb <= 7) {
            return "học sinh khá";
        } else if (dtb > 7 && dtb <= 8) {
            return "học sinh giỏi";
        } else if (dtb > 8 && dtb <= 10) {
            return "học sinh xuất sắc";
        }
        return "vui lòng kiểm tra lại";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập điểm toán: ");
        float toan = scanner.nextFloat();

        System.out.println("Nhập điểm lý: ");
        float ly = scanner.nextFloat();

        System.out.println("Nhập điểm hóa: ");
        float hoa = scanner.nextFloat();

        //Tính điểm trung bình
        float dtb = dtb(toan, ly, hoa);
        System.out.println("Điểm trung bình: " + dtb);

        //Đánh giá học sinh
        System.out.println("Học lực: " + hocLuc(dtb));
        System.out.println("gasdasd");
    }
}
