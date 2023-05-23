package Bai1;

public class PhongMayTinh extends PhongHoc {
    public int SoMayTinh;

    public PhongMayTinh() {
    }

    public PhongMayTinh(int SoMayTinh, String MaPhong, String DayNha, float DienTich, int SoBongDen) {
        super(MaPhong, DayNha, DienTich, SoBongDen);
        this.SoMayTinh = SoMayTinh;
    }
    

    public int getSoMayTinh() {
        return SoMayTinh;
    }

    public void setSoMayTinh(int SoMayTinh) {
        this.SoMayTinh = SoMayTinh;
    }
    
    public void MayTinh(){
        System.out.println("Nhap so may tinh:");
        SoMayTinh=scan.nextInt();
    }
    
    public boolean DatChuan(){
        if((DienTich/SoBongDen)>=10&&(DienTich/SoMayTinh)>=1.5)
            return true;
        return false;
    }
    
    public void Nhap(){
        super.Nhap();
        MayTinh();
    }

    @Override
    public String toString() {
        return super.toString() + "SoMayTinh=" + SoMayTinh +"Dat chuan:"+DatChuan()+ '}';
    }
    
}
