package com.qlph.ui;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.qlph.model.PHLyThuyet;
import com.qlph.model.PHMayTinh;
import com.qlph.model.PHThiNghiem;
import com.qlph.model.PhongHoc;

public class PHAddInput {
	
	// Ô 2 - Fields
	private Scanner keyboard;
	private PrintWriter out;
	
	
	// Ô 3 - Methods
	// Default Constructor
	public PHAddInput() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public PHAddInput(Scanner keyboard, PrintWriter out) {
		super();
		this.keyboard = keyboard;
		this.out = out;
	}
	
	public PhongHoc inputPH() {
		String maPhong;
		String dayNha;
		double dienTich;
		int soBongDen;
		String ngayHoatDong;
		
		SimpleDateFormat formatter;
		Date ngayHoatDongJava = null;
		
		String loaiPhong;
		
		PhongHoc ph = null;
		
		out.print("Mã phòng: ");
		out.flush();
		maPhong = keyboard.nextLine();
	
		out.print("Dãy nhà: ");
		out.flush();
		dayNha = keyboard.nextLine();
		
		out.print("Diện tích: ");
		out.flush();
		dienTich = keyboard.nextDouble();
		
		out.print("Số bóng đèn: ");
		out.flush();
		soBongDen = keyboard.nextInt();
		keyboard.nextLine();
		
		out.print("Ngày hoạt động (dd/MM/yyyy): ");
		out.flush();
		ngayHoatDong = keyboard.nextLine();
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngayHoatDongJava = formatter.parse(ngayHoatDong);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.print("Loại phòng (LT - MT - TN): ");
		out.flush();
		loaiPhong = keyboard.nextLine();
		if ("LT".equalsIgnoreCase(loaiPhong)) {
			ph = inputPHLT(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava);
		}
		if ("MT".equalsIgnoreCase(loaiPhong)) {
			ph = inputPHMT(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava);
		}
		if ("TN".equalsIgnoreCase(loaiPhong)) {
			ph = inputPHTN(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava);
		}	
		return ph;
	}
	
	private PhongHoc inputPHLT(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDongJava) {
		boolean hasMayChieu;
		PHLyThuyet phLT;
		
		out.print("Có máy chiếu (true/false): ");
		out.flush();
		hasMayChieu = keyboard.nextBoolean();
		
		phLT = new PHLyThuyet(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava, hasMayChieu);
		return phLT;
	}
	
	private PhongHoc inputPHMT(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDongJava) {
		int soLuongMayTinh;
		PHMayTinh phMT;
		
		out.print("Số lượng máy tính: ");
		out.flush();
		soLuongMayTinh = keyboard.nextInt();
		
		phMT = new PHMayTinh(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava, soLuongMayTinh);
		return phMT;
	}
	
	private PhongHoc inputPHTN(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDongJava) {
		String chuyenNganh;
		int sucChua;
		boolean hasBonRua;
		PHThiNghiem phTN;
		
		out.print("Chuyên ngành: ");
		out.flush();
		chuyenNganh = keyboard.nextLine();
		
		out.print("Sức chứa: ");
		out.flush();
		sucChua = keyboard.nextInt();
		
		out.print("Có bồn rửa (true/false): ");
		out.flush();
		hasBonRua = keyboard.nextBoolean();
		
		phTN = new PHThiNghiem(maPhong, dayNha, dienTich, soBongDen, ngayHoatDongJava, chuyenNganh, sucChua, hasBonRua);
		return phTN;
	}
	
	
}
