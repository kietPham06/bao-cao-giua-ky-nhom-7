import java.io.PrintWriter;
import java.time.LocalDate;

public class PHOutput {
	
	// Ô 2: Thuộc tính
	// Đối tượng PrintWriter để xuất dữ liệu
	PrintWriter out;
	
	// Ô 3: Phương thức
	// Khởi tạo đối tượng với giá trị mặc định
	PHOutput() {
		out = new PrintWriter(System.out);
	}
	
	// Khởi tạo với PrintWriter bên ngoài
	PHOutput(PrintWriter out) {
		this.out = out;
	}
	
	// Xuất thông tin phòng học lý thuyết
	void output(PhongHocLyThuyet phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("===============================================");
		out.flush();
		out.println("Đã lưu phòng học lý thuyết thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
		out.println("===============================================");
		out.flush();
	}
	
	// Xuất thông tin phòng học máy tính
	void output(PhongHocMayTinh phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	    out.println("============================================");
	    out.flush();
		out.println("Đã lưu phòng học máy tính thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	// Xuất thông tin phòng học thí nghiệm
	void output(PhongHocThiNghiem phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	    out.println("============================================");
	    out.flush();
		out.println("Đã lưu phòng học thí nghiệm thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
}
