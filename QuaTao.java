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
//Class Qua Tao
public class QuaTao extends HoaQua {
    protected String Dongot;
    //Constructor
    public QuaTao() {
    }
    public QuaTao(String Dongot, double giaban, String nguongoc, String ngaynhap, int soluong) {
        super(giaban, nguongoc, ngaynhap, soluong);
        this.Dongot = Dongot;
    }
    //Setter and getter
    public String getDongot() {
        return Dongot;
    }

    public void setDongot(String Dongot) {
        this.Dongot = Dongot;
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
    //toString
    @Override
    public String toString() {
        return "QuaTao{" + "Dongot=" + Dongot + '}';
    }
    
    
}
