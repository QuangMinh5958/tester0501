package org.example;

public class function {

    //Hàm được định nghĩa ở đây
    //Có 2 loại hàm:

    // - Hàm không có giá trị trả về (hàm thực hiện logic)
//    static void tenHam(--truyền tham số--){}
    static void greeting() {
        System.out.println("Hello world");
    }

    // - Hàm có giá trị trả về
//    static <--kiểu dữ liệu--> tenHam(){}
    static double dtb(double diemToan, double diemLy, double diemHoa) {
        return (diemToan + diemLy + diemHoa)/3;

    }
    public static void main(String[] args) {
        greeting();
        greeting();

        double diemToan = 8;
        double diemLy = 8;
        double diemHoa = 9;
        double dtb = dtb(diemToan, diemLy, diemHoa);
        System.out.println(dtb);
    }
}
