package com.rizkykhapidsyah.olab;

import com.rizkykhapidsyah.model.Model;

public class LatihanAljabarBoolean {
    public static void Latihan() {
        // Operasi Aljabar Boolean (and / or)
        Model.Garis();
        System.out.println(Model.subTitel[4]);
        Model.Garis();

        System.out.print(Model.subTitel[5]);
        Model.nilaiTebakan = Model.inputUser.nextInt();

        Model.statusTebakan = (Model.nilaiTebakan > 4) && (Model.nilaiTebakan < 9);
        System.out.println(Model.subTitel[6] + Model.hasilTebakan(Model.TrueFalse));

        /* Struktur Dasar Operand: And
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
    }
}
