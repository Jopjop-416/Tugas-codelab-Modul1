package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Library System ====");
        System.out.println("1. Login sebagai murid");
        System.out.println("2. Login sebagai guru");
        System.out.print("Masukkan Pilihan (1-2): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nMasukkan NIM Mahasiswa:");
                System.out.print("NIM: ");
                String nim = scanner.next();

                if (nim.length() == 15) {
                    System.out.println("Successful Login as Student");
                } else {
                    System.out.println("User Not Found");
                }
                break;
            case 2:
                System.out.println("\nMasukkan username dan password Admin:");
                System.out.print("Username: ");
                String username = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();
                
                String validUsername = "admin";
                String validPassword = "admin123";

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Successful Login as Admin");
                } else {
                    System.out.println("Admin user Not Found!!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
