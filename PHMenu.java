import java.io.PrintWriter;
import java.util.Scanner;

public class PHMenu {

	// Ô 2: Thuộc tính
	// Khai báo biến tham chiếu
	PrintWriter out; // Đối tượng PrintWriter để xuất kết quả ra màn hình
	Scanner keyboard; // Đối tượng Scanner để nhận input từ bàn phím
	String prompt; // Biến để lưu prompt hiển thị cho người dùng nhập lệnh

	// Chức năng
	PHInput pHInput; // Chức năng nhập thông tin phòng học
	DeletePHControl deletePHControl; // Chức năng xóa phòng học
	SearchPHControl searchPHControl; // Chức năng tìm kiếm phòng học
	PrintDSPHControl printDSPHControl; // Quản lý danh sách phòng học
	PKDCControl pKDCControl; // Quản lý các phòng không đạt chuẩn
	AVGAreaPHLTControl aVGAreaPHLTControl; // Tính diện tích trung bình phòng lý thuyết
	UpdatePHControl updatePHControl; // Chức năng sửa thông tin phòng học
	CountPHControl countPHControl; // Thống kê số lượng phòng theo loại

	// Ô 3: Phương thức
	// Constructor mặc định
	PHMenu() {
		// Khởi tạo đối tượng và liên kết biến tham chiếu đến với đối tượng
		out = new PrintWriter(System.out);
		keyboard = new Scanner(System.in);
		prompt = ">";
		// Khởi tạo các chức năng
		pHInput = new PHInput();
		deletePHControl = new DeletePHControl();
		searchPHControl = new SearchPHControl();
		printDSPHControl = new PrintDSPHControl();
		pKDCControl = new PKDCControl();
		aVGAreaPHLTControl = new AVGAreaPHLTControl();
		updatePHControl = new UpdatePHControl();
		countPHControl = new CountPHControl();
	}

	// Constructor với tham số
	PHMenu(PrintWriter out, Scanner keyboard, String prompt) {
		this.out = out;
		this.keyboard = keyboard;
		this.prompt = prompt;
	}

	// Constructor với tham số thêm chức năng nhập phòng học
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput) {
		this(out, keyboard, prompt);
		this.pHInput = pHInput;
	}

	// Constructor với tham số thêm chức năng xóa phòng học
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl) {
		this(out, keyboard, prompt, pHInput);
		this.deletePHControl = deletePHControl;
	}

	// Constructor với tham số thêm chức năng quản lý danh sách phòng học
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl, PrintDSPHControl printDSPHControl) {
		this(out, keyboard, prompt, pHInput, deletePHControl);
		this.printDSPHControl = printDSPHControl;
	}

	// Constructor với tham số thêm chức năng tìm kiếm phòng học
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl, PrintDSPHControl printDSPHControl, SearchPHControl searchPHControl) {
		this(out, keyboard, prompt, pHInput, deletePHControl, printDSPHControl);
		this.searchPHControl = searchPHControl;
	}

	// Constructor với tham số thêm chức năng quản lý phòng không đạt chuẩn
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl, PrintDSPHControl printDSPHControl, SearchPHControl searchPHControl, PKDCControl pKDCControl) {
		this(out, keyboard, prompt, pHInput, deletePHControl, printDSPHControl, searchPHControl);
		this.pKDCControl = pKDCControl;
	}

	// Constructor với tham số thêm chức năng tính diện tích trung bình phòng lý thuyết
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl, PrintDSPHControl printDSPHControl, SearchPHControl searchPHControl, PKDCControl pKDCControl, AVGAreaPHLTControl aVGAreaPHLTControl) {
		this(out, keyboard, prompt, pHInput, deletePHControl, printDSPHControl, searchPHControl, pKDCControl);
		this.aVGAreaPHLTControl = aVGAreaPHLTControl;
	}

	// Constructor với tham số thêm chức năng sửa thông tin phòng học
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl, PrintDSPHControl printDSPHControl, SearchPHControl searchPHControl, PKDCControl pKDCControl, AVGAreaPHLTControl aVGAreaPHLTControl, UpdatePHControl updatePHControl) {
		this(out, keyboard, prompt, pHInput, deletePHControl, printDSPHControl, searchPHControl, pKDCControl, aVGAreaPHLTControl);
		this.updatePHControl = updatePHControl;
	}

	// Constructor với tham số thêm chức năng thống kê số lượng phòng
	PHMenu(PrintWriter out, Scanner keyboard, String prompt, PHInput pHInput, DeletePHControl deletePHControl, PrintDSPHControl printDSPHControl, SearchPHControl searchPHControl, PKDCControl pKDCControl, AVGAreaPHLTControl aVGAreaPHLTControl, UpdatePHControl updatePHControl, CountPHControl countPHControl) {
		this(out, keyboard, prompt, pHInput, deletePHControl, printDSPHControl, searchPHControl, pKDCControl, aVGAreaPHLTControl, updatePHControl);
		this.countPHControl = countPHControl;
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

			if("update".equalsIgnoreCase(command)) {
				update();
				continue;
			}

			if("delete".equalsIgnoreCase(command)) {
				delete();
				continue;
			}

			if("search".equalsIgnoreCase(command)) {
				search();
				continue;
			}

			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}

			if("substandard".equalsIgnoreCase(command)) {
				substandard();
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

		out.println("===============================================");
		out.flush();
		out.println("|               USER HELP MENU               |");
		out.flush();
		out.println("===============================================");
		out.flush();
		out.println("| [HELP]        Hướng dẫn sử dụng            |");
		out.flush();
		out.println("| [ABOUT]       Thông tin về phần mềm        |");
		out.flush();
		out.println("| [ADD]         Thêm phòng                   |");
		out.flush();
		out.println("| [UPDATE]      Sửa thông tin phòng          |");
		out.flush();
		out.println("| [DELETE]      Xóa phòng                    |");
		out.flush();
		out.println("| [SEARCH]      Tìm kiếm phòng               |");
		out.flush();
		out.println("| [PRINT]       In danh sách tất cả các phòng|");
		out.flush();
		out.println("| [SUBSTANDARD] Xuất danh sách phòng không đạt|");
		out.flush();
		out.println("| [COUNT]       Tổng số lượng phòng theo loại|");
		out.flush();
		out.println("| [AVG]         Trung bình diện tích phòng LT|");
		out.flush();
		out.println("| [EXIT]        Thoát chương trình           |");
		out.flush();
		out.println("===============================================");
		out.flush();


	}

	// Các phương thức chức năng
	void add() {
		pHInput.input();
	}

	void update() {
		updatePHControl.update();
	}

	void delete() {
		deletePHControl.delete();
	}

	void search() {
		searchPHControl.search();
	}

	void print() {
		printDSPHControl.print();
	}

	void substandard() {
		pKDCControl.pkdc();
	}

	void count() {
		countPHControl.count();
	}

	void average() {
		aVGAreaPHLTControl.avgArea();
	}

}
