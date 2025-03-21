import java.io.PrintWriter;
import java.time.LocalDate;

public class PhongHocOutput {
	
	// Ô 2
	PrintWriter out;
	
	// Ô 3
	PhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
	PhongHocOutput(PrintWriter out) {
		this.out = out;
	}
	
	void output(PhongHocLyThuyet phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
	    out.println("============================================");
	    out.flush();
		out.println("Đã lưu phòng học lý thuyết thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
		
	}
	
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
