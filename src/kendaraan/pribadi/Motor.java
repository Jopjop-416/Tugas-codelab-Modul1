package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    @Override
    public void Start (){
        System.out.println("Menyalakan " + this.getName() + " " + getModel() + " warna" + " " + getWarna());
    }

    @Override
    public void Stop() {

        System.out.println( this.getName() + " " + getModel() + " dimatikan");
    }

    @Override
    public void Brake() {

        System.out.println( this.getName() + " " + getModel() + " berhenti");
    }
}
