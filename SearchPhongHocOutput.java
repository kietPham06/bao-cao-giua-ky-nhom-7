import java.io.PrintWriter;
import java.time.LocalDate;

public class SearchPhongHocOutput {
	
	// Ô 2
	PrintWriter out;
	
	// Ô 3
	SearchPhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
	void output(PhongHocLyThuyet phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Đã tìm thấy mã phòng!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	}
	
	void output(PhongHocMayTinh phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Đã tìm thấy mã phòng!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	}
	
	void output(PhongHocThiNghiem phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Đã tìm thấy mã phòng!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	}
	
}
