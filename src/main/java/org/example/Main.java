package library;

import users.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==== Library System ====");
        System.out.println("1. Login Sebagai Mahasiswa");
        System.out.println("2. Login Sebagai Admin");
        System.out.print("Masukkan Pilihan (1-2): ");
        int userType = scanner.nextInt();

        switch (userType) {
            case 1:
                System.out.print("Masukkan NIM Anda (16 digit): ");
                String nim = scanner.next();
                if (nim.length() != 15) {
                    System.out.println("NIM harus terdiri dari 16 angka. Login gagal.");
                    break;
                }
                users.Student.menuStudent();
                break;
            case 2:
                System.out.println("Masukkan username dan password Admin:");
                System.out.print("Username: ");
                String username = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();

                // Contoh username dan password admin yang valid
                String validUsername = "admin";
                String validPassword = "admin123";

                if (username.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Login Admin berhasil!");
                    Student.Admin admin = new Student.Admin();
                    admin.menuAdmin();  // Panggil menu admin
                } else {
                    System.out.println("Username atau password salah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}



