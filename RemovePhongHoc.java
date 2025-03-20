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
        	if ((kiemTraPhongHoc.selectPhongHocLyThuyet(maPhong) == null)) {
	            out.println("Không tìm thấy phòng học lý thuyết");
        	} else {
        		storage.deletePhongHocLyThuyet(maPhong);
	            output.output(new PhongHocLyThuyet(maPhong, "", 0.0, 0, "", false));
        	}
            break;
        case 2:
        	if ((kiemTraPhongHoc.selectPhongHocMayTinh(maPhong) == null)) {
	            out.println("Không tìm thấy phòng học máy tính");
        	} else {
        		storage.deletePhongHocMayTinh(maPhong);
                output.output(new PhongHocMayTinh(maPhong, "", 0.0, 0, "", 0));
        	}
            break;
        case 3:
        	if ((kiemTraPhongHoc.selectPhongHocThiNghiem(maPhong) == null)) {
	            out.println("Không tìm thấy phòng học thí nghiệm");
        	} else {
        		storage.deletePhongHocThiNghiem(maPhong);
                output.output(new PhongHocThiNghiem(maPhong, "", 0.0, 0, "", "", 0, false));
        	}
            break;
        default:
            System.out.println("Loại phòng không hợp lệ.");
    }
    }
}
