package com.qlph.model;

import java.util.Date;

// Subclass
public class PHThiNghiem extends PhongHoc {

	// Ô 2 - Fields
	private String chuyenNganh;
	private int sucChua;
	private boolean isBonRua;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHThiNghiem() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public PHThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong, String chuyenNganh, int sucChua, boolean isBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen, ngayHoatDong);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.isBonRua = isBonRua;
	}
	
	@Override
	public boolean isDatChuan() {
		// TODO Auto-generated method stub
		return (getDienTich() / 10) <= getSoBongDen() && isBonRua == true;
	}
	
	// Getters and Setters
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isBonRua() {
		return isBonRua;
	}

	public void setBonRua(boolean isBonRua) {
		this.isBonRua = isBonRua;
	}
	
	@Override
	public String getLoaiPhong() {
		return "Thí Nghiệm";
	}

	// toString()
	@Override
	public String toString() {
		return super.toString() + "\nChuyên ngành: " + chuyenNganh +
				"\nSức chứa: " + sucChua +
				"\nBồn rửa: " + isBonRua +
				"\nLoại phòng: Thí nghiệm";
	}
	
	
}
