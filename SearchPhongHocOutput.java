import java.io.PrintWriter;
import java.time.LocalDate;

public class SearchPhongHocOutput {
	
	// Ô 2: Thuộc tính (Đối tượng để ghi dữ liệu ra output)
	PrintWriter out;
	
	// Ô 3: Phương thức (Xuất thông tin phòng học)
	
	// Khởi tạo đối tượng ghi dữ liệu ra màn hình
	SearchPhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
	// Hiển thị thông tin phòng học lý thuyết
	void output(PhongHocLyThuyet phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	    out.println("============================================");
	    out.flush();
		out.println("Đã tìm thấy phòng học lý thuyết!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	// Hiển thị thông tin phòng học máy tính
	void output(PhongHocMayTinh phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	    out.println("============================================");
	    out.flush();
		out.println("Đã tìm thấy phòng học máy tính!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	// Hiển thị thông tin phòng học thí nghiệm
	void output(PhongHocThiNghiem phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	    out.println("============================================");
	    out.flush();
		out.println("Đã tìm thấy phòng học thí nghiệm!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
}
