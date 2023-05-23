package Bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPhongHoc {
    Scanner scan=new Scanner(System.in);
    ArrayList<PhongHoc> arrPhongHoc=new ArrayList<>();
    ArrayList<PhongHocLyThuyet> arrPhongHocLyThuyet=new ArrayList<>();
    ArrayList<PhongMayTinh> arrPhongMayTinh=new ArrayList<>();
    ArrayList<PhongThiNghiem> arrPhongThiNghiem=new ArrayList<>();
    int SoPhongLyThuyet=0;
    int SoPhongMayTinh=0;
    int SoPhongThiNghiem=0;
    
    public void themLyThuyet(){
        System.out.println("Nhap so phong ly thuyet:");
        SoPhongLyThuyet=scan.nextInt();
        System.out.println("Nhap thong tin phong ly thuyet:");
        for(int i=0;i<SoPhongLyThuyet;i++){
            System.out.println("Lan "+(i+1));
            PhongHocLyThuyet phongHocLyThuyet=new PhongHocLyThuyet();
            phongHocLyThuyet.Nhap();
            arrPhongHocLyThuyet.add(phongHocLyThuyet);
            arrPhongHoc.add(phongHocLyThuyet);
        }
    }
    
    public void themPhongMay(){
        System.out.println("Nhap so phong may tinh muon them:");
        SoPhongMayTinh=scan.nextInt();
        System.out.println("Nhap thong tin phong may tinh:");
        for(int i=0;i<SoPhongMayTinh;i++){
            System.out.println("Lan "+(i+1));
            PhongMayTinh phongMayTinh=new PhongMayTinh();
            phongMayTinh.Nhap();
            arrPhongMayTinh.add(phongMayTinh);
            arrPhongHoc.add(phongMayTinh);
        }
    }
    
    public void ThemPhongThiNghiem(){
        System.out.println("Nhap so phong thi nghiem muon them:");
        SoPhongThiNghiem=scan.nextInt();
        System.out.println("Nhap thong tin phong thi nghiem:");
        for(int i=0;i<SoPhongThiNghiem;i++){
            System.out.println("Lan "+(i+1));
            PhongThiNghiem phongThiNghiem=new PhongThiNghiem();
            phongThiNghiem.Nhap();
            arrPhongThiNghiem.add(phongThiNghiem);
            arrPhongHoc.add(phongThiNghiem);
        }
    }
    
    public void InAll(){
        System.out.println("Danh sach phong hoc ly thuyet:");
        for(int i=0;i<arrPhongHocLyThuyet.size();i++){
            System.out.println(arrPhongHocLyThuyet.get(i).toString());
        }
        System.out.println("Danh sach phong may tinh:");
        for(int i=0;i<arrPhongMayTinh.size();i++){
            System.out.println(arrPhongMayTinh.get(i).toString());
        }
        System.out.println("Danh sach phong thi nghiem:");
        for(int i=0;i<arrPhongThiNghiem.size();i++){
            System.out.println(arrPhongThiNghiem.get(i).toString());
        }
    }
    
    public void InSoPhong(){
        System.out.println("So phong ly thuyet tong cong:"+arrPhongHocLyThuyet.size());
        System.out.println("So phong may tinh tong cong:"+arrPhongMayTinh.size());
        System.out.println("So phong thi nghiem tong cong"+arrPhongThiNghiem.size());
        System.out.println("So phong tong cong:"+(arrPhongHocLyThuyet.size()+arrPhongMayTinh.size()+arrPhongThiNghiem.size()));
    }
}
