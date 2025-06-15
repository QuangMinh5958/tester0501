package org.example;


public class ToanTu {
    public static void main(String[] args) {
        //khai báo biến là số - int
        int num = -5;
        System.out.println(num);

        //Toán tử so sánh
        int e = 10;
        int f = 15;
        boolean soSanhBang = e == f;
        boolean soSanhKhongBang = e != f;
        System.out.println(soSanhBang);
        System.out.println(soSanhKhongBang);

        // --> Toán tử Logic <--
        //and( && ) ---> chỉ cần 1 điều kiện false thì kết quả là false
        boolean rs1 = 10 == 10 && 15 == 15;
        System.out.println("rs1 :" + rs1);
        //or( || ) ---> Chỉ cần 1 điều kiện true thì kết quả là true
        boolean rs2 = 10 != 10 || 15 == 15 || 15 != 15;
        System.out.println("rs2 :" + rs2);
        //Phủ định( ! )
        boolean rs3 = true;
        System.out.println("rs3 :" + !rs3);
    }
}

