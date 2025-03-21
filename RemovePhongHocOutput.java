import java.io.PrintWriter;

public class RemovePhongHocOutput {
	
	// Ô 2: Thuộc tính
	// Đối tượng PrintWriter để xuất dữ liệu
	PrintWriter out;
	
	// Ô 3: Phương thức
	// Constructor mặc định
	RemovePhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
	// Khởi tạo với PrintWriter bên ngoài
	RemovePhongHocOutput(PrintWriter out) {
		this.out = out;
	}
	
	// Xuất thông báo xóa phòng học lý thuyết
	void output(PhongHocLyThuyet phongHoc) {
		out.println("Đã xóa phòng học lý thuyết có mã: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	// Xuất thông báo xóa phòng học máy tính
	void output(PhongHocMayTinh phongHoc) {
		out.println("Đã xóa phòng học máy tính có mã: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	// Xuất thông báo xóa phòng học thí nghiệm
	void output(PhongHocThiNghiem phongHoc) {
		out.println("Đã xóa phòng học thí nghiệm có mã phòng: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
}
