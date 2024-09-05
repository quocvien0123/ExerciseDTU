package exercises;

import java.util.ArrayList;
import java.util.Scanner;

class HocSinh {
    private String hoTen;
    private String lop;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public HocSinh(String hoTen, String lop, double diemToan, double diemLy, double diemHoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    // Tính điểm trung bình
    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    // Phương thức nhập
    public static HocSinh nhapHocSinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        String lop = scanner.nextLine();
        System.out.print("Nhập điểm Toán: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double diemHoa = scanner.nextDouble();
        return new HocSinh(hoTen, lop, diemToan, diemLy, diemHoa);
    }

    // Phương thức xuất
    public void xuatThongTin() {
        System.out.println("Họ tên: " + hoTen + ", Lớp: " + lop + ", Điểm TB: " + tinhDiemTrungBinh());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HocSinh> danhSach = new ArrayList<>();

        // Nhập danh sách học sinh
        System.out.print("Nhập số lượng học sinh: ");
        int soLuong = scanner.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin học sinh thứ " + (i + 1));
            HocSinh hs = HocSinh.nhapHocSinh();
            danhSach.add(hs);
        }

        // In danh sách học sinh có điểm trung bình >= 5
        System.out.println("Danh sách học sinh có điểm trung bình >= 5:");
        for (HocSinh hs : danhSach) {
            if (hs.tinhDiemTrungBinh() >= 5) {
                hs.xuatThongTin();
            }
        }
    }
}
