import java.io.PrintWriter;
import java.util.Scanner;

public class RemovePhongHoc {
	
	// Ô 2
	Scanner keyboard;
	PrintWriter out;
	RemovePhongHocStorage storage;
	RemovePhongHocOutput output;
	
	// Ô 3
	RemovePhongHoc() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new RemovePhongHocStorage();
		output = new RemovePhongHocOutput();
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
	
	void removePhongHoc() {
		
        out.print("Nhập mã phòng cần xóa: ");
        out.flush();
        
        String maPhong = keyboard.nextLine();

        out.println("Chọn loại phòng học:");
        out.flush();
        
        out.println("1 - Lý thuyết | 2 - Máy tính | 3 - Thí nghiệm");
        out.flush();
        
        out.print("Chọn: ");
        out.flush();
        
        int loaiPhongHoc = keyboard.nextInt();
        keyboard.nextLine(); // Xử lý dòng trống

        switch (loaiPhongHoc) {
            case 1:
                storage.deletePhongHocLyThuyet(maPhong);
                output.output(new PhongHocLyThuyet(maPhong, "", 0, 0, "", false));
                break;
            case 2:
                storage.deletePhongHocMayTinh(maPhong);
                output.output(new PhongHocMayTinh(maPhong, "", 0, 0, "", 0));
                break;
            case 3:
                storage.deletePhongHocThiNghiem(maPhong);
                output.output(new PhongHocThiNghiem(maPhong, "", 0, 0, "", "", 0, false));
                break;
            default:
                out.println("Lựa chọn không hợp lệ!");
                out.flush();
        }
    }
}
