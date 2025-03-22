import java.io.PrintWriter;

public class UpdatePHOutput {
	
	// Ô 2: Thuộc tính (Đối tượng để ghi dữ liệu ra output)
	PrintWriter out;
	
	// Ô 3: Phương thức (Xuất thông tin cập nhật phòng học)
	
	// Khởi tạo đối tượng ghi dữ liệu ra màn hình
	UpdatePHOutput() {
		out = new PrintWriter(System.out);
	}
	
	// Hiển thị thông báo cập nhật phòng học lý thuyết
	void outputPhongHocLyThuyet(PhongHocLyThuyet phongHoc) {
		out.println("Đã cập nhật thông tin phòng học lý thuyết với mã: " + phongHoc.getMaPhong());
		out.flush();
		out.println("===============================================");
		out.flush();
	}
	
	// Hiển thị thông báo cập nhật phòng học máy tính
	void outputPhongHocMayTinh(PhongHocMayTinh phongHoc) {
		out.println("Đã cập nhật thông tin phòng học máy tính với mã: " + phongHoc.getMaPhong());
		out.flush();
		out.println("===============================================");
		out.flush();
	}
	
	// Hiển thị thông báo cập nhật phòng học thí nghiệm
	void outputPhongHocThiNghiem(PhongHocThiNghiem phongHoc) {
		out.println("Đã cập nhật thông tin phòng học thí nghiệm với mã: " + phongHoc.getMaPhong());
		out.flush();
		out.println("===============================================");
		out.flush();
	}
}
