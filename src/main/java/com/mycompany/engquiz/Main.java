/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

/**
 *
 * @author Win11
 */
public class Main {

    public static void main(String[] args) {
        int chon;
        System.out.println("=== Trac Nghiem Tieng Anh ===");
        System.out.print("Ban la (Chon de tiep tuc):\n1. Giang vien\n2. Sinh vien\n");
        do {
            System.out.print("Chon: ");
            chon = Utils.sc.nextInt();
            if (chon != 1 && chon != 2) {
                System.out.println("Nhap sai vui long nhap lai!");
            }
        } while (chon != 1 && chon != 2);

        if (chon == 1) {
            while (true) {
                // In ra menu và yêu cầu người dùng chọn
                System.out.println("Please choose an option:");
                System.out.println("1. Option 1");
                System.out.println("2. Option 2");
                System.out.println("3. Option 3");
                System.out.println("4. Exit");

                // Nhận lựa chọn từ người dùng
                int choice = Utils.sc.nextInt();

                // Thực hiện hành động tương ứng với lựa chọn của người dùng
                switch (choice) {
                    case 1 ->
                        System.out.println("You have chosen Option 1.");
                    case 2 ->
                        System.out.println("You have chosen Option 2.");
                    case 3 ->
                        System.out.println("You have chosen Option 3.");
                    case 4 -> {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            
        }

    }
}
