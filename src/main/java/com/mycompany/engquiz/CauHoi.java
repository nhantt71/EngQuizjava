/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class CauHoi {

    private static int dem = 0;
    private int idCauHoi;
    private int mucDo;
    private int danhMuc;
    private List<String> dapAn;
    private String dapAnDung;

    {
        idCauHoi = ++dem;
    }

    public CauHoi(int mucDo, int danhMuc, List<String> dapAn, String dapAnDung) {
        this.mucDo = mucDo;
        this.danhMuc = danhMuc;
        this.dapAn = dapAn;
        this.dapAnDung = dapAnDung;
    }

    public CauHoi(String mucDo, String danhMuc, List<String> dapAn, String dapAnDung) throws FileNotFoundException {
        int lv = 0, cate = 0;
        File f = new File("src/main/resources/mucDo.txt");
        File file = new File("src/main/resources/danhMuc.txt");
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) {
                String str = s.nextLine();
                String[] arrS = str.split("-");
                if (mucDo.equals(arrS[0])) {
                    lv = Integer.parseInt(arrS[1]);
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        try (Scanner s = new Scanner(file)) {
            while (s.hasNextLine()) {
                String str = s.nextLine();
                String[] arrS = str.split("-");
                String[] arrSdm = str.split(" ");
                for (String x : arrSdm) {
                    if (arrS[0].toLowerCase().trim().contains(x)) {
                        cate = Integer.parseInt(arrS[1]);
                        break;
                    }
                }
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        {
            setMucDo(lv);
            setDanhMuc(cate);
            setDapAn(dapAn);
            setDapAnDung(dapAnDung);
        }
    }

    public void hienThi() {
        int n = dapAn.size();
        char c = 65;
        for (int i = 0; i < n; i++) {
            String str = "";
            str = String.valueOf(c++) + ". " + dapAn.get(i) + "";
            System.out.println(str);
        }
    }

    public int getIdCauHoi() {
        return idCauHoi;
    }

    /**
     * @param idCauHoi the idCauHoi to set
     */
    public void setIdCauHoi(int idCauHoi) {
        this.idCauHoi = idCauHoi;
    }

    public int getMucDo() {
        return mucDo;
    }

    public void setMucDo(int mucDo) {
        this.mucDo = mucDo;
    }

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the dapAn
     */
    public List<String> getDapAn() {
        return dapAn;
    }

    /**
     * @param dapAn the dapAn to set
     */
    public void setDapAn(List<String> dapAn) {
        this.dapAn = dapAn;
    }

    /**
     * @return the dapAnDung
     */
    public String getDapAnDung() {
        return dapAnDung;
    }

    /**
     * @param dapAnDung the dapAnDung to set
     */
    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    /**
     * @return the idCauHoi
     */
}
