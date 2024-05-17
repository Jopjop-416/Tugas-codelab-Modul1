import java.util.ArrayList;
import java.util.Scanner;



public class InputNamaMahasiswa {

    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int i = 1;

        while (true) {
            try {
                System.out.print("Masukkan nama ke-" + i + ": ");

                String nama = input.nextLine();


                if (nama.equalsIgnoreCase("selesai")) {
                    break;
                } else if (nama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }

                namaMahasiswa.add(nama);
                i++;

            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage()); //Ini saya berikan varisai err atau out untuk memenuhi perintah
                System.out.println(e.getMessage());

            }
        }

        System.out.println("===Daftar Mahasiswa yang diinputkan===");
        for (String nama : namaMahasiswa) {
            System.out.println("- " + nama);
        }
        input.close();
    }
}