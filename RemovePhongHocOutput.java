import java.io.PrintWriter;
import java.time.LocalDate;

public class RemovePhongHocOutput {
	
	//Ô 2
	PrintWriter out;
	
	// Ô 3
	RemovePhongHocOutput() {
		out = new PrintWriter(System.out);
	}
	
	RemovePhongHocOutput(PrintWriter out) {
		this.out = out;
	}
	
	void output(PhongHocLyThuyet phongHoc) {
		out.println("Đã xóa phòng học lý thuyết có mã: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	void output(PhongHocMayTinh phongHoc) {
		out.println("Đã xóa phòng học máy tính có mã: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	void output(PhongHocThiNghiem phongHoc) {;
		out.println("Đã xóa phòng học thí nghiệm có mã phòng: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
}
