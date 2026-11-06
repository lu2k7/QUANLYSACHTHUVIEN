import java.util.Scanner;

public class bttuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        String[] masach = new String[max];
        String[] tensach = new String[max];
        int[] soluong = new int[max];
        double[] giatien = new double[max];
        int n = 0;
        int c;
        
        do {
            System.out.println("--menu--");
            System.out.println("1. nhap n cuon sach");
            System.out.println("2. hien thi danh sach sach");
            System.out.println("3. tinh tong so luong va tong gia tri sach");
            System.out.println("4. tim sach theo ma");
            System.out.println("0. thoat chuong trinh");
            System.out.print("moi ban chon: ");
            
            c = Integer.parseInt(scanner.nextLine());

            switch (c) {
                case 1:
                    System.out.print("nhap so luong sach can them (n): ");
                    int soluongthem = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < soluongthem; i++) {
                        System.out.print("nhap ma sach: ");
                        masach[n] = scanner.nextLine();
                        System.out.print("nhap ten sach: ");
                        tensach[n] = scanner.nextLine();
                        System.out.print("nhap so luong: ");
                        soluong[n] = Integer.parseInt(scanner.nextLine());
                        System.out.print("nhap gia tien: ");
                        giatien[n] = Double.parseDouble(scanner.nextLine());
                        n++;
                    }
                    System.out.println("nhap thanh cong!");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("thu vien trong!");
                    } else {
                        System.out.println("--- danh sach sach ---");
                        for (int i = 0; i < n; i++) {
                            System.out.println("ma: " + masach[i] + " | ten: " + tensach[i] + " | sl: " + soluong[i] + " | gia: " + giatien[i]);
                        }
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("thu vien trong!");
                    } else {
                        int tongsl = 0;
                        double tonggia = 0;
                        for (int i = 0; i < n; i++) {
                            tongsl += soluong[i];
                            tonggia += soluong[i] * giatien[i];
                        }
                        System.out.println("tong so luong sach: " + tongsl);
                        System.out.println("tong gia tri sach: " + tonggia);
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("thu vien trong!");
                    } else {
                        System.out.print("nhap ma sach can tim: ");
                        String matim = scanner.nextLine();
                        boolean found = false;
                        for (int i = 0; i < n; i++) {
                            if (masach[i].equalsIgnoreCase(matim)) {
                                System.out.println("tim thay -> ma: " + masach[i] + " | ten: " + tensach[i] + " | sl: " + soluong[i] + " | gia: " + giatien[i]);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("khong tim thay sach co ma nay!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("thoat chuong trinh!");
                    break;

                default:
                    System.out.println("lua chon khong hop le!");
            }
        } while (c != 0);
        
        scanner.close();
    }
}