package exercises;


import java.util.Scanner;

class SinhVien {
    private String ten;
    private double toan;
    private double ly;
    private double hoa;

    public SinhVien(String ten, double toan, double ly, double hoa) {
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    // Phương thức tính điểm trung bình
    public double tinhDiemTrungBinh() {
        return (toan + ly + hoa) / 3;
    }

    // Phương thức xếp loại dựa trên điểm trung bình
    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();
        if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    // Phương thức in thông tin sinh viên
    public void inThongTin() {
        double dtb = tinhDiemTrungBinh();
        System.out.println("Tên sinh viên: " + ten);
        System.out.printf("Điểm trung bình: %.2f\n", dtb);
        System.out.println("Xếp loại: " + xepLoai());
    }
}

public class XepLoaiSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.print("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        double hoa = scanner.nextDouble();

        // Tạo đối tượng sinh viên và tính toán
        SinhVien sv = new SinhVien(ten, toan, ly, hoa);

        // In thông tin sinh viên
        sv.inThongTin();
    }
}
