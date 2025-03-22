public class SetPhongHocStorage {
	
	// Ô 2: Thuộc tính (Không có thuộc tính trong lớp này)
	
	// Ô 3: Phương thức (Cập nhật thông tin phòng học)
	
	// Constructor mặc định
	SetPhongHocStorage() {
		
	}
	
	// Cập nhật phòng học lý thuyết theo mã phòng
	void setPhongHocLyThuyet(String maPhong, PhongHocLyThuyet phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocLyThuyet(maPhong, phongHocMoi);
	}
	
	// Cập nhật phòng học máy tính theo mã phòng
	void setPhongHocMayTinh(String maPhong, PhongHocMayTinh phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocMayTinh(maPhong, phongHocMoi);
	}
	
	// Cập nhật phòng học thí nghiệm theo mã phòng
	void setPhongHocThiNghiem(String maPhong, PhongHocThiNghiem phongHocMoi) {
		MemoryPhongHocDatabase.setPhongHocThiNghiem(maPhong, phongHocMoi);
	}
	
	// Tìm phòng học lý thuyết theo mã phòng
	PhongHocLyThuyet selectPhongHocLyThuyet(String maPhong) {
		return MemoryPhongHocDatabase.searchPhongHocLyThuyet(maPhong);
	}
	
	// Tìm phòng học máy tính theo mã phòng
	PhongHocMayTinh selectPhongHocMayTinh(String maPhong) {
		return MemoryPhongHocDatabase.searchPhongHocMayTinh(maPhong);
	}
	
	// Tìm phòng học thí nghiệm theo mã phòng
	PhongHocThiNghiem selectPhongHocThiNghiem(String maPhong) {
		return MemoryPhongHocDatabase.searchPhongHocThiNghiem(maPhong);
	}
}
