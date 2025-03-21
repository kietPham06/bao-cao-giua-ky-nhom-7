import java.io.PrintWriter;
import java.util.Scanner;

public class DeletePHControl {
	
	// Ô 2: Thuộc tính
	// Đối tượng nhập xuất dữ liệu và xử lý lưu trữ
	Scanner keyboard;
	PrintWriter out;
	DeletePHStorage storage;
	DeletePHOutput output;
	
	// Ô 3: Phương thức
	// Constructor mặc định
	DeletePHControl() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new DeletePHStorage();
		output = new DeletePHOutput();
	}
	
	// Constructor với Scanner và PrintWriter
	DeletePHControl(Scanner keyboard, PrintWriter out) {
		this.keyboard = keyboard;
		this.out = out;
	}
	
	// Constructor với Scanner, PrintWriter và Storage
	DeletePHControl(Scanner keyboard, PrintWriter out, DeletePHStorage storage) {
		this(keyboard, out);
		this.storage = storage;
	}
	
	// Constructor với Scanner, PrintWriter, Storage và Output
	DeletePHControl(Scanner keyboard, PrintWriter out, DeletePHStorage storage, DeletePHOutput output) {
		this(keyboard, out, storage);
		this.output = output;
	}

	// Phương thức xóa phòng học
	void delete() {
		String maPhong;
		int loaiPhongHoc;
		PhongHocLyThuyet phongHocLyThuyet;
		PhongHocMayTinh phongHocMayTinh;
		PhongHocThiNghiem phongHocThiNghiem;
		
		out.println("===============================================");
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

		out.println("===============================================");
		out.flush();
		
		switch (loaiPhongHoc) {
			case 1:
				phongHocLyThuyet = storage.selectPhongHocLyThuyet(maPhong);
				if (phongHocLyThuyet == null) {
					out.println("Không tìm thấy phòng học lý thuyết.");
					out.flush();
					out.println("===============================================");
					out.flush();
				} else {
					storage.deletePhongHocLyThuyet(maPhong);
					output.output(new PhongHocLyThuyet(maPhong, "", 0.0, 0, "", false));
				}
				break;
			case 2:
				phongHocMayTinh = storage.selectPhongHocMayTinh(maPhong);
				if (phongHocMayTinh == null) {
					out.println("Không tìm thấy phòng học máy tính.");
					out.flush();
					out.println("===============================================");
					out.flush();
				} else {
					storage.deletePhongHocMayTinh(maPhong);
					output.output(new PhongHocMayTinh(maPhong, "", 0.0, 0, "", 0));
				}
				break;
			case 3:
				phongHocThiNghiem = storage.selectPhongHocThiNghiem(maPhong);
				if (phongHocThiNghiem == null) {
					out.println("Không tìm thấy phòng học thí nghiệm.");
					out.flush();
					out.println("===============================================");
					out.flush();
				} else {
					storage.deletePhongHocThiNghiem(maPhong);
					output.output(new PhongHocThiNghiem(maPhong, "", 0.0, 0, "", "", 0, false));
				}
				break;
			default:
				out.println("Loại phòng không hợp lệ.");
				out.flush();
				out.println("===============================================");
				out.flush();
		}
	}
}
