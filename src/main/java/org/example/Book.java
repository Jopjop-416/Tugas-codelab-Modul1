package books;
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> borrowedBooks = new ArrayList<>();
    private static String[][] bookList = {
            {"Kewarganegaraan", "Prabowo", "388c-e681-9162", "4"},
            {"Biologi", "Cak imin", "ed90-be30-5cdb", "5"},
            {"B.Indo", "Ganjar", "d95e-0c4a-9523", "2"}
    };

    public static void displayBooks() {
        System.out.println("\n==== Daftar Buku ====");
        for (int i = 0; i < bookList.length; i++) {
            System.out.println((i + 1) + ". Judul: " + bookList[i][0]);
            System.out.println("   Author: " + bookList[i][1]);
            System.out.println("   ID Buku: " + bookList[i][2]);
            System.out.println("   Stok: " + bookList[i][3]);
            System.out.println();
        }
    }

    public static void addTempBooks() {
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

    public static void showBorrowedBooks() {
        System.out.println("\n==== Buku yang Telah Dipinjam ====");
        if (borrowedBooks.isEmpty()) {
            System.out.println("Anda belum meminjam buku apapun.");
        } else {
            for (String book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }

    public static void kembalikanBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==== Kembalikan Buku ====");

        if (borrowedBooks.isEmpty()){
            System.out.println("Anda belum meminjam buku apapun.");
            return;
        }

        System.out.println("Buku yang dipinjam:");
        for (int i = 0; i < borrowedBooks.size(); i++){
            System.out.println((i + 1) + ". " + borrowedBooks.get(i));
        }

        System.out.println("Buku yang dipinjam:");
        for (int i = 0; i < borrowedBooks.size(); i++){
            System.out.println((i + 1) + ". " + borrowedBooks.get(i));
        }

        System.out.print("Masukkan nomor buku yang ingin dikembalikan: ");
        int selectedBookIndex = scanner.nextInt() - 1;

        if (selectedBookIndex >= 0 && selectedBookIndex < borrowedBooks.size()) {
            String returnedBook = borrowedBooks.remove(selectedBookIndex);
            System.out.println("Buku '" + returnedBook + "' berhasil dikembalikan.");
        } else{
            System.out.println("Pilihan buku tidak valid.");
        }

    }


}
