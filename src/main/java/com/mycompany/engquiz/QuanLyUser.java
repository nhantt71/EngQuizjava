/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Win11
 */
public class QuanLyUser {

    private List<User> ds = new ArrayList<>();

    public void dangKy(String hoTen, String matKhau, String queQuan, String gioiTinh, String ngaySinhStr) throws ParseException {
        this.ds.add(new User(hoTen, matKhau, queQuan, gioiTinh, ngaySinhStr));
    }

    public void hienThi() {
        System.out.println("ID\tHoTen\tQueQuan\tGioiTinh\tNgaySinh\tNgayGiaNhap");
        this.ds.forEach(x -> x.hienThi());
    }

    public void hienThi(List<User> ds1) {
        System.out.println("ID\tHoTen\tQueQuan\tGioiTinh\tNgaySinh\tNgayGiaNhap");
        ds1.forEach(x -> x.hienThi());
    }

    public List<User> traCuuUserHoTen(String a) {
        return this.ds.stream().filter(x -> x.getHoTen().trim().toLowerCase().toLowerCase().equals(a.toLowerCase().trim()))
                .collect(Collectors.toList());
    }

    public List<User> traCuuUserGioiTinh(String a) {
        return this.ds.stream().filter(x -> x.getGioiTinh().trim().toLowerCase().equals(a.toLowerCase().trim()))
                .collect(Collectors.toList());
    }

    public List<User> traCuuUserQueQuan(String a) {
        return this.ds.stream().filter(x -> x.getQueQuan().trim().toLowerCase().equals(a.toLowerCase().trim()))
                .collect(Collectors.toList());
    }

    public List<User> traCuuUserNgaySinh(String a) throws ParseException {
        Date d = Utils.f.parse(a);
        return this.ds.stream().filter(x -> x.getNgaySinh().compareTo(d) == 0)
                .collect(Collectors.toList());
    }

    public void xoaThongTinUserTheoHoTen(List<String> hoTen) {
        this.ds.removeIf(x -> hoTen.contains(x.getHoTen()));
    }

    public void xoaThongTinUserTheoQueQuan(List<String> queQuan, List<User> dsXoa) {
        this.ds.removeIf(x -> queQuan.contains(x.getQueQuan()));
    }

    public void xoaThongTinUserTheoGioiTinh(List<String> gioiTinh, List<User> dsXoa) {
        this.ds.removeIf(x -> gioiTinh.contains(x.getGioiTinh()));
    }

    public void xoaThongTinUserTheoNgaySinh(List<Date> ngaySinh, List<User> dsXoa) {
        this.ds.removeIf(x -> ngaySinh.contains(x.getNgaySinh()));
    }

    public void xoaThongTinUserTheoNgayGiaNhap(List<Calendar> ngayGiaNhap, List<User> dsXoa) {
        this.ds.removeIf(x -> ngayGiaNhap.contains(x.getNgayGiaNhap()));
    }

    
    public void capNhatUser(List<User> dsCn, int iDCn, String hoTen, String queQuan, String gioiTinh, Date ngaySinh){
        dsCn.stream().filter(x -> x.getId() == iDCn).forEach(x -> {
            x.setHoTen(hoTen);
            x.setQueQuan(queQuan);
            x.setGioiTinh(gioiTinh);
            x.setNgaySinh(ngaySinh);
        });
    }

    /**
     * @return the ds
     */
    public List<User> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<User> ds) {
        this.ds = ds;
    }
}
