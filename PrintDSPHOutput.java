import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class PrintDSPHOutput {
    
    // Ô 2: Thuộc tính - Đối tượng PrintWriter để in ra màn hình
    PrintWriter out;
    
    // Ô 3: Phương thức
    
    // Constructor - Khởi tạo đối tượng PrintWriter
    PrintDSPHOutput() {
        out = new PrintWriter(System.out);
    }
    
    // Phương thức output - Xuất danh sách các loại phòng học
    void output(ArrayList<PhongHocLyThuyet> danhSachPhongHocLyThuyet, ArrayList<PhongHocMayTinh> danhSachPhongHocMayTinh, ArrayList<PhongHocThiNghiem> danhSachPhongHocThiNghiem) {
		out.println("===============================================");
		out.flush();
    
        // Xuất danh sách phòng học lý thuyết
        for (PhongHocLyThuyet phongHoc : danhSachPhongHocLyThuyet) {
            LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
            out.println("Mã phòng: " + phongHoc.getMaPhong());
            out.flush();
            out.println("Ngày hoạt động: " + date);
            out.flush();
            out.println("Loại phòng: Lý Thuyết");
            out.flush();
            if (!danhSachPhongHocLyThuyet.isEmpty()) {    
        		out.println("===============================================");
        		out.flush();
            }
        }
    
        // Xuất danh sách phòng học máy tính
        for (PhongHocMayTinh phongHoc : danhSachPhongHocMayTinh) {
            LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
            out.println("Mã phòng: " + phongHoc.getMaPhong());
            out.flush();
            out.println("Ngày hoạt động: " + date);
            out.flush();
            out.println("Loại phòng: Máy tính");
            out.flush();
            if (!danhSachPhongHocMayTinh.isEmpty()) {    
        		out.println("===============================================");
        		out.flush();
            }
        }
    
        // Xuất danh sách phòng học thí nghiệm
        for (PhongHocThiNghiem phongHoc : danhSachPhongHocThiNghiem) {
            LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
            out.println("Mã phòng: " + phongHoc.getMaPhong());
            out.flush();
            out.println("Ngày hoạt động: " + date);
            out.flush();
            out.println("Loại phòng: Thí Nghiệm");
            out.flush();
    		out.println("===============================================");
    		out.flush();
        }
    }
}
