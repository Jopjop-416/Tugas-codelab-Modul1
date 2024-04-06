package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Mennyalakan mesin " + this.getName() + " " + getModel() + " warna " + getWarna());
    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName()  + " " + getModel() + " lepas landas");
    }


    @Override
    public void Brake() {
        System.out.println( this.getName() + " " + getModel() + " mendarat");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin  " + this.getName() + " " + getModel());
    }

}

