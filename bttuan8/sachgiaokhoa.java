package bttuan8;
public class sachgiaokhoa extends sach{
    private String tinhtrang;
    public sachgiaokhoa(){
        super();
    }
    public void settinhtrang(String tinhtrang){
        this.tinhtrang=tinhtrang;
    }
    public String gettinhtrang(){
        return tinhtrang;
    }
    public void nhap(){
        super.nhap();
        System.out.print("nhap tinh trang:");
        this.tinhtrang=sc.nextLine();
    }
    public Double thanhtien(){
        if(tinhtrang.equalsIgnoreCase("moi")){
            return soluong*dongia;
        }
        return soluong*dongia*0.5;
    }
    public void xuat(){
        super.xuat();
        System.out.println("tinh trang: "+tinhtrang+"|thanh tien: "+thanhtien());
    }
}
