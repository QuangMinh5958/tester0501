package org.example;

public class array {
    public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40};
    String[] name = {"minh", "loi", "tuan", "dat"};
    //                  0       1       2       3
        System.out.println(name[2]);
        name[2] = "khải";
        System.out.println(name[2]);

        //Chiều dài của mảng
        int length = name.length;
        System.out.println("Độ dài của mảng: " + length);

        //Duyệt mảng
        for (int i = 0; i < name.length; i++) {
            System.out.println("Tên vị trí thứ " + i+1 + ": " + name[i]);
        }

        //Duyệt mảng với loop for-each
        for(int number: numbers) {
            System.out.println(number);
        }

        //Duyệt mảng ngược
        for(int index = numbers.length - 1; index >= 0; index--) {
            System.out.println(numbers[index]);
        }
    }
}
