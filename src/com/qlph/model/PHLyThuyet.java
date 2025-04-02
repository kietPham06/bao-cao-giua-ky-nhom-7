package com.qlph.model;

import java.util.Date;

// Subclass
public class PHLyThuyet extends PhongHoc {
	
	// Ô 2 - Fields
	private boolean isMayChieu;
	
	// Ô 3 - Methods
	// Default Constuctor
	public PHLyThuyet() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong, boolean isMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong);
		this.isMayChieu = isMayChieu;
	}
	
	@Override
	public boolean isDatChuan() {
		// TODO Auto-generated method stub
		return (getDienTich() / 10) <= getSoBongDen() && isMayChieu == true;
	}

	// Getter and Setter
	public boolean isMayChieu() {
		return isMayChieu;
	}

	public void setMayChieu(boolean isMayChieu) {
		this.isMayChieu = isMayChieu;
	}
	
	@Override
	public String getLoaiPhong() {
		return "Lý thuyết";
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nMáy Chiếu: " + isMayChieu +
				"\nLoại phòng: Lý thuyết";
	}
	
	
}
