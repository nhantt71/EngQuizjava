/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Win11
 */
public class LuyenTap {
    private int loai;
    private int soCauHoiLt;
    private int mucDo;
    private List<Incomplete> unCheckedDs1;
    private List<MultipleChoice> unCheckedDs2;
    private List<Incomplete> checkedDs1;
    private List<MultipleChoice> checkedDs2;
    
    {
        this.checkedDs1 = new ArrayList<>();
        this.checkedDs2 = new ArrayList<>();
        this.unCheckedDs1 = new ArrayList<>();
        this.unCheckedDs2 = new ArrayList<>();
        
        //
    }

    public LuyenTap(int loai, int soCauHoiLt, int mucDo) {
        this.loai = loai;
        this.soCauHoiLt = soCauHoiLt;
        this.mucDo = mucDo;
    }

    public LuyenTap(int loai, int soCauHoiLt){
        this.loai = loai;
        this.soCauHoiLt = soCauHoiLt;
    }    
    
    
    public void hienThiCauHoi(){
        
    }
    
    /**
     * @return the loai
     */
    public int getLoai() {
        return loai;
    }

    /**
     * @param loai the loai to set
     */
    public void setLoai(int loai) {
        this.loai = loai;
    }

    /**
     * @return the soCauHoiLt
     */
    public int getSoCauHoiLt() {
        return soCauHoiLt;
    }

    /**
     * @param soCauHoiLt the soCauHoiLt to set
     */
    public void setSoCauHoiLt(int soCauHoiLt) {
        this.soCauHoiLt = soCauHoiLt;
    }

    /**
     * @return the mucDo
     */
    public int getMucDo() {
        return mucDo;
    }

    /**
     * @param mucDo the mucDo to set
     */
    public void setMucDo(int mucDo) {
        this.mucDo = mucDo;
    }

    /**
     * @return the unCheckedDs1
     */
    public List<Incomplete> getUnCheckedDs1() {
        return unCheckedDs1;
    }

    /**
     * @param unCheckedDs1 the unCheckedDs1 to set
     */
    public void setUnCheckedDs1(List<Incomplete> unCheckedDs1) {
        this.unCheckedDs1 = unCheckedDs1;
    }

    /**
     * @return the unCheckedDs2
     */
    public List<MultipleChoice> getUnCheckedDs2() {
        return unCheckedDs2;
    }

    /**
     * @param unCheckedDs2 the unCheckedDs2 to set
     */
    public void setUnCheckedDs2(List<MultipleChoice> unCheckedDs2) {
        this.unCheckedDs2 = unCheckedDs2;
    }

    /**
     * @return the checkedDs1
     */
    public List<Incomplete> getCheckedDs1() {
        return checkedDs1;
    }

    /**
     * @param checkedDs1 the checkedDs1 to set
     */
    public void setCheckedDs1(List<Incomplete> checkedDs1) {
        this.checkedDs1 = checkedDs1;
    }

    /**
     * @return the checkedDs2
     */
    public List<MultipleChoice> getCheckedDs2() {
        return checkedDs2;
    }

    /**
     * @param checkedDs2 the checkedDs2 to set
     */
    public void setCheckedDs2(List<MultipleChoice> checkedDs2) {
        this.checkedDs2 = checkedDs2;
    }
}
