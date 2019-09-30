package com.rizkykhapidsyah.olab;

import com.rizkykhapidsyah.model.Model;

public class LatihanOperatorLogika {
    public static void Latihan() {
        // Sebuah program sederhana untuk menebak sebuah Angka.
        Model.Garis();
        System.out.println(Model.subTitel[0]);
        Model.Garis();

        System.out.print(Model.subTitel[1]);
        Model.nilaiTebakan = Model.inputUser.nextInt();

        System.out.println(Model.subTitel[2] + Model.nilaiTebakan);

        // Operasi Logika
        Model.statusTebakan = (Model.nilaiTebakan == Model.nilaiBenar);
        System.out.println(Model.subTitel[3] + Model.hasilTebakan(Model.TrueFalse) + "\n\n");
    }
}
