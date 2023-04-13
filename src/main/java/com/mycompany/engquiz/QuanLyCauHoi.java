/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Win11
 */
public class QuanLyCauHoi {

    private List<MultipleChoice> ds1 = new ArrayList<>();
    private List<Incomplete> ds2 = new ArrayList<>();

    public void themCauHoi(MultipleChoice... a) {
        this.ds1.addAll(Arrays.asList(a));
    }

    public void themCauHoi(Incomplete... a) {
        this.ds2.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        {
            if (ds1.isEmpty() == false) {
                System.out.print("Danh sach cac cau hoi Multiple Choice: ");
                this.ds1.forEach(x -> {
                    System.out.println(x.getIdCauHoi() + ". ");
                    x.hienThi();
                });
            }
        }
        {
            if (ds2.isEmpty() == false) {
                System.out.print("Danh sach cac cau hoi Incomplete, Conversation: ");
                this.ds2.forEach(x -> x.hienThiDSCH());
            }
        }
    }

    public List<MultipleChoice> timCauHoiMul(String a){
        int dem = 0;
        int i;
        List<MultipleChoice> ds = new ArrayList<>();
        String[] arrS = a.split(" ");
        for(i = 0; i < arrS.length; i++){
            for (int j = 0; j < this.ds1.size(); j++){
                if(this.ds1.get(j).getCauHoi().contains(arrS[i])){
                    ds.add(this.ds1.get(j));
                    dem++;
                }
            }
        }
        
        if (doChinhXac(i, dem))
            return ds;
        return null;
    }
    
    public List<MultipleChoice> timCauHoiTheoDanhMucMul (int a){
        return this.ds1.stream().filter(x -> x.getDanhMuc() == a)
                .collect(Collectors.toList());
    }
    
    public List<MultipleChoice> timCauHoiTheoMucDoMul (int a){
        return this.ds1.stream().filter(x -> x.getMucDo() == a)
                .collect(Collectors.toList());
    }
    
    
    public List<Incomplete> timCauHoiIn(String a){
        int dem = 0;
        int i;
        String[] arrS = a.split(" ");
        List<Incomplete> ds = new ArrayList<>();
        for(i = 0; i < arrS.length; i++){
            for (int j = 0; j < this.ds2.size(); j++){
                if(this.ds2.get(j).getDoanVan().contains(arrS[i])){
                    ds.add(this.ds2.get(j));
                    dem++;
                }
            }
        }
        if (doChinhXac(i, dem))
            return ds;
        return null;
    }
    
    public boolean doChinhXac(int i, int dem){
        return (double)dem / i >= 0.75;
    }
    
    public List<Incomplete> timCauHoiTheoDanhMucIn (int a){
        return this.ds2.stream().filter(x -> {
            for(int i = 0; i < ds2.size(); i++){
                if(x.getDs().get(i).getDanhMuc() == a){
                    return true;
                }     
            }
            return false;
        }).collect(Collectors.toList());
    }

    
    public List<Incomplete> timCauHoiTheoMucDoIn (int a){
        return this.ds2.stream().filter(x -> {
            for(int i = 0; i < ds2.size(); i++){
                if(x.getDs().get(i).getMucDo() == a){
                    return true;
                }     
            }
            return false;
        }).collect(Collectors.toList());
    }
    
    
    
    /**
     * @return the ds1
     */
    public List<MultipleChoice> getDs1() {
        return ds1;
    }

    /**
     * @param ds1 the ds1 to set
     */
    public void setDs1(List<MultipleChoice> ds1) {
        this.ds1 = ds1;
    }

    /**
     * @return the ds2
     */
    public List<Incomplete> getDs2() {
        return ds2;
    }

    /**
     * @param ds2 the ds2 to set
     */
    public void setDs2(List<Incomplete> ds2) {
        this.ds2 = ds2;
    }

}
