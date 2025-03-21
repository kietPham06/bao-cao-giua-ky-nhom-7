import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class PKDCOutput {
	
	//Ô 2
	PrintWriter out;
    
	// Ô 3
	PKDCOutput() {
    	out = new PrintWriter(System.out);
    }
    
	void output(PhongHocLyThuyet phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
		
	}
	
	void output(PhongHocMayTinh phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
	
	void output(PhongHocThiNghiem phongHoc) {
		LocalDate date = LocalDate.parse(phongHoc.getNgayHoatDong());
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		out.println("Ngày hoạt động: " + date);
		out.flush();
	    out.println("============================================");
	    out.flush();
	}
}
