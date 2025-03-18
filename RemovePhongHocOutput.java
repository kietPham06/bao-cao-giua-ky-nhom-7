import java.io.PrintWriter;

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
		out.println("Đã xóa phòng học lý thuyết thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
		
	}
	
	void output(PhongHocMayTinh phongHoc) {
		out.println("Đã xóa phòng học máy tính thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	}
	
	void output(PhongHocThiNghiem phongHoc) {
		out.println("Đã xóa phòng học thí nghiệm thành công!!!");
		out.flush();
		out.println("Mã phòng: " + phongHoc.maPhong);
		out.flush();
	}
}
