package exercises;

import java.util.ArrayList;
import java.util.Scanner;

class PhuongTienGiaoThong {
    private String tenChuXe;
    private String loaiXe;
    private double dungTich;
    private double triGia;

    public PhuongTienGiaoThong(String tenChuXe, String loaiXe, double dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public double tinhThueTruocBa() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }

    public void xuatThongTin() {
        System.out.println("Tên chủ xe: " + tenChuXe);
        System.out.println("Loại xe: " + loaiXe);
        System.out.println("Dung tích: " + dungTich);
        System.out.println("Trị giá: " + triGia);
        System.out.println("Thuế trước bạ: " + tinhThueTruocBa());
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public double getTriGia() {
        return triGia;
    }
}

public class QuanLyPhuongTienGiaoThong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PhuongTienGiaoThong> danhSachPhuongTien = new ArrayList<>();

        while (true) {
            System.out.println("+---------------------------------Menu---------------------------------+");
            System.out.println("| 1. Nhập danh sách phương tiện giao thông.                            |");
            System.out.println("| 2. Xuất bảng kê khai tiền thuế trước bạ của các xe.                  |");
            System.out.println("| 3. In danh sách phương tiện giao thông theo loại xe.                 |");
            System.out.println("| 4. In danh sách các phương tiện giao thông có trị giá lớn nhất.      |");
            System.out.println("| 5. Thoát.                                                            |");
            System.out.println("|______________________________________________________________________|");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng phương tiện: ");
                    int soLuongPhuongTien = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < soLuongPhuongTien; i++) {
                        System.out.println("Nhập thông tin phương tiện thứ " + (i + 1));
                        System.out.print("Tên chủ xe: ");
                        String tenChuXe = scanner.nextLine();
                        System.out.print("Loại xe: ");
                        String loaiXe = scanner.nextLine();
                        System.out.print("Dung tích xylanh: ");
                        double dungTich = scanner.nextDouble();
                        System.out.print("Trị giá xe: ");
                        double triGia = scanner.nextDouble();
                        scanner.nextLine();

                        PhuongTienGiaoThong pt = new PhuongTienGiaoThong(tenChuXe, loaiXe, dungTich, triGia);
                        danhSachPhuongTien.add(pt);
                    }
                    break;

                case 2:
                    System.out.println("Bảng kê khai tiền thuế trước bạ của các xe:");
                    for (PhuongTienGiaoThong pt : danhSachPhuongTien) {
                        pt.xuatThongTin();
                        System.out.println("-------------------");
                    }
                    break;

                case 3:
                    System.out.print("Nhập loại xe cần in danh sách: ");
                    String loaiXe = scanner.nextLine();
                    System.out.println("Danh sách phương tiện loại " + loaiXe + ":");
                    for (PhuongTienGiaoThong pt : danhSachPhuongTien) {
                        if (pt.getLoaiXe().equalsIgnoreCase(loaiXe)) {
                            pt.xuatThongTin();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 4:
                    double maxTriGia = 0;
                    for (PhuongTienGiaoThong pt : danhSachPhuongTien) {
                        if (pt.getTriGia() > maxTriGia) {
                            maxTriGia = pt.getTriGia();
                        }
                    }
                    System.out.println("Danh sách phương tiện có trị giá lớn nhất:");
                    for (PhuongTienGiaoThong pt : danhSachPhuongTien) {
                        if (pt.getTriGia() == maxTriGia) {
                            pt.xuatThongTin();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}