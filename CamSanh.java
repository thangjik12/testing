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
public class CamSanh extends QuaCam{
    protected String mausac="xanh";
    //Constructor
    public CamSanh(){
    }
    public CamSanh(String Dochua, double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(Dochua, giaban, nguongoc, ngaynhap, soluong);
    }
    //Getter and setter
    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getDochua() {
        return Dochua;
    }

    public void setDochua(String Dochua) {
        this.Dochua = Dochua;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
