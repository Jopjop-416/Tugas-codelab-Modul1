import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==== Library System ====");
        System.out.println("1. Login Sebagai Murid");
        System.out.println("2. Login Sebagai Admin");
        System.out.print("Masukkan Pilihan (1-2): ");
        int userType = scanner.nextInt();

        switch (userType) {
            case 1:
                Student student = new Student();
                student.menu();
                break;
            case 2:
                Admin admin = new Admin();
                admin.menu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
class Student {
    private String[][] bookList = {
            {"Kewarganegaraan", "Prabowo", "388c-e681-9162", "4"},
            {"Biologi", "Cak imin", "ed90-be30-5cdb", "5"},
            {"B.Indo", "Ganjar", "d95e-0c4a-9523", "2"}
    };

    private ArrayList<String> borrowedBooks = new ArrayList<>();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n==== Student Dashboard ====");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Daftar buku yang telah anda pinjam" );
            System.out.println("4. Logout");
            System.out.print("Masukkan Pilihan (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    pinjamBuku();
                    break;
                case 3:
                    bukuTerpinjam();
                    break;
                case 4:
                    System.out.println("Logout berhasil!");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==== Pinjam Buku ====");
        System.out.println("Masukkan nomor buku yang ingin dipinjam: ");
        int selectedBookIndex = scanner.nextInt();

        if (selectedBookIndex >= 1 && selectedBookIndex <= bookList.length) {
            System.out.println("Anda telah meminjam buku: " + bookList[selectedBookIndex - 1][0]);
            borrowedBooks.add(bookList[selectedBookIndex - 1][0]);
        } else {
            System.out.println("Pilihan buku tidak valid.");
        }
    }

    public void displayBooks() {
        System.out.println("\n==== Daftar Buku ====");
        for (int i = 0; i < bookList.length; i++) {
            System.out.println((i + 1) + ". Judul: " + bookList[i][0]);
            System.out.println("   Author: " + bookList[i][1]);
            System.out.println("   ID Buku: " + bookList[i][2]);
            System.out.println("   Stok: " + bookList[i][3]);
            System.out.println();
        }
    }

    public void bukuTerpinjam() {
        System.out.println("\n==== Buku yang Telah Dipinjam ====");
        if (borrowedBooks.isEmpty()) {
            System.out.println("Hah belum ada buku yang dipinjam!.");
        } else {
            for (String book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }
}

class Admin {
    private String[][] userStudent = {
            {"jekk", "202310370311415", "Teknik", "Informatika"}
    };

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = true;

        while (loggedIn) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("3. Logout");
            System.out.print("Masukkan Pilihan (1-3): ");
            int adminChoice = scanner.nextInt();

            switch (adminChoice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudent();
                    break;
                case 3:
                    System.out.println("Logout berhasil!");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTambah Mahasiswa:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.next();
        System.out.print("Fakultas: ");
        String faculty = scanner.next();
        System.out.print("Program Studi: ");
        String studyProgram = scanner.next();

        if (nim.length() != 15) {
            System.out.println("NIM tidak valid, harus 15 karakter.");
            return;
        }

        String[] newStudent = {name, nim, faculty, studyProgram};
        String[][] newUserStudent = new String[userStudent.length + 1][4];
        for (int i = 0; i < userStudent.length; i++) {
            newUserStudent[i] = userStudent[i];
        }
        newUserStudent[userStudent.length] = newStudent;
        userStudent = newUserStudent;

        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void displayStudent() {
        System.out.println("\n=== Daftar Mahasiswa ===");
        for (int i = 0; i < userStudent.length; i++) {
            System.out.println("Nama: " + userStudent[i][0]);
            System.out.println("NIM: " + userStudent[i][1]);
            System.out.println("Fakultas: " + userStudent[i][2]);
            System.out.println("Program Studi: " + userStudent[i][3]);
            System.out.println();
        }
    }
}
