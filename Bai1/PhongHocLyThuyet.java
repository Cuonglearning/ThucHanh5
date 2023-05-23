package Bai1;

public class PhongHocLyThuyet extends PhongHoc {
    public String MayChieu;

    public PhongHocLyThuyet() {
    }

    public PhongHocLyThuyet(String MayChieu, String MaPhong, String DayNha, float DienTich, int SoBongDen) {
        super(MaPhong, DayNha, DienTich, SoBongDen);
        this.MayChieu = MayChieu;
    }
    
    
    public boolean MayChieu(){
        System.out.println("Phong hoc co may chieu khong?(y/n)");
        MayChieu=scan.next();
        if (MayChieu =="y")
            return true;
        return false;
    }
    
    public boolean DatChuan(){
        if((DienTich/SoBongDen)>=10&&MayChieu()==true)
            return true;
        return false;
    }
    
    public void Nhap(){
        super.Nhap();
        MayChieu();
    }

    @Override
    public String toString() {
        return super.toString()+"Dat chuan:"+DatChuan()+")";
    }
    
    
}
