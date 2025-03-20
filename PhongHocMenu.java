
import java.io.PrintWriter;
import java.util.Scanner;

public class PhongHocMenu {

	//Ô 2
	// Khai báo biến tham chiếu
	PrintWriter out;
	Scanner keyboard;
	String prompt;
	// Chức năng
	PhongHocInput phongHocInput;
	RemovePhongHoc removePhongHoc;
	SearchPhongHoc searchPhongHoc;
	DanhSachPhongHocControl danhSachPhongHocControl;
	PKDCControl pKDCControl;
	DTTBPhongHocLyThuyet dTTBPhongHocLyThuyet;
	
	
	//Ô 3
	PhongHocMenu() {
		// Khởi tạo đối tượng và liên kết biến tham chiếu đến với đối tượng
		out = new PrintWriter(System.out);
		keyboard = new Scanner(System.in);
		prompt = ">";
		// Chức năng
		phongHocInput = new PhongHocInput();
		removePhongHoc = new RemovePhongHoc();
		searchPhongHoc = new SearchPhongHoc();
		danhSachPhongHocControl = new DanhSachPhongHocControl();
		dTTBPhongHocLyThuyet = new DTTBPhongHocLyThuyet();
		
	}
	
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt) {
		this.out = out;
		this.keyboard = keyboard;
		this.prompt = prompt;
	}
	
	 PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput) {
		this(out, keyboard, prompt);
		this.phongHocInput = phongHocInput;
	}
	 
	 PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc) {
			this(out, keyboard, prompt, phongHocInput);
			this.removePhongHoc = removePhongHoc;
		}
	 
	 PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl) {
			this(out, keyboard, prompt, phongHocInput, removePhongHoc);
			this.danhSachPhongHocControl = danhSachPhongHocControl;
		}
	 
	 PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc) {
			this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl);
			this.searchPhongHoc = searchPhongHoc;
		}
	 
	 PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc, PKDCControl pKDCControl) {
			this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl, searchPhongHoc);
			this.pKDCControl = pKDCControl;
		}
	 
	 PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, PhongHocInput phongHocInput, RemovePhongHoc removePhongHoc, DanhSachPhongHocControl danhSachPhongHocControl, SearchPhongHoc searchPhongHoc, PKDCControl pKDCControl, DTTBPhongHocLyThuyet dTTBPhongHocLyThuyet) {
			this(out, keyboard, prompt, phongHocInput, removePhongHoc, danhSachPhongHocControl, searchPhongHoc, pKDCControl);
			this.dTTBPhongHocLyThuyet = dTTBPhongHocLyThuyet;
		}

	
	void controlLoop() {
		out.println("Gõ lệnh \"help\" để được hỗ trợ");
		out.flush();
		
		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = keyboard.nextLine();//<== HELP, ABOUT, ADD, EDIT,...
			command = command.trim();// Cắt khoảng trắng 2 đầu
			
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
	
	void add() {
		phongHocInput.input();
	}

	void set() {
		
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
		pKDCControl.printPKDC();
	}
	
	void count() {
		
	}
	
	void average() {
		dTTBPhongHocLyThuyet.tinhDTTBPhongHocLyThuyet();
	}

}
