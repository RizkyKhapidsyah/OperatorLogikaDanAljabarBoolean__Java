package com.rizkykhapidsyah.model;

import java.util.Scanner;

public class Model {

    public static Scanner inputUser = new Scanner(System.in);

    public static int nilaiBenar = 6, nilaiTebakan;

    public static boolean statusTebakan;

    public static String TrueFalse = null;

    public static String[] subTitel = {
            "Tebak Sebuah Angka (Clue: Six)",       //0
            "Masukkan nilai tebakan Anda : ",       //1
            "Nilai tebakan Anda adalah = ",         //2
            "Tebakan Anda : ",                      //3
            "Latihan Aljabar Boolean",              //4
            "Masukkan Nilai Antara 4 dan 9 : ",     //5
            "Tebakan Anda : "                       //6
    };

    public static void Garis() {
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    public static String hasilTebakan(String a) {
        if (statusTebakan == true) {
            a = "Benar";
        } else if (statusTebakan == false) {
            a = "Salah!";
        }
        return a;
    }
}
