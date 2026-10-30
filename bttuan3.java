import java.util.Scanner;

class Sach {
    String masach, tensach, tacgia;
    int namxuatban, soluong,loaisach;
    double dongia;
    //cau 1
    public void nhapthongtin(Scanner scanner) {
        System.out.print("Nhap ma sach: ");
        masach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tensach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        tacgia = scanner.nextLine();
        do{
            System.out.print("Nhap nam xuat ban: ");
            namxuatban = scanner.nextInt();
            if(namxuatban<=0||namxuatban>2026)
                System.out.println("nam xuat ban khong hop le");
        }while(namxuatban<=0||namxuatban>2026);
        do{
            System.out.print("Nhap so luong: ");
            soluong = scanner.nextInt();
            if(soluong<0)
                System.out.println("so luong phai lon hon bang 0");
        }while(soluong<0);
        do{
            System.out.print("Nhap don gia: ");
            dongia = scanner.nextDouble();
            if(dongia<0)
                System.out.println("don gia phai lon hon 0");
        }while(dongia<0);
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        loaisach = scanner.nextInt();
    }
    public double tinhthanhtien() {
        return dongia * soluong;
    }
    public double phivanchuyen() {
        return 0.05 * tinhthanhtien();
    }
    public double tongtien() {
        return tinhthanhtien() + phivanchuyen();
    }
    //cau 2 phan loai gia
    public String phanloaigia(){
        if(dongia<50000){
            return "sach gia thap";
        } else if(dongia<=100000) {
            return "gia trung binh";
        }  else if(dongia<=200000){
            return "sach gia cao";
        } else{
            return "sach gia dac biet";
        }
    }
    //cau 3 phan loai so luong
    public String phanloaitonkho(){
        if(soluong==0){
            return "het sach";
        }else if(soluong<=5){
            return "sap het";
        }else if(soluong<=20){
            return "con it";
        }else{
            return "con nhieu";
        }
    }
    //cau 4 phan loai sach
    public String phanloaisach(){
        switch (loaisach) {
            case 1:
                return "sach giao khoa";
            case 2:
                return "sach tham khao";
            case 3:
                return "sach chuyen nganh";    
            default:
                return "sach khac";
        }
    }
    public void hienthi() {
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("Loai sach: " + phanloaisach());
        System.out.println("Don gia: " + dongia + phanloaigia());
        System.out.println("So luong: " + soluong+ phanloaitonkho());
        System.out.println("Thanh tien: " + tinhthanhtien());
        System.out.println("Phi van chuyen: " + phivanchuyen());
        System.out.println("Tong tien nhap: " + tongtien());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sach s = new Sach();
        
        s.nhapthongtin(scanner);
        s.hienthi();
        scanner.close();
    }
}