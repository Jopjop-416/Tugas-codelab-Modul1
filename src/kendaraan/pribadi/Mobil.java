package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    @Override
    public void Start() {
        System.out.println(this.getName() + " " + getModel() + " warna " + getWarna() + " dinyalakan" );
    }

    @Override
    public void Stop() {
        System.out.println( this.getName() + " " + getModel() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println(this.getName() + " " + getModel()+ " berhenti");
    }
}
