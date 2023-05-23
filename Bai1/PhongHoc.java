package Bai1;
import java.util.Scanner;

public class PhongHoc {
    Scanner scan=new Scanner(System.in);
    public String MaPhong,DayNha;
    public float DienTich;
    public int SoBongDen;

    public PhongHoc() {
    }

    public PhongHoc(String MaPhong, String DayNha, float DienTich, int SoBongDen) {
        this.MaPhong = MaPhong;
        this.DayNha = DayNha;
        this.DienTich = DienTich;
        this.SoBongDen = SoBongDen;
    }
    

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getDayNha() {
        return DayNha;
    }

    public void setDayNha(String DayNha) {
        this.DayNha = DayNha;
    }

    public float getDienTich() {
        return DienTich;
    }

    public void setDienTich(float DienTich) {
        this.DienTich = DienTich;
    }

    public int getSoBongDen() {
        return SoBongDen;
    }

    public void setSoBongDen(int SoBongDen) {
        this.SoBongDen = SoBongDen;
    }
    
    public void Nhap(){
        System.out.println("Nhap ma phong:");
        MaPhong=scan.nextLine();
        System.out.println("Nhap day nha:");
        DayNha=scan.nextLine();
        System.out.println("Nhap dien tich:");
        DienTich=scan.nextFloat();
        System.out.println("Nhap so bong den:");
        SoBongDen=scan.nextInt();
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "MaPhong=" + MaPhong + ", DayNha=" + DayNha + ", DienTich=" + DienTich + ", SoBongDen=" + SoBongDen ;
    }
    
}
