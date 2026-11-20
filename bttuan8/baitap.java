package bttuan8;
import java.util.Scanner;
public class baitap {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("sach giao khoa:");
        sachgiaokhoa s1=new sachgiaokhoa();
        s1.nhap();
        s1.xuat();
        System.out.println("sach tham khao:");
        sachthamkhao s2= new sachthamkhao();
        s2.nhap();
        s2.xuat();
        sachthamkhao s3= new sachthamkhao();
        s3.nhap();
        s3.xuat();
        // Tong thanh tien tung loai
        System.out.println("\nTong thanh tien sach giao khoa: " + s1.thanhtien());
        System.out.println("Tong thanh tien 2 sach tham khao: " +(s2.thanhtien() + s3.thanhtien()));

        // Trung binh cong don gia sach tham khao (1 cuon s2)
        double tbdongia = (s3.getdongia() + s2.getdongia()) / 2;
        System.out.println("Trung binh cong don gia sach tham khao: " + tbdongia);
        //xuat ra nha xuat ban x 
        System.out.print("nhap nha xuat ban muon tim: ");
        String nxb =sc.nextLine();
        if(s1.getnhaxuatban()!=null && s1.getnhaxuatban().equalsIgnoreCase(nxb)){
            System.out.println("sach thuoc nxb: "+nxb);
            s1.xuat();
        }
    }
}
