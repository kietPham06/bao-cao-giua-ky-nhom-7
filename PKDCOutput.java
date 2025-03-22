import java.io.PrintWriter;
import java.time.LocalDate;

public class PKDCOutput {
	
	// Ô 2: Thuộc tính
	PrintWriter out; // Đối tượng dùng để in dữ liệu ra màn hình
    
	// Ô 3: Phương thức
	
	// Constructor khởi tạo PrintWriter với System.out
	PKDCOutput() {
    	out = new PrintWriter(System.out);
    }
    
	// Xuất thông tin phòng học lý thuyết
	void output(PhongHocLyThuyet phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
		out.println("Loại phòng: Lý thuyết");
		out.flush();
		out.println("===============================================");
		out.flush();
	}
	
	// Xuất thông tin phòng học máy tính
	void output(PhongHocMayTinh phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
		out.println("Loại phòng: Máy tính");
		out.flush();
		out.println("===============================================");
		out.flush();
	}
	
	// Xuất thông tin phòng học thí nghiệm
	void output(PhongHocThiNghiem phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
		out.println("Loại phòng: Thí nghiệm");
		out.flush();
		out.println("===============================================");
		out.flush();
	}
}
