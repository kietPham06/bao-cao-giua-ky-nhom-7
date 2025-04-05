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
	
	// Static block code
	static {
		phDB = new ArrayList<PhongHoc>();
	// Tạo object để test
		phDB.add(new PHMayTinh("MT001", "A1", 60.0, 6, new Date(), 30));  // Đạt: đủ sáng, đủ diện tích/máy
		phDB.add(new PHMayTinh("MT002", "A2", 45.0, 3, new Date(), 40));  // Không đạt: thiếu sáng, thiếu diện tích/máy
		phDB.add(new PHLyThuyet("LT001", "B1", 50.0, 5, new Date(), true));  // Đạt: đủ sáng, có máy chiếu
		phDB.add(new PHLyThuyet("LT002", "B2", 40.0, 2, new Date(), false)); // Không đạt: thiếu sáng, không máy chiếu
		phDB.add(new PHThiNghiem("TN001", "C1", 80.0, 8, new Date(), "Hóa học", 30, true));  // Đạt: đủ sáng, có bồn rửa
		phDB.add(new PHThiNghiem("TN002", "C2", 70.0, 5, new Date(), "Sinh học", 25, false)); // Không đạt: thiếu sáng, không bồn rửa
	}
	
	// Ô 3 - Methods
	public static void insert(PhongHoc ph) {
		phDB.add(ph);
	}
	
	public static ArrayList<PhongHoc> getDSPH() {
		return phDB;
	}
	
	public static boolean remove(String maPhong, String loaiPhong) {
		for (PhongHoc ph: phDB) {
			if (ph.getMaPhong().equalsIgnoreCase(maPhong) && ph.getLoaiPhong().equalsIgnoreCase(loaiPhong)) {
				phDB.remove(ph);
				return true; // Trả về true để thông báo nếu xóa thành công
			}
		}
		return false;
	}
	
}
