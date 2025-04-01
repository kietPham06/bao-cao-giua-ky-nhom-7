package com.qlph.model;

import java.util.Date;

// Superclass
public class PhongHoc {
	
	// Ô 2 - Fields
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;
	private Date ngayHoatDong;
	
	// Ô 3 - Methods
	// Default Constuctor
	protected PhongHoc() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	protected PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen, Date ngayHoatDong) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
		this.ngayHoatDong = ngayHoatDong;
	}
	
	// Kiểm tra phòng học đạt chuẩn
	public boolean isDatChuan() {
		return false;
	}
	
	// Getters and Setters
	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	public Date getNgayHoatDong() {
		return ngayHoatDong;
	}

	public void setNgayHoatDong(Date ngayHoatDong) {
		this.ngayHoatDong = ngayHoatDong;
	}
	
	
}
