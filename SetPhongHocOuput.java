import java.io.PrintWriter;

public class SetPhongHocOuput {
	
	// Ô 2
	PrintWriter out;
	
	// Ô 3
	SetPhongHocOuput() {
		out = new PrintWriter(System.out);
	}
	
	void outputPhongHocLyThuyet(PhongHocLyThuyet phongHoc) {
		out.println("Đã cập nhật thông tin phòng học lý thuyết với mã: " + phongHoc.getMaPhong());
		out.flush();
        out.println("============================================");
	    out.flush();

	}
	
	void outputPhongHocMayTinh(PhongHocMayTinh phongHoc) {
		out.println("Đã cập nhật thông tin phòng học lý thuyết với mã: " + phongHoc.getMaPhong());
		out.flush();
        out.println("============================================");
	    out.flush();

	}
	
	void outputPhongHocThiNghiem(PhongHocThiNghiem phongHoc) {
		out.println("Đã cập nhật thông tin phòng học lý thuyết với mã: " + phongHoc.getMaPhong());
		out.flush();
        out.println("============================================");
	    out.flush();
	}

	
}
