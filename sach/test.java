package sach;
import java.util.ArrayList;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        //yêu cầu 3
        sach sach1=new sach("sach001","bt","quan",1990,10);
        sach1.hienthithongtin();
        //tạo arraylist
        System.out.print("nhap luong sach muon nhap");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sach[] ds=new sach[n];

        for(int i=0;i<n;i++){
            System.out.println("nhap sach thu : "+(i+1));
            ds[i]=new sach();
            ds[i].nhap();
        }
        for(int i=0;i<n;i++){
            ds[i].hienthithongtin();
        }
    }

}
