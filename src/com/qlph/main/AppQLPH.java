package com.qlph.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlph.ui.PHMenu;

public class AppQLPH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bước 1: Khai báo biến tham chiếu đối tượng
		Scanner keyboard;
		PrintWriter out;
		String prompt = ">";
		// Chức năng
		//... <== Thêm vào đây
		PHMenu menu;
		
		// Bước 2: Khởi tạo đối tượng trong vùng nhớ Heap
		// Bước 3: Trỏ biến tham chiếu đến với đối tượng nằm trong vùng nhớ Heap
		keyboard /* Bước 3 */ = /* Bước 2 */ new Scanner(System.in);
		out = new PrintWriter(System.out);
		// Chức năng
		//... <== Thêm vào đây
		menu = new PHMenu(keyboard, out, prompt);
		
		out.println("===============================================");
		out.flush();
		out.println("|        CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN        |");
		out.flush();
		out.println("===============================================");
		out.flush();
		
		// Gửi thông điệp đến object PHMenu
		menu.controlLoop();
	}

}
