/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author Win11
 */
public class MultipleChoice extends CauHoi{
    private String cauHoi;

    public MultipleChoice(String mucDo, String danhMuc, List<String> dapAn, String dapAnDung, String cauHoi) throws FileNotFoundException {
        super(mucDo, danhMuc, dapAn, dapAnDung);
        this.cauHoi = cauHoi;
    }

    public MultipleChoice(int mucDo, int danhMuc, List<String> dapAn, String dapAnDung, String cauHoi) {
        super(mucDo, danhMuc, dapAn, dapAnDung);
        this.cauHoi = cauHoi;
    }

    @Override
    public void hienThi() {
        System.out.printf("%s\n", this.cauHoi);
        super.hienThi();
    }
    
    /**
     * @return the cauHoi
     */
    public String getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }
}
