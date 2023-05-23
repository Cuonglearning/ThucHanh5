package Bai1;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        QuanLyPhongHoc quanLyPhongHoc=new QuanLyPhongHoc();
        
        do{
            System.out.println("===========================");
            System.out.println("1.Nhap phong hoc ly thuyet.");
            System.out.println("2.Nhap phong may tinh.");
            System.out.println("3.Nhap phong thi nghiem.");
            System.out.println("4.In danh sach cac phong.");
            System.out.println("5.In so luong cac phong.");
            System.out.println("============================");
            System.out.println("Chon chuc nang:");
            n=scan.nextInt();
            switch (n) {
                case 0:
                    System.out.println("Xin chao va hen gap lai");
                case 1:
                    quanLyPhongHoc.themLyThuyet();
                    break;
                case 2:
                    quanLyPhongHoc.themPhongMay();
                    break;
                case 3:
                    quanLyPhongHoc.ThemPhongThiNghiem();
                    break;
                case 4:
                    quanLyPhongHoc.InAll();
                    break;
                case 5:
                    quanLyPhongHoc.InSoPhong();
                    break;
                default:
                    System.out.println("khong hop le vui long nhap lai!");;
            }
        }while(n!=0);
    }
    
}
