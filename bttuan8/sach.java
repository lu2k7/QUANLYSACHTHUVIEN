package bttuan8;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class sach {
    protected String masach,nhaxuatban;
    protected Date ngaynhap;
    protected Double dongia;
    protected int soluong;
    protected Scanner sc= new Scanner(System.in);
    public sach(){}
    public void setmasach(String masach) {
        this.masach = masach;
    }
    public String getmasach() {
        return masach;
    }

    public void setnhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }
    public String getnhaxuatban() {
        return nhaxuatban;
    }

    public void setngaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    public Date getngaynhap() {
        return ngaynhap;
    }

    public void setdongia(Double dongia) {
        this.dongia = dongia;
    }
    public Double getdongia() {
        return dongia;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }
    public int getsoluong() {
        return soluong;
    }
    public void nhap(){
        System.out.print("nhap ma sach:");
        this.masach=sc.nextLine();
        System.out.print("nhap nha xuat ban:");
        this.nhaxuatban=sc.nextLine();
        try {
            SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("nhap ngay nhap");
            this.ngaynhap=d.parse(sc.nextLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.print("nhap so luong:");
        this.soluong=Integer.parseInt(sc.nextLine());
        System.out.print("nhap don gia:");
        this.dongia = Double.parseDouble(sc.nextLine());
    }
    public void xuat(){
        System.out.println("ma sach: "+masach+"|nha xuat ban: "+nhaxuatban+"|ngay nhap: "+ngaynhap+"|so luong: "+soluong+"|don gia: "+dongia);
    }
}
