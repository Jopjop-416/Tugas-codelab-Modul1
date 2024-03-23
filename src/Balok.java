import java.util.Scanner;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String name) {
        super(name);
    }

    @Override
    public void inputNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Perhitungan balok");
        System.out.print("Masukkan panjang: ");
        panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas permukaan " + getName() + " adalah: " + luasPermukaan);
    }

    @Override
    public void volume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume " + getName() + " adalah: " + volume);
    }
}
