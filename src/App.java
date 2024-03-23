public class App {
    public static void main(String[] args) throws Exception {
        BangunRuang tabung = new Tabung("Tabung");
        BangunRuang kubus = new Kubus("Kubus");
        BangunRuang balok = new Balok("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}