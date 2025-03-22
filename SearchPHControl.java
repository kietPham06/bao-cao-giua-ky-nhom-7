import java.io.PrintWriter;
import java.util.Scanner;

public class SearchPHControl {

	// Ô 2: Thuộc tính (Các thành phần hỗ trợ tìm kiếm)
	Scanner keyboard;
	PrintWriter out;
	SearchPHStorage storage;
	SearchPHOutput output;
	
	// Ô 3: Phương thức (Khởi tạo và tìm kiếm phòng học)
	
	// Constructor mặc định (Sử dụng input từ bàn phím và xuất ra màn hình)
	SearchPHControl() {
		keyboard = new Scanner(System.in);
		out = new PrintWriter(System.out);
		storage = new SearchPHStorage();
		output = new SearchPHOutput();
	}
	
	// Constructor cho phép sử dụng Scanner và PrintWriter bên ngoài
	SearchPHControl(Scanner keyboard, PrintWriter out) {
		this.keyboard = keyboard;
		this.out = out;
	}
	
	// Constructor thêm đối tượng lưu trữ dữ liệu phòng học
	SearchPHControl(Scanner keyboard, PrintWriter out, SearchPHStorage storage) {
		this(keyboard, out);
		this.storage = storage;
	}
	
	// Constructor đầy đủ với cả đầu ra kết quả tìm kiếm
	SearchPHControl(Scanner keyboard, PrintWriter out, SearchPHStorage storage, SearchPHOutput output) {
		this(keyboard, out, storage);
		this.output = output;
	}
	
	// Phương thức tìm kiếm phòng học theo mã phòng và loại phòng
	void search() {
		out.println("===============================================");
		out.flush();
	    out.print("Nhập mã phòng cần tìm: ");
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
	            PhongHocLyThuyet phongHocLyThuyet = storage.selectPhongHocLyThuyet(maPhong);
	            if (phongHocLyThuyet != null) {
	                output.output(phongHocLyThuyet);
	            } else {
	                out.println("Không tìm thấy phòng lý thuyết có mã: " + maPhong);
	                out.flush();
	        		out.println("===============================================");
	        		out.flush();
	            }
	            break;
	        case 2:
	            PhongHocMayTinh phongHocMayTinh = storage.selectPhongHocMayTinh(maPhong);
	            if (phongHocMayTinh != null) {
	                output.output(phongHocMayTinh);
	            } else {
	                out.println("Không tìm thấy phòng máy tính có mã: " + maPhong);
	                out.flush();
	        		out.println("===============================================");
	        		out.flush();
	            }
	            break;
	        case 3:
	            PhongHocThiNghiem phongHocThiNghiem = storage.selectPhongHocThiNghiem(maPhong);
	            if (phongHocThiNghiem != null) {
	                output.output(phongHocThiNghiem);
	            } else {
	                out.println("Không tìm thấy phòng thí nghiệm có mã: " + maPhong);
	                out.flush();
	        		out.println("===============================================");
	        		out.flush();
	            }
	            break;
	        default:
	            out.println("Lựa chọn không hợp lệ!");
	            out.flush();
	    }
	}
}
