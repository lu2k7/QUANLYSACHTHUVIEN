package sach;
import java.util.Scanner;
class sach{
    private String masach,tieude,tacgia;
    private int namxuatban,soluong;
    public sach(){
    }
    public sach(String masach,String tieude,String tacgia,int namxuatban,int soluong){
        this.masach=masach;
        this.tieude=tieude;
        this.tacgia=tacgia;
        setNamxuatban(namxuatban);
        setSoluong(soluong);
    }
    public void hienthithongtin(){
        System.out.println("ma sach: "+masach+"|ten sach: "+tieude+"|tac gia: "+tacgia+"|nam xuat ban: "+ namxuatban+"|so luong: "+soluong);    
    }
    public String  getmasach(){
        return masach;
    }
    public void setmasach(String masach){
        this.masach=masach;
    }
    public String getTieude(){
        return tieude;
    }
    public void setTieude(String tieude){
        this.tieude = tieude;
    }
    public String getTacgia(){
        return tacgia;
    }
    public void setTacgia(String tacgia){
        this.tacgia = tacgia;
    }
    public int getNamxuatban() {
        return namxuatban; 
    }
    //yêu cầu 3 kiểm tra năm xuất bản
    public void setNamxuatban(int namxuatban){ 
        if(namxuatban<= 2026 &&namxuatban>0){
            this.namxuatban=namxuatban;
        }else{
            System.out.println("nam xuat ban khong hop le");
            this.namxuatban=2026;
        }
    }
    public int getSoluong(){
         return soluong; 
    }
    //yêu cầu 3 kiểm tra số lượng
    public void setSoluong(int soluong) {
        if(soluong>=0){
            this.soluong = soluong;
        }else{
            System.out.println("so luong phai >= 0");
            this.soluong=0;
        }    
    }

    // nhập tay
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap ma sach: ");
        masach=sc.nextLine();
        System.out.print("nhap ten sach: ");
        tieude=sc.nextLine();
        System.out.print("nhap tac gia: ");
        tacgia=sc.nextLine();
        System.out.print("nhap nam xuat ban: ");
        namxuatban=sc.nextInt();
        setNamxuatban(namxuatban);
        System.out.print("nhap so luong: ");
        soluong=sc.nextInt();  
        setSoluong(soluong); 
    }
}