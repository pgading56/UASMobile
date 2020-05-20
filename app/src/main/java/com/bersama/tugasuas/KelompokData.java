package com.bersama.tugasuas;

import java.util.ArrayList;

public class KelompokData {
    private static String[] NamaKelompok = {
            "Gading Putra",
            "Achmad Rifaldi",
            "Gunawan Muliady",
            "Kadek Budi",
            "Wisnu Saja"
    };

    private static String[] StambukKelompok = {
            "F55117013",
            "F55117056",
            "F55117238",
            "F55117150",
            "F55117060"
    };

    private static int[] ImagesKelompok = {
            R.drawable.gading,
            R.drawable.faldi,
            R.drawable.nawan,
            R.drawable.budi,
            R.drawable.wisnu
    };

    static ArrayList<Kelompok> getListData() {
        ArrayList<Kelompok> grup = new ArrayList<>();
        for (int position = 0; position < NamaKelompok.length; position++) {
            Kelompok kelompok = new Kelompok();
            kelompok.setNama(NamaKelompok[position]);
            kelompok.setStambuk(StambukKelompok[position]);
            kelompok.setFoto(ImagesKelompok[position]);
            grup.add(kelompok);
        }
        return grup;
    }
}
