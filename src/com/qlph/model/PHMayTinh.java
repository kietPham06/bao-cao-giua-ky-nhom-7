package com.qlph.model;

import java.util.Date;

// Subclass
public class PHMayTinh extends PhongHoc {

	// Ô 2 - Fields
	private int soLuongMayTinh;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHMayTinh() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong, int soLuongMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong);
		this.soLuongMayTinh = soLuongMayTinh;
	}
	
	@Override
	public boolean isDatChuan() {
		// TODO Auto-generated method stub
		return (getDienTich() / 10) <= getSoBongDen() && (getDienTich() / 1.5) <= soLuongMayTinh;
	}

	// Getter and Setter
	public int getSoLuongMayTinh() {
		return soLuongMayTinh;
	}

	public void setSoLuongMayTinh(int soLuongMayTinh) {
		this.soLuongMayTinh = soLuongMayTinh;
	}
	
	@Override
	public String getLoaiPhong() {
		return "MT";
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nSố lượng máy tính: " + soLuongMayTinh +
				"\nLoại phòng: Máy tính";
	}
	
	
}
