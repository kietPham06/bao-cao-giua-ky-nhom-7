import java.io.PrintWriter;
import java.util.Scanner;

public class PhongHocMenu {

	// Ô 1: Tên lớp: PhongHocMenu
	// Ô 2: Thuộc tính
	// Khai báo biến tham chiếu
	PrintWriter out; // Đối tượng PrintWriter để xuất kết quả ra màn hình
	Scanner keyboard; // Đối tượng Scanner để nhận input từ bàn phím
	String prompt; // Biến để lưu prompt hiển thị cho người dùng nhập lệnh

	// Chức năng
	PhongHocInput phongHocInput; // Chức năng nhập thông tin phòng học
	RemovePhongHoc removePhongHoc; // Chức năng xóa phòng học
	SearchPhongHoc searchPhongHoc; // Chức năng tìm kiếm phòng học
	DanhSachPhongHocControl danhSachPhongHocControl; // Quản lý danh sách phòng học
	PKDCControl pKDCControl; // Quản lý các phòng không đạt chuẩn
	DTTBPhongHocLyThuyet dTTBPhongHocLyThuyet; // Tính diện tích trung bình phòng lý thuyết
	SetPhongHoc setPhongHoc; // Chức năng sửa thông tin phòng học
	CountPhongHoc countPhongHoc; // Thống kê số lượng phòng theo loại

	// Ô 3: Phương thức
	// Constructor mặc định
	PhongHocMenu() {
		// Khởi tạo đối tượng và liên kết biến tham chiếu đến với đối tượng
		out = new PrintWriter(System.out);
		keyboard = new Scanner(System.in);
		prompt = ">";
		// Khởi tạo các chức năng
		phongHocInput = new PhongHocInput();
		removePhongHoc = new RemovePhongHoc();
		searchPhongHoc = new SearchPhongHoc();
		danhSachPhongHocControl = new DanhSachPhongHocControl();
		dTTBPhongHocLyThuyet = new DTTBPhongHocLyThuyet();
		setPhongHoc = new SetPhongHoc();
		countPhongHoc = new CountPhongHoc();
	}

