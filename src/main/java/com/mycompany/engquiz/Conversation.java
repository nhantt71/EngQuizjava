/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.util.List;

/**
 *
 * @author Win11
 */
public class Conversation extends Incomplete {

    public Conversation(String doanVan, List<CauHoi> ds) {
        super(doanVan, ds);
    }

    @Override
    public void hienThi() {
        System.out.printf("%s\n", this.getDoanVan());
        this.getDs().forEach(x -> {
            if (x instanceof MultipleChoice) {
                x.hienThi();
            } else {
                x.hienThi();
            }
        });
    }
}
