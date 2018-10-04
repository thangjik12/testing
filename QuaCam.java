/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class QuaCam extends HoaQua {
    protected String Dochua;
    //Constructor
    public QuaCam() {
    }
    public QuaCam(String Dochua, double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
        this.Dochua = Dochua;
    }
    //getter and setter
    public String getDochua() {
        return Dochua;
    }

    public void setDochua(String Dochua) {
        this.Dochua = Dochua;
    }

    @Override
    public double getGiaban() {
        return giaban;
    }

    @Override
    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    @Override
    public String getNguongoc() {
        return nguongoc;
    }

    @Override
    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    @Override
    public String getNgaynhap() {
        return ngaynhap;
    }

    @Override
    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public int getSoluong() {
        return soluong;
    }

    @Override
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

   
    
}
