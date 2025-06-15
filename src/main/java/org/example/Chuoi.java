package org.example;

public class Chuoi {
    public static void main(String[] args) {
        //String trong java
        String greet = "hello java";
        System.out.println(greet.length());

        //Chuyển đổi chuỗi thành chữ hoa hoặc chữ thường
        System.out.println(greet.toUpperCase()); // chữ hoa
        System.out.println(greet.toLowerCase()); // chữ thường

        //Nối chuỗi
        System.out.println("Lời chào" + greet);
        System.out.println("Lời chào".concat(greet));
    }
}
