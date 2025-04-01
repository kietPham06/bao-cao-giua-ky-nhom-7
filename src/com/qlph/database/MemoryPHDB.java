package com.qlph.database;

import java.util.ArrayList;
import java.util.Date;

import com.qlph.model.PHLyThuyet;
import com.qlph.model.PHMayTinh;
import com.qlph.model.PHThiNghiem;
import com.qlph.model.PhongHoc;

// Đây là lớp giả lập cơ sở dữ liệu
public class MemoryPHDB {

	// Ô 2 - Fields
	private static ArrayList<PhongHoc> phDB;
	
	// Static Block Code
	static {
		phDB = new ArrayList<PhongHoc>();
	// Tạo object để test
		PhongHoc phongMayTinh = new PHMayTinh("MT001", "A1", 60.0, 6, new Date(), 30); // Không đạt
		PhongHoc phongLyThuyet = new PHLyThuyet("LT001", "B2", 50.0, 4, new Date(), true); // Không đạt
		PhongHoc phongThiNghiem = new PHThiNghiem("TN001", "C3", 80.0, 8, new Date(), "Hóa học", 30, false); // Không đạt
	}
	
	// Ô 3 - Methods
	// Chức năng
	
}
