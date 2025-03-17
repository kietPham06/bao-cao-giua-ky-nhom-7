import java.io.PrintWriter;
import java.util.Scanner;

import AppQuanLiThongTinChuyenXe.ChuyenXeInput;

public class PhongHocMenu {
	PrintWriter out;
	Scanner keyboard;
	String prompt;
	PhongHocInput phongHocInput;
	DanhPhongHocControl danhSachPhongHocControl;
	PKDCControl danhSachPhongKhongChuan;
	InsertPhongHoc add;
	DeletePhongHoc remove;
	UpdatePhongHoc set;
	SelectPhongHoc search;
	TinhTrungBinhDienTichPhongHocLyThuyet DTTBPhongLyThuyet;
	TongSoLuongTungLoaiPhong sl;
	
	PhongHocMenu() {
		out = new PrintWriter(System.out);
		keyboard = new Scanner(System.in);
		prompt = "->";
		phongHocInput = new PhongHocInput();
		danhSachPhongHocControl = new DanhPhongHocControl();
		danhSachPhongKhongChuan = new PKDCControl();
		add = new InsertPhongHoc();
		remove = new DeletePhongHoc();
		set = new UpdatePhongHoc();
		search = new SelectPhongHoc();
		DTTBPhongLyThuyet = new TinhTrungBinhDienTichPhongHocLyThuyet();
		sl = new TongSoLuongTungLoaiPhong();
	}
	
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt) {
		this.out = out;
		this.keyboard = keyboard;
		this.prompt = prompt;
	}
	
	PhongHocMenu(PrintWriter out, Scanner keyboard, String prompt, ChuyenXeInput chuyenXeInput) {
		//out = _out;
		//keyboard = _keyboard;
		//prompt = _prompt;
		this(out, keyboard, prompt);
		this.phongHocInput = phongHocInput;
	}
	
	void controlLoop() {
		out.println("Go lenh \"help\" de duoc ho tro");
		out.flush();
		
		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = keyboard.nextLine();//<== HELP, ABOUT, ADD, PRINT
			command = command.trim();//cắt khoảng trắng 2 đầu
			
			if("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			
			if("exit".equalsIgnoreCase(command)) {
				break;
			}
			
			if("add".equalsIgnoreCase(command)) {
				add();
				continue;
			}
			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}
			if("about".equalsIgnoreCase(command)) {
				out.println("Đây là phiên bản thử nghiệm của chương trình quản lí thông tin chuyến xe\n Được xây dựng: 11-03-2025");
				continue;
			}
		}
	}
	
	void print() {
		danhSachPhongHocControl.printDanhSachChuyenXe();;
	}

	void add() {
		chuyenXeInput.input();
	}
	
	void help() {
		out.println("~~~~~~User Help Menu~~~~~~");
		out.flush();
		
		out.println("[HELP] Huong dan su dung phan mem");
		out.flush();
		
		out.println("[ABOUT] Thong tin ve phan mem quan li chuyen xe");
		out.flush();
		
		out.println("[ADD] Them moi mot chuyen xe");
		out.flush();
		
		out.println("[PRINT] In tat ca chuyen xe");
		out.flush();
		
		out.println("[EXIT] Thoat khoi phan mem");
		out.flush();
		
		out.println("~~~~~~User Help Menu~~~~~~");
		out.flush();
		
	
	
}
