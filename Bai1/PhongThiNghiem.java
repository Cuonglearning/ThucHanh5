package Bai1;


public class PhongThiNghiem extends PhongHoc {
    public String ChuyenNganh;
    public int SucChua;
    public String BonRua;

    public PhongThiNghiem() {
    }

    public PhongThiNghiem(String ChuyenNganh, int SucChua, String BonRua, String MaPhong, String DayNha, float DienTich, int SoBongDen) {
        super(MaPhong, DayNha, DienTich, SoBongDen);
        this.ChuyenNganh = ChuyenNganh;
        this.SucChua = SucChua;
        this.BonRua = BonRua;
    }
    
    
    public boolean BonRua(){
            System.out.println("Phong thi nghiem co bon rua khong(y/n):");
            BonRua=scan.nextLine();
            if(BonRua=="y")
                return true;
            return false;
    }
    
    public boolean DatChuan(){
        if((DienTich/SoBongDen)>=10&&BonRua()==true)
            return true;
        return false;
    }
    
    public void Nhap(){
        super.Nhap();
        BonRua();
    }

    @Override
    public String toString() {
        return super.toString() + "ChuyenNganh=" + ChuyenNganh + ", SucChua=" + SucChua + ", BonRua=" + BonRua +"Dat chuan:"+DatChuan()+ '}';
    }
    
    
}
