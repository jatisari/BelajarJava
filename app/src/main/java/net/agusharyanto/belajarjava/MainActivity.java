package net.agusharyanto.belajarjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mobil mobilDiah = new Mobil();
        mobilDiah.warna = "Biru";
        mobilDiah.tahunProduksi = 2017;
        mobilDiah.printMobil();
        writeLog(mobilDiah.getInfoMobil());

        Mobil mobilMadun = new Mobil();
        mobilMadun.warna = "Merah";
        mobilMadun.tahunProduksi = 2011;
        mobilMadun.printMobil();
        writeLog(mobilMadun.getInfoMobil());
    }

    private void writeLog(String message){
        Log.d("MainActivity", message);
    }
}