	// Constructor với tham số
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt) {
		this.out = out;
		this.keyboard = keyboard;
		this.prompt = prompt;
	}

	// Constructor với tham số thêm chức năng nhập phòng học
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput) {
		this(out, keyboard, prompt);
		this.phongHocInput = phongHocInput;
	}

	// Constructor với tham số thêm chức năng xóa phòng học
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc) {
		this(out, keyboard, prompt, phongHocInput);
		this.removePhongHoc = removePhongHoc;
	}

	// Constructor với tham số thêm chức năng quản lý danh sách phòng học
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl) {
		this(out, keyboard, prompt, phongHocInput, removePhongHoc);
		this.danhSachPhongHocControl = danhSachPhongHocControl;
	}

	// Constructor với tham số thêm chức năng tìm kiếm phòng học
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc) {
		this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl);
		this.searchPhongHoc = searchPhongHoc;
	}

	// Constructor với tham số thêm chức năng quản lý phòng không đạt chuẩn
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc, PKDCControl pKDCControl) {
		this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl, searchPhongHoc);
		this.pKDCControl = pKDCControl;
	}

	// Constructor với tham số thêm chức năng tính diện tích trung bình phòng lý thuyết
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc, PKDCControl pKDCControl, DTTBPhongHocLyThuyet dTTBPhongHocLyThuyet) {
		this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl, searchPhongHoc, pKDCControl);
		this.dTTBPhongHocLyThuyet = dTTBPhongHocLyThuyet;
	}

	// Constructor với tham số thêm chức năng sửa thông tin phòng học
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc, PKDCControl pKDCControl, DTTBPhongHocLyThuyet dTTBPhongHocLyThuyet, SetPhongHoc setPhongHoc) {
		this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl, searchPhongHoc, pKDCControl, dTTBPhongHocLyThuyet);
		this.setPhongHoc = setPhongHoc;
	}

	// Constructor với tham số thêm chức năng thống kê số lượng phòng
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc, PKDCControl pKDCControl, DTTBPhongHocLyThuyet dTTBPhongHocLyThuyet, SetPhongHoc setPhongHoc, CountPhongHoc countPhongHoc) {
		this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl, searchPhongHoc, pKDCControl, dTTBPhongHocLyThuyet, setPhongHoc);
		this.countPhongHoc = countPhongHoc;
	}

	// Phương thức điều khiển vòng lặp nhập lệnh
	void controlLoop() {
		out.println("Gõ lệnh \"help\" để được hỗ trợ");
		out.flush();

		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = keyboard.nextLine();//<== HELP, ABOUT, ADD, EDIT,...
			command = command.trim(); // Cắt khoảng trắng 2 đầu

			// Các lệnh xử lý
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}

			if("about".equalsIgnoreCase(command)) {
				out.println("============================================");
				out.flush();
				out.println("|          ABOUT THIS SOFTWARE             |");
				out.flush();
				out.println("============================================");
				out.flush();
				out.println("| Tên phần mềm : Quản lý phòng học         |");
				out.flush();
				out.println("| Phiên bản    : 1.0                        |");
				out.flush();
				out.println("| Tác giả      : Nhóm 7 - Khóa 18 - Lớp 2   |");
				out.flush();
				out.println("| Mô tả        :                           |");
				out.flush();
				out.println("| - Phần mềm giúp quản lý thông tin phòng  |");
				out.flush();
				out.println("| - Hỗ trợ thêm, sửa, xóa và tìm kiếm phòng|");
				out.flush();
				out.println("| - Xuất danh sách phòng không đạt chuẩn   |");
				out.flush();
				out.println("| - Thống kê số lượng và diện tích phòng   |");
				out.flush();
				out.println("============================================");
				out.flush();
				continue;
			}

			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}

			if("edit".equalsIgnoreCase(command)) {
				set();
				continue;
			}

			if("delete".equalsIgnoreCase(command)) {
				delete();
				continue;
			}

			if("find".equalsIgnoreCase(command)) {
				search();
				continue;
			}

			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}

			if("export".equalsIgnoreCase(command)) {
				export();
				continue;
			}

			if("count".equalsIgnoreCase(command)) {
				count();
				continue;
			}

			if("avg".equalsIgnoreCase(command)) {
				average();
				continue;
			}

			if("exit".equalsIgnoreCase(command)) {
				break;
			}

		}
	}

	// Phương thức hiển thị trợ giúp
	void help() {

		out.println("============================================");
		out.flush();
		out.println("|           USER HELP MENU                 |");
		out.flush();
		out.println("============================================");
		out.flush();
		out.println("| [HELP]   Hướng dẫn sử dụng               |");
		out.flush();
		out.println("| [ABOUT]  Thông tin về phần mềm           |");
		out.flush();
		out.println("| [ADD]    Thêm phòng                      |");
		out.flush();
		out.println("| [EDIT]   Sửa thông tin phòng             |");
		out.flush();
		out.println("| [DELETE] Xóa phòng                       |");
		out.flush();
		out.println("| [FIND]   Tìm kiếm phòng                  |");
		out.flush();
		out.println("| [PRINT]  In danh sách tất cả các phòng   |");
		out.flush();
		out.println("| [EXPORT] Xuất danh sách phòng không đạt  |");
		out.flush();
		out.println("| [COUNT]  Tổng số lượng phòng theo loại   |");
		out.flush();
		out.println("| [AVG]    Trung bình diện tích phòng LT   |");
		out.flush();
		out.println("| [EXIT]   Thoát chương trình              |");
		out.flush();
		out.println("============================================");
		out.flush();

	}

	// Các phương thức chức năng
	void add() {
		phongHocInput.input();
	}

	void set() {
		setPhongHoc.setPhongHoc();
	}

	void delete() {
		removePhongHoc.removePhongHoc();
	}

	void search() {
		searchPhongHoc.searchPhongHoc();
	}

	void print() {
		danhSachPhongHocControl.printDanhSachPhongHoc();
	}

	void export() {
		pKDCControl.printDanhSachPKDC();
	}

	void count() {
		countPhongHoc.countPhongHoc();
	}

	void average() {
		dTTBPhongHocLyThuyet.tinhDTTBPhongHocLyThuyet();
	}

}
