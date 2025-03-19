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
	    out.println("============================================");
	    out.flush();
		out.println("Đã tìm thấy mã phòng");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	void output(PhongHocMayTinh phongHoc) {
	    out.println("============================================");
	    out.flush();
		out.println("Đã tìm thấy mã phòng!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	void output(PhongHocThiNghiem phongHoc) {
	    out.println("============================================");
	    out.flush();
		out.println("Đã tìm thấy mã phòng!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
}
