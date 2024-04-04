package users;
import java.util.Scanner;
import java.util.ArrayList;
public class Student {
    private static boolean loggedIn = true;

    public static void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        while (loggedIn) {
            System.out.println("\n==== Student Dashboard ====");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Tampilkan Daftar Buku yang Dipinjam");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Logout");
            System.out.print("Masukkan Pilihan (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Panggil displayBooks() dari kelas Book
                    books.Book.displayBooks();
                    break;
                case 2:
                    // Panggil addTempBooks() dari kelas Book
                    books.Book.addTempBooks();
                    break;
                case 3:
                    // Panggil showBorrowedBooks() dari kelas Book
                    books.Book.showBorrowedBooks();
                    break;
                case 4:
                    // Panggil kembalikanBuku() dari kelas Book
                    books.Book.kembalikanBuku();
                    break;
                case 5:
                    System.out.println("Logout berhasil!");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }



    public static class Admin {
        private static boolean loggedIn = true;
        private static ArrayList<String[]> bookList = new ArrayList<>();


        public static void menuAdmin() {
            Scanner scanner = new Scanner(System.in);
            while (loggedIn) {
                System.out.println("\n=== Admin Menu ===");
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Tampilkan Daftar Mahasiswa");
                System.out.println("3. Tambah Buku");
                System.out.println("4. Tampilkan Daftar Buku");
                System.out.println("5. Logout");
                System.out.print("Masukkan Pilihan (1-5): ");
                int adminChoice = scanner.nextInt();

                switch (adminChoice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudent();
                        break;
                    case 3:
                        addBook();
                        break;
                    case 4:
                        displayBooks();
                        break;
                    case 5:
                        System.out.println("Logout berhasil!");
                        loggedIn = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
        }

        public static void addBook() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nTambah Buku:");
            System.out.print("Judul: ");
            String title = scanner.nextLine();
            System.out.print("Penulis: ");
            String author = scanner.nextLine();
            System.out.print("Stok: ");
            int stock = scanner.nextInt();

            String[] newBook = {title, author, Integer.toString(stock)};
            bookList.add(newBook);

            System.out.println("Buku berhasil ditambahkan.");
        }

        public static void displayBooks() {
            System.out.println("\n=== Daftar Buku ===");
            for (int i = 0; i < bookList.size(); i++) {
                String[] book = bookList.get(i);
                System.out.println((i + 1) + ". Judul: " + book[0]);
                System.out.println("   Penulis: " + book[1]);
                System.out.println("   Stok: " + book[2]);
                System.out.println();
            }

        }
    }

    private static String[][] userStudent = {
            {"jekk", "202310370311415", "Teknik", "Informatika"}
    };


    public static void addStudent() {
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

    public static void displayStudent() {
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
