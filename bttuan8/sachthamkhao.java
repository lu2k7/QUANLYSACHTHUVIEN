package bttuan8;
public class sachthamkhao extends sach {
    private Double thue;
    public sachthamkhao(){
        super();
    }
    public void setthue(Double thue){
        this.thue=thue;
    }
    public Double getthue(){
        return thue;
    }
    public void  nhap(){
        super.nhap();
        System.out.print("nhap thue:");
        this.thue=sc.nextDouble();
    }
    public Double thanhtien(){
        return soluong*dongia+thue;
    }
    public void xuat(){
        super.xuat();
        System.out.println("thue: "+thue+"|thanh tien: "+thanhtien());
    }
}
