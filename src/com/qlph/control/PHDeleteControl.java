package com.qlph.control;

import com.qlph.database.PHDeleteDAO;
import com.qlph.ui.PHDeleteInput;
import com.qlph.ui.PHDeleteOutput;

public class PHDeleteControl {
		
	// Ô 2 - Fields
	private PHDeleteDAO phDeleteDAO;
	private PHDeleteInput phDeleteInput;
	private PHDeleteOutput phDeleteOutput;
	
	// Ô 3 - Methods
	// Default Constructor
	public PHDeleteControl() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor
	public PHDeleteControl(PHDeleteDAO phDeleteDAO, PHDeleteInput phDeleteInput, PHDeleteOutput phDeleteOutput) {
		super();
		this.phDeleteDAO = phDeleteDAO;
		this.phDeleteInput = phDeleteInput;
		this.phDeleteOutput = phDeleteOutput;
	}
	
	public void delete() {
		String maPhong;
		String loaiPhong;
		boolean isThanhCong;
		
		// Phối hợp với các đối tượng
		// 1. Gửi thông điệp đến object PHRemoveInput
		// Để người dùng nhập thông tin phòng cần xóa
		maPhong = phDeleteInput.inputMaPhong();
		loaiPhong = phDeleteInput.inputLoaiPhong();
		
		// 2. Gửi thông điệp đến object PHRemoveDAO
		// Xóa phòng học trong CSDL
		isThanhCong = phDeleteDAO.delete(maPhong, loaiPhong);
		
		// 3. Gửi thông điệp đến object PHRemoveOuput
		// Hiển thị thông báo xóa phòng học thành công hoặc thất bại
		phDeleteOutput.showMessage(isThanhCong);
	}
	
	
}
