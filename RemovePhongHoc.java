import java.io.PrintWriter;
import java.util.Scanner;

public class RemovePhongHoc {
	
	// Ô 2
	Scanner keyboard;
	PrintWriter out;
	RemovePhongHocStorage storage;
	RemovePhongHocOutput output;
	SearchPhongHocStorage kiemTraPhongHoc;
	
	// Ô 3
	RemovePhongHoc() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new RemovePhongHocStorage();
		output = new RemovePhongHocOutput();
		kiemTraPhongHoc = new SearchPhongHocStorage();
	}
	
	RemovePhongHoc(Scanner keyboard, PrintWriter out) {
		this.keyboard = keyboard;
		this.out = out;
	}
	
	RemovePhongHoc(Scanner keyboard, PrintWriter out, RemovePhongHocStorage storage) {
		this(keyboard, out);
		this.storage = storage;
	}
	
	RemovePhongHoc(Scanner keyboard, PrintWriter out, RemovePhongHocStorage storage, RemovePhongHocOutput output) {
		this(keyboard, out, storage);
		this.output = output;
	}
	
	RemovePhongHoc(Scanner keyboard, PrintWriter out, RemovePhongHocStorage storage, RemovePhongHocOutput output, SearchPhongHocStorage kiemTraPhongHoc) {
		this(keyboard, out, storage, output);
		this.kiemTraPhongHoc = kiemTraPhongHoc;
	}
	
	void removePhongHoc() {
		String maPhong;
		int loaiPhongHoc;
		PhongHocLyThuyet phongHocLyThuyet;
		PhongHocMayTinh phongHocMayTinh;
		PhongHocThiNghiem phongHocThiNghiem;
		
	    out.println("============================================");
	    out.flush();

		out.print("Nhập mã phòng cần xóa: ");
		out.flush();
		maPhong = keyboard.nextLine();

		out.println("Chọn loại phòng học:");
		out.flush();
		out.println("1 - Lý thuyết | 2 - Máy tính | 3 - Thí nghiệm");
		out.flush();
		out.print("Chọn: ");
		out.flush();
		loaiPhongHoc = keyboard.nextInt();
		keyboard.nextLine(); // Xử lý dòng trống

	    out.println("============================================");
	    out.flush();
		
		switch (loaiPhongHoc) {
			case 1:
				phongHocLyThuyet = kiemTraPhongHoc.selectPhongHocLyThuyet(maPhong);
				if (phongHocLyThuyet == null) {
					out.println("Không tìm thấy phòng học lý thuyết.");
					out.flush();
					out.println("============================================");
				    out.flush();
				} else {
					storage.deletePhongHocLyThuyet(maPhong);
					output.output(new PhongHocLyThuyet(maPhong, "", 0.0, 0, "", false));
				}
				break;
			case 2:
				phongHocMayTinh = kiemTraPhongHoc.selectPhongHocMayTinh(maPhong);
				if (phongHocMayTinh == null) {
					out.println("Không tìm thấy phòng học máy tính.");
					out.flush();
					out.println("============================================");
				    out.flush();
				} else {
					storage.deletePhongHocMayTinh(maPhong);
					output.output(new PhongHocMayTinh(maPhong, "", 0.0, 0, "", 0));
				}
				break;
			case 3:
				phongHocThiNghiem = kiemTraPhongHoc.selectPhongHocThiNghiem(maPhong);
				if (phongHocThiNghiem == null) {
					out.println("Không tìm thấy phòng học thí nghiệm.");
					out.flush();
					out.println("============================================");
				    out.flush();
				} else {
					storage.deletePhongHocThiNghiem(maPhong);
					output.output(new PhongHocThiNghiem(maPhong, "", 0.0, 0, "", "", 0, false));
				}
				break;
			default:
				out.println("Loại phòng không hợp lệ.");
				out.flush();
				out.println("============================================");
			    out.flush();
		}
	}
}
