/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.engquiz;

/**
 *
 * @author Win11
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class User {

    private static int dem = 0;
    private int id;
    private String hoTen;
    private String tenDangNhap;
    private String matKhau;
    private String queQuan;
    private String gioiTinh;
    private Date ngaySinh;
    private Calendar ngayGiaNhap;
    private List<LuyenTap> lt;

    {
        id = ++dem;
        ngayGiaNhap = new GregorianCalendar();
        lt = new ArrayList<>();
    }

    public User(String hoTen, String matKhau, String queQuan, String gioiTinh, String ngaySinhStr) throws ParseException {
        if (matKhau == null) {
            throw new IllegalArgumentException("Mat Khau field cannot be null");
        }
        this.hoTen = hoTen;
        this.matKhau = matKhau;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        try {
            this.ngaySinh = Utils.f.parse(ngaySinhStr);
        } catch (ParseException e) {
            // If the date is not in the format "yyyy-MM-dd", try parsing it as "dd/MM/yyyy"
            try {
                this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinhStr);
            } catch (ParseException ex) {
                throw new ParseException("Invalid date format. Please enter date in yyyy-MM-dd or dd/MM/yyyy format.", 0);
            }
        }
    }

    public void hienThi() {
        System.out.printf("%d\t%s\t%s\t%s\t%s\t%s",
                this.id, this.hoTen, this.queQuan, this.gioiTinh, Utils.f.format(this.ngaySinh), Utils.f.format(this.ngayGiaNhap));
    }

    // Getter and setter methods for the instance variables
    /**
     * @return the id
     */
    
    public LuyenTap chonLuyenTap(LuyenTap lt){
        return this.lt.get(this.lt.size() - 1);
    }
    
    public void hienThiLuyenTap(){
        
    }
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the ngayGiaNhap
     */
    public Calendar getNgayGiaNhap() {
        return ngayGiaNhap;
    }

    /**
     * @param ngayGiaNhap the ngayGiaNhap to set
     */
    public void setNgayGiaNhap(Calendar ngayGiaNhap) {
        this.ngayGiaNhap = ngayGiaNhap;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the tenDangNhap
     */
    public String getTenDangNhap() {
        return tenDangNhap;
    }

    /**
     * @param tenDangNhap the tenDangNhap to set
     */
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    /**
     * @return the lt
     */
    public List<LuyenTap> getLt() {
        return lt;
    }

    /**
     * @param lt the lt to set
     */
    public void setLt(List<LuyenTap> lt) {
        this.lt = lt;
    }
}
