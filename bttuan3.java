import java.util.Scanner;

class Sach {
    String masach, tensach, tacgia;
    int namxuatban, soluong;
    double dongia;

    public void nhapthongtin(Scanner scanner) {
        System.out.print("Nhap ma sach: ");
        masach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tensach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        tacgia = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namxuatban = scanner.nextInt();
        System.out.print("Nhap so luong: ");
        soluong = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        dongia = scanner.nextDouble();
        scanner.nextLine();
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
    public void hienthi() {
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("Tac gia: " + tacgia);
        System.out.println("Nam xuat ban: " + namxuatban);
        System.out.println("Don gia: " + dongia);
        System.out.println("So luong: " + soluong);
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