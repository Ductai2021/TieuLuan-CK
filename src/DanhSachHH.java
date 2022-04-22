import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class DanhSachHH {
    private List<HangHoa> quanLyHH = new ArrayList<>();
    Input consoleInput = new Input();
    /**
     * @return 
     * 
     */
    public void DanhSachHangHoa() {
    }

    /**
     * @param quanLyKhoHang
     * @return 
     */
    public void DanhSachHangHoa(List<HangHoa> quanLyHangHoa) {
        this.quanLyHH = quanLyHangHoa;
    }

    public void duLieuMoi(){
        try {
            HangHoa hangThucPham1 = new HangThucPham("tp01", "mì tôm", 0, 10000, consoleInput.ngayVN.parse("01/01/2022"), consoleInput.ngayVN.parse("11/01/2022"), "CT rau sach Da Lat GAP");
            HangHoa hangThucPham2 = new HangThucPham("tp02", "Gạo", 20, 20000, consoleInput.ngayVN.parse("02/03/2022"), consoleInput.ngayVN.parse("11/11/2022"), "CT rau sach Da Lat GAP");
            HangHoa hangThucPham3 = new HangThucPham("tp03", "Bột", 30, 30000, consoleInput.ngayVN.parse("03/03/2022"), consoleInput.ngayVN.parse("11/11/2022"), "CT rau sach Da Lat GAP");
            HangHoa hangThucPham4 = new HangThucPham("tp04", "gia vị", 40, 10000, consoleInput.ngayVN.parse("04/03/2022"), consoleInput.ngayVN.parse("11/11/2022"), "CTTNHH Co phan Tien Hung");
            HangHoa hangThucPham5 = new HangThucPham("tp05", "nước chấm", 50, 20000, consoleInput.ngayVN.parse("05/03/2022"), consoleInput.ngayVN.parse("11/11/2022"), "CTTNHH Vua Gao");
            
            HangHoa hangDienMay1 = new HangDienMay("dm01", "máy giặt", 2, 500_000, 12, 100);
            HangHoa hangDienMay2 = new HangDienMay("dm02", "tủ lạnh", 1_000, 100_000, 6, 100);
            HangHoa hangDienMay3 = new HangDienMay("dm03", "nồi cơm", 1_000, 100_000, 6, 100);
            HangHoa hangDienMay4 = new HangDienMay("dm04", "âm siêu tốc", 1_000, 400_000, 12, 65);
            HangHoa hangDienMay5 = new HangDienMay("dm05", "quạt máy", 1_000, 100_000, 6, 50);
            

            HangHoa hangSanhSu1 = new HangSanhSu("ss01", "ly", 5_000, 10_000, "CT san xuat to chen cao cap xuat khau Chau Au, My, Nhat", consoleInput.ngayVN.parse("08/04/2022"));
            HangHoa hangSanhSu2 = new HangSanhSu("ss02", "bình hoa", 5, 10_000, "CT san xuat to chen cao cap xuat khau Chau Au, My, Nhat", consoleInput.ngayVN.parse("20/03/2022"));
            HangHoa hangSanhSu3 = new HangSanhSu("ss03", "dĩa", 5_000, 10_000, "CT san xuat to chen cao cap xuat khau Chau Au, My, Nhat", consoleInput.ngayVN.parse("20/03/2022"));
            HangHoa hangSanhSu4 = new HangSanhSu("ss04", "chén", 5_000, 5_000, "CT san xuat to chen cao cap xuat khau Chau Au, My, Nhat", consoleInput.ngayVN.parse("20/03/2022"));
            HangHoa hangSanhSu5 = new HangSanhSu("ss05", "heo đất", 5_000, 5_000, "CT san xuat to chen cao cap xuat khau Chau Au, My, Nhat", consoleInput.ngayVN.parse("20/03/2022"));

            quanLyHH.add(hangThucPham1);
            quanLyHH.add(hangThucPham2);
            quanLyHH.add(hangThucPham3);
            quanLyHH.add(hangThucPham4);
            quanLyHH.add(hangThucPham5);

            quanLyHH.add(hangDienMay1);
            quanLyHH.add(hangDienMay2);
            quanLyHH.add(hangDienMay3);
            quanLyHH.add(hangDienMay4);
            quanLyHH.add(hangDienMay5);

            quanLyHH.add(hangSanhSu1);
            quanLyHH.add(hangSanhSu2);
            quanLyHH.add(hangSanhSu3);
            quanLyHH.add(hangSanhSu4);
            quanLyHH.add(hangSanhSu5);
        } catch (ParseException e) {
            System.out.println("Vui lòng nhập lại yêu cầu của bạn(bị Lỗi rồi)!");
            e.printStackTrace();
        }
        
    }

    public void themHangHoa() throws ParseException {
        while (true) {
            quanLyHH.add(consoleInput.inputKhoHang(quanLyHH));
            System.out.print("- Bạn có muốn nhập thêm không (Y/N): ");
            if (consoleInput.input.nextLine().equalsIgnoreCase("N")) {
                return;
            }
        }
    }  

    public void themTruocMaHangHoa() throws ParseException {
        System.out.print("- Nhập mã hàng hóa bạn cần thêm trước mã hàng hóa có sẵn: ");
        String ma = consoleInput.input.nextLine();

        int viTri = timViTri(ma);

        if (viTri != -1) {
            quanLyHH.add(viTri, consoleInput.inputKhoHang(quanLyHH));
        } else {
            System.out.println("Nhập mã hàng hóa bạn cần thêm trước mã hàng hóa có sẵn:");
        }
        return;
    }

    public void themSauMaHangHoa() throws ParseException {
        System.out.print("- NNhập mã hàng hóa bạn cần thêm sau mã hàng hóa có sẵn: ");
        String ma = consoleInput.input.nextLine();

        int viTri = timViTri(ma);

        if (viTri != -1) {
            quanLyHH.add(viTri + 1, consoleInput.inputKhoHang(quanLyHH));
        } else {
            System.out.println("Nhập mã hàng hóa bạn cần thêm trước mã hàng hóa có sẵn:");
        }
        return;
    }

    public HangHoa timHangHoaTheoMa(String maHH) {
        HangHoa hangHoa = null;
        for (HangHoa hh : quanLyHH) {
            if (hh.getMaHang().equalsIgnoreCase(maHH)) {
                hangHoa = hh;
            }
        }
        if (hangHoa == null) {
            System.out.println("Nhập mã hàng hóa bạn cần tìm trong danh sách");
        }
        return hangHoa;
    }

    public void xoaHangHoaTheoMa() {
        HangHoa hangHoa = null;
        System.out.print("- Nhập mã hàng hóa bạn cần xóa: ");
        String ma = consoleInput.input.nextLine();

        hangHoa = timHangHoaTheoMa(ma);

        if (hangHoa != null) {
            quanLyHH.remove(hangHoa);
            System.out.println("Hàng hóa đã được xóa theo yêu cầu!");
        } else {
            System.out.println("Mã hàng hóa bạn muốn xóa không có trong sách!");
        }
    }

    public int timViTri(String maHH) {
        int viTri = -1;
        for (HangHoa hh : quanLyHH) {
            viTri++;
            if (hh.getMaHang().equalsIgnoreCase(maHH)) {
                return viTri;
            }
        }
        return viTri;
    }

    public void suaHangHoaTheoMa(){
        HangHoa hangHoa = null;
        System.out.print("- Nhập mã hàng hóa bạn muốn sửa: ");
        String ma = consoleInput.input.nextLine();

        hangHoa = timHangHoaTheoMa(ma);
        int viTri = timViTri(ma);

        if (hangHoa != null) {
            hangHoa = quanLyHH.set(viTri, consoleInput.suaHangHoa(hangHoa));
            System.out.println("Hàng hóa đã được sửa thành công.");
        } else {
            System.out.println("Mã hàng hóa bạn muốn sửa không có trong sách!");
        }
        return;
    }

    public void timKiemTheoLoai() {
        int loai;
        System.out.print("- Bạn muốn tìm mặt hàng nào? \n- Hàng Thực phẩm - 1, Hàng điện máy - 2, Hàng sành sứ - 3: ");
        loai = consoleInput.input.nextInt();
        consoleInput.input.nextLine();
        for (HangHoa hangHoa : quanLyHH) {
            if (loai == 1 && hangHoa instanceof HangThucPham) {
                System.out.println(hangHoa);
            } else if (loai == 2 && hangHoa instanceof HangDienMay) {
                System.out.println(hangHoa);
            } else if(loai == 3 && hangHoa instanceof HangSanhSu) {
                System.out.println(hangHoa);
            }
        }
    }
    
    public void timKiemTheoMa() {
        System.out.print("- Nhập mã hàng hóa bạn cần tìm: ");
        String maHH = consoleInput.input.nextLine();
        HangHoa hangHoa = null;
        hangHoa = timHangHoaTheoMa(maHH);
        if (hangHoa == null) {
            System.out.println("Mã hàng hóa bạn muốn tìm không có trong sách!");
        } else {
            System.out.println(hangHoa);
        }
    }

    public void timKiemTheoTen() {
        System.out.print("- Nhập tên hàng hóa bạn cần tìm: ");
        String tenHH = consoleInput.input.nextLine();
        HangHoa hangHoa = null;
        for (HangHoa hh : quanLyHH) {
            if (hh.getTenHang().equalsIgnoreCase(tenHH)) {
                hangHoa = hh;
                System.out.println(hangHoa);
            }
        }
        if (hangHoa == null) {
            System.out.println("Tên hàng hóa bạn cần tìm không có trong danh sách!");
        }
    }

    public void timKiemTheoSoLuongTonKho() {
        System.out.print("- Nhập số lượng tồn kho bạn cần tìm ");
        int soLuong = consoleInput.input.nextInt();
        HangHoa hangHoa = null;
        for (HangHoa hh : quanLyHH) {
            if (hh.getSoLuongTon() == soLuong) {
                hangHoa = hh;
                System.out.println(hangHoa);
            }
        }
        if (hangHoa == null) {
            System.out.println("số lượng bạn cần tìm không có trong danh sách!");
        }
    }

    public void timKiemTheoDonGia() {
        System.out.print("- Nhập đơn giá bạn cần tìm:  ");
        double donGia = consoleInput.input.nextDouble();
        HangHoa hangHoa = null;
        for (HangHoa hh : quanLyHH) {
            if (hh.getDonGia() == donGia) {
                hangHoa = hh;
                System.out.println(hangHoa);
            }
        }
        if (hangHoa == null) {
            System.out.println("Đơn giá bạn cần tìm không có trong danh sách1");
        }
    }

    public void timKiemTheoKhoanGia() {
        System.out.print("- Nhập khoảng giá tiền bạn cần tìm hàng hóa: ");
        double giaNho = consoleInput.input.nextDouble();
        System.out.print("- Den: ");
        double gaiLon = consoleInput.input.nextDouble();
        HangHoa hangHoa = null;
        for (HangHoa hh : quanLyHH) {
            if (giaNho <= hh.getDonGia() && hh.getDonGia() <= gaiLon) {
                hangHoa = hh;
                System.out.println(hangHoa);
            }
        }
        if (hangHoa == null) {
            System.out.println("đơn giá bạn cần tìm không có sẵn trong danh sách!");
        }
    }

    public void sapXepTangDanTheoMa() {
        Collections.sort(quanLyHH, (o1, o2) -> o1.getMaHang().compareToIgnoreCase(o2.getMaHang()));
    }

    public void sapXepGiamDanTheoMa() {
        Collections.sort(quanLyHH, (o1, o2) -> o2.getMaHang().compareToIgnoreCase(o1.getMaHang()));
    }

    public void sapXepTangDanTheoDonGia() {
        Collections.sort(quanLyHH, (o1, o2) -> sortDonGia(o1, o2));
    }
    
    public void sapXepGiamDanTheoDonGia() {
        Collections.sort(quanLyHH, (o1, o2) -> sortDonGia(o2, o1));
    }

    private int sortDonGia(HangHoa o1, HangHoa o2) {
        if (o1.getDonGia() > o2.getDonGia()) {
            return 1;
        } else if (o1.getDonGia() < o2.getDonGia()) {
            return -1;
        } else {
            return 0;
        }        
    }

    public void thongKe() {
        int tongSoLuongTonKhoHTP = 0;
        int tongSoLuongTonKhoHDM = 0;
        int tongSoLuongTonKhoHSS = 0;
        double donGiaHTP = 0;
        double donGiaHDM = 0;
        double donGiaHSS = 0;

        for (HangHoa hangHoa : quanLyHH) {
            if (hangHoa instanceof HangThucPham) {
                tongSoLuongTonKhoHTP += hangHoa.getSoLuongTon();
                donGiaHTP += hangHoa.getDonGia();
            } else if (hangHoa instanceof HangDienMay) {
                tongSoLuongTonKhoHDM += hangHoa.getSoLuongTon();
                donGiaHDM += hangHoa.getDonGia();
            } else {
                tongSoLuongTonKhoHSS += hangHoa.getSoLuongTon();
                donGiaHSS += hangHoa.getDonGia();
            }
        }

        System.err.println("\t---------------Thong ke kho hang---------------");
        System.out.println("Tổng số lượng tồn kho hàng thực phẩm là: " + tongSoLuongTonKhoHTP);
        System.out.println("Tổng số lượng tồn kho hàng điện máy là: " + tongSoLuongTonKhoHDM);
        System.out.println("Tổng số lượng tồn kho hàng tồn kho là: " + tongSoLuongTonKhoHSS);
        System.out.println("Tổng số lượng hàng tồn kho là: " + (tongSoLuongTonKhoHTP + tongSoLuongTonKhoHDM + tongSoLuongTonKhoHSS));
        System.out.println("Tổng đơn giá của hàng thực phẩm là: " + donGiaHTP);
        System.out.println("Tổng đơn giá của hàng điện máy là: " + donGiaHDM);
        System.out.println("Tổng đơn giá của hàng sành sứ là: " + donGiaHSS);
        System.out.println("Tổng đơn giá của kho hàng là: " + (donGiaHTP + donGiaHDM + donGiaHSS));
    }

    public void baoCao() {
        String strHTP = "";
        String strHTPKhoBan = "";
        String strHDM = "";
        String strHDMBanDuoc = "";
        String strHSS = "";
        String strHSSBanCham = "";
        
        for (HangHoa hangHoa : quanLyHH) {
            if (hangHoa instanceof HangThucPham) {
                if (hangHoa.danhGiaMDBB().equalsIgnoreCase("Kho ban")) {
                    strHTPKhoBan += hangHoa.getTenHang() + "\t";
                } else {
                    strHTP += hangHoa.getTenHang() + "\t";
                }
            } else if (hangHoa instanceof HangDienMay){
                if (hangHoa.danhGiaMDBB().equalsIgnoreCase("Ban duoc")) {
                    strHDMBanDuoc += hangHoa.getTenHang() + "\t";
                } else {
                    strHDM += hangHoa.getTenHang() + "\t";
                }
            } else if (hangHoa instanceof HangSanhSu){
                if (hangHoa.danhGiaMDBB().equalsIgnoreCase("Ban cham")) {
                    strHSSBanCham += hangHoa.getTenHang() + "\t";
                } else {
                    strHSS += hangHoa.getTenHang() + "\t";
                }
            }
        }
        System.out.println("Nhung loai hang hoa duoc danh gia kho ban: " + strHTPKhoBan);
        System.out.println("Nhung loai hang hoa khong duoc danh gia: " + strHTP);
        System.out.println("Nhung loai hang hoa duoc danh gia ban duoc: " + strHDMBanDuoc);
        System.out.println("Nhung loai hang hoa khong duoc danh gia: " + strHDM);
        System.out.println("Nhung loai hang hoa duoc danh gia ban cham: " + strHSSBanCham);
        System.out.println("Nhung loai hang hoa khong duoc danh gia: " + strHSS);
    }
    public void inDanhSach() {
        for (HangHoa hangHoa : quanLyHH) {
            System.out.println(hangHoa);
        }
    }
    
}
