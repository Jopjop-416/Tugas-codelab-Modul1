package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble{

    public Tank(){

    }

    public Tank (String name, String model, String warna, int tahun){
        super(name, model, warna, tahun);
    }
    @Override
    public void Start() {

        System.out.println("Menyalakan " + this.getName() +" "+ getModel() + " warna " + getWarna());
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println(this.getName() + " " + getModel() + " menembak " + vehicle + "!");
    }
    @Override
    public void Stop() {
        System.out.println("Mematikan " + this.getName() + " "  + getModel());
    }

    @Override
    public void Brake() {
        System.out.println(this.getName() + " " + getModel() + " berhenti");
    }
}
