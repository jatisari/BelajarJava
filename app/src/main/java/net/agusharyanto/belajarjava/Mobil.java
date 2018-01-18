package net.agusharyanto.belajarjava;

import android.util.Log;

/**
 * Created by Lenovo on 18/01/2018.
 */

public class Mobil {
    String warna;
    int tahunProduksi;

    public void printMobil(){
        writeLog("Warna :" + warna);
        writeLog("Tahun Produksi :" + tahunProduksi);
    }

    public String getInfoMobil(){
        String datamobil = "Warna :"+warna+ ", Tahun Produksi :"+tahunProduksi;
        return datamobil;
    }
    private void writeLog(String message){
        Log.d("MainActivity", message);
    }
}
