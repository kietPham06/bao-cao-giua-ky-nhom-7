package com.qlph.ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class PHMenu {
	
	// Ô 2 - Fields
	private Scanner keyboard;
	private PrintWriter out;
	private String prompt;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHMenu() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHMenu(Scanner keyboard, PrintWriter out, String prompt) {
		super();
		this.keyboard = keyboard;
		this.out = out;
		this.prompt = prompt;
	}
	
	public void controlLoop() {
		out.println("Gõ lệnh \"help\" để được hỗ trợ!");
		out.flush();
		
		while(true) {
			String command = " ";
			out.print(prompt);
			out.flush();
			command = keyboard.nextLine();// <== HELP , ABOUT, ADD, EDIT, DELETE,...
			command = command.trim();// Cắt khoảng trắng 2 đầu
			
			if("help".equalsIgnoreCase(command)) {
				 help();
				continue;
			}
			
			if("about".equalsIgnoreCase(command)) {
				about();
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
			
			if("count".equalsIgnoreCase(command)) {
				count();
				continue;
			}
			
			if("filter".equalsIgnoreCase(command)) {
				filter();
				continue;
			}
			
			if("average".equalsIgnoreCase(command)) {
				average();
				continue;
			}
			
			if("exit".equalsIgnoreCase(command)) {
				break;
			}
		}
	}
	
	private void help() {

		out.println("===============================================");
		out.flush();
		out.println("|               USER HELP MENU                |");
		out.flush();
		out.println("===============================================");
		out.flush();
		out.println("| [HELP]    | Hướng dẫn sử dụng                |");
		out.flush();
		out.println("| [ABOUT]   | Thông tin về phần mềm            |");
		out.flush();
		out.println("| [ADD]     | Thêm sinh viên                   |");
		out.flush();
		out.println("| [UPDATE]  | Cập nhật thông tin phòng học     |");
		out.flush();
		out.println("| [DELETE]  | Xóa phòng học                    |");
		out.flush();
		out.println("| [SEARCH]  | Tìm kiếm phòng học               |");
		out.flush();
		out.println("| [PRINT]   | In ra danh sách tất cả phòng     |");
		out.flush();
		out.println("| [COUNT]   | Tổng số lượng phòng học từng loại|");
		out.flush();
		out.println("| [FILTER]  | Xuất ra các phòng không đạt chuẩn|");
		out.flush();
		out.println("| [AVERAGE] | Diện tích trung bình phòng lý thuyết |");
		out.flush();
		out.println("| [EXIT]    | Thoát chương trình               |");
		out.flush();
		out.println("===============================================");
		out.flush();
		
	}
	
	private void about() {
		// TODO Auto-generated method stub
		out.println("===============================================");
		out.flush();
		out.println("|          ABOUT THIS SOFTWARE                |");
		out.flush();
		out.println("===============================================");
		out.flush();
		out.println("| Tên phần mềm | Quản lý phòng học            |");
		out.flush();
		out.println("| Phiên bản    | 1.0                          |");
		out.flush();
		out.println("| Tác giả      | Nhóm 7 - Khóa 18 - Lớp 2     |");
		out.flush();
		out.println("| Mô tả        |                              |");
		out.flush();
		out.println("|    - Phần mềm quản lý phòng                 |");
		out.flush();
		out.println("|    - Hỗ trợ thêm, sửa, xóa, tìm            |");
		out.flush();
		out.println("|    - Xuất danh sách phòng lỗi              |");
		out.flush();
		out.println("|    - Thống kê số lượng, diện tích          |");
		out.flush();
		out.println("===============================================");
		out.flush();
	}

	private void add() {
		// TODO Auto-generated method stub
		
	}

	private void update() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	private void search() {
		// TODO Auto-generated method stub
		
	}

	private void print() {
		// TODO Auto-generated method stub
		
	}

	private void count() {
		// TODO Auto-generated method stub
		
	}

	private void filter() {
		// TODO Auto-generated method stub
		
	}

	private void average() {
		// TODO Auto-generated method stub
		
	}




	
	
	
}
