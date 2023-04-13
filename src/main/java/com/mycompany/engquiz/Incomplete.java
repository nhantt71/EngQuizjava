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
public class Incomplete {
    private static int dem = 0;
    private int idDoanVan;
    private String doanVan;
    private List<CauHoi> ds = new ArrayList<>();
    
    {
        idDoanVan = ++dem;
    }
    
    public Incomplete(String doanVan, List<CauHoi> ds) {
        this.doanVan = doanVan;
        this.ds = ds;
    }

    public void hienThi() {
        System.out.printf("%s\n", this.doanVan);
        this.ds.forEach(x -> x.hienThi());
    }

    public void hienThiDSCH(){
        System.out.printf("%d. %s\n", this.idDoanVan,this.doanVan);
        this.ds.forEach(x -> {
            System.out.print(x.getIdCauHoi());
            x.hienThi();
        });
    }
    
    /**
     * @return the doanVan
     */
    public String getDoanVan() {
        return doanVan;
    }

    /**
     * @param doanVan the doanVan to set
     */
    public void setDoanVan(String doanVan) {
        this.doanVan = doanVan;
    }

    /**
     * @return the ds
     */
    public List<CauHoi> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<CauHoi> ds) {
        this.ds = ds;
    }

    /**
     * @return the idDoanVan
     */
    public int getIdDoanVan() {
        return idDoanVan;
    }

    /**
     * @param idDoanVan the idDoanVan to set
     */
    public void setIdDoanVan(int idDoanVan) {
        this.idDoanVan = idDoanVan;
    }

}
