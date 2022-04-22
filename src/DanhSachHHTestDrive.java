import java.text.ParseException;
import java.util.Scanner;

public class DanhSachHHTestDrive {
    public static void main(String[] args) {
    int luaChon;
    int key;
    try (Scanner sc = new Scanner(System.in)) {
        DanhSachHH danhSachHH = new DanhSachHH();

        do {
            System.out.println("\n\t---------------- Menu ----------------");
            System.out.println("\t1. Them hang hoa.");
            System.out.println("\t2. Xoa hang hoa.");
            System.out.println("\t3. Sua hang hoa.");
            System.out.println("\t4. In danh sach hang hoa.");
            System.out.println("\t5. Tim kiem hang hoa.");
            System.out.println("\t6. Thong ke kho hang.");
            System.out.println("\t7. Bao cao.");
            System.out.println("\t8. Sap xep hang hoa.");
            System.out.println("\t0. Thoat.");
            System.out.println("\t----------------------------------------");
            System.out.print("\n- Vui long nhap lua chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    do {
                        System.out.println("\n\t---------- Menu them hang hoa ----------");
                        System.out.println("\t1. Them hang hoa.");
                        System.out.println("\t2. Them hang hoa truoc ma hang hoa.");
                        System.out.println("\t3. Them hang hoa sau ma hang hoa.");
                        System.out.println("\t0. Thoat.");
                        System.out.println("\t------------------------------------------");
                        System.out.print("\n- Vui long nhap lua chon: ");
                        key = sc.nextInt();
                        sc.nextLine();
                        switch (key) {
                            case 1:
                                danhSachHH.themHangHoa();
                                break;
                            case 2:
                                danhSachHH.themTruocMaHangHoa();
                                break;
                            case 3:
                                danhSachHH.themSauMaHangHoa();
                                break;
                            default:
                                break;
                        }
                    } while (key != 0);
                    break;
                case 2:
                    danhSachHH.xoaHangHoaTheoMa();
                    break;
                case 3:
                    danhSachHH.suaHangHoaTheoMa();
                    break;
                case 4:
                    danhSachHH.inDanhSach();
                    break;
                case 5:
                    do {
                        System.out.println("\n\t------------ Menu tim kiem hang ho--------------");
                        System.out.println("\t1. Tim kiem hang hoa theo loai hang.");
                        System.out.println("\t2. Tim kiem hang hoa theo ma hang hoa.");
                        System.out.println("\t3. Tim kiem hang hoa theo ten hang hoa.");
                        System.out.println("\t4. Tim kiem hang hoa theo so luong ton kho.");
                        System.out.println("\t5. Tim kiem hang hoa theo don gia.");
                        System.out.println("\t6. Tim kiem hang hoa theo khoan don gia.");
                        System.out.println("\t0. Thoat.");
                        System.out.println("\t--------------------------------------------------");
                        System.out.print("\n- Vui long nhap lua chon: ");
                        key = sc.nextInt();
                        sc.nextLine();
                        switch (key) {
                            case 1:
                                danhSachHH.timKiemTheoLoai();
                                break;
                            case 2:
                                danhSachHH.timKiemTheoMa();
                                break;
                            case 3:
                                danhSachHH.timKiemTheoTen();
                                break;
                            case 4:
                                danhSachHH.timKiemTheoSoLuongTonKho();
                                break;
                            case 5:
                                danhSachHH.timKiemTheoDonGia();
                                break;
                            case 6:
                                danhSachHH.timKiemTheoKhoanGia();
                                break;
                            default:
                                break;
                        }
                    } while (key != 0);
                    break;
                case 6:
                    danhSachHH.thongKe();
                    break;
                case 7: 
                    danhSachHH.baoCao();
                    break;
                case 8:
                    do {
                        System.out.println("\n\t----------- Menu sap xep hang hoa -------------");
                        System.out.println("\t1. Sap xep hang hoa tang dan theo ma.");
                        System.out.println("\t2. Sap xep hang hoa giam dan theo ma.");
                        System.out.println("\t3. Sap xep hang hoa tang dan theo don gia.");
                        System.out.println("\t4. Sap xep hang hoa giam dan theo don gia.");
                        System.out.println("\t0. Thoat.");
                        System.out.println("\t-------------------------------------------------");
                        System.out.print("\n- Vui long nhap lua chon: ");
                        key = sc.nextInt();
                        sc.nextLine();
                        switch (key) {
                            case 1:
                                danhSachHH.sapXepTangDanTheoMa();
                                danhSachHH.inDanhSach();
                                break;
                            case 2:
                                danhSachHH.sapXepGiamDanTheoMa();
                                danhSachHH.inDanhSach();
                                break;
                            case 3:
                                danhSachHH.sapXepTangDanTheoDonGia();
                                danhSachHH.inDanhSach();
                            case 4:
                                danhSachHH.sapXepGiamDanTheoDonGia();
                                danhSachHH.inDanhSach();
                            default:
                                break;
                        }
                    } while (key != 0);
                    break;
               
            }
        } while (luaChon != 0);
    } catch (ParseException e) {
        e.printStackTrace();
    }
}
    
}
