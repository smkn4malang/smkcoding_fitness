package com.mnizar.app.fitness;

import android.widget.ImageView;

public class Model {

    private String nama;
    private String instruksi;
    private int[] image;

    public Model(){}

    public Model(String nama, String instruksi, int[] image) {
        this.nama = nama;
        this.instruksi = instruksi;
        this.image = image;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInstruksi() {
        return instruksi;
    }

    public void setInstruksi(String instruksi) {
        this.instruksi = instruksi;
    }

    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }
}
