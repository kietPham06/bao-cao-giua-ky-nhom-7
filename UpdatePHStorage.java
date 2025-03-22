public class UpdatePHStorage {
	
	// Ô 2: Thuộc tính (Không có thuộc tính trong lớp này)
	
	// Ô 3: Phương thức (Cập nhật thông tin phòng học)
	
	// Constructor mặc định
	UpdatePHStorage() {
		
	}
	
	// Tìm phòng học lý thuyết theo mã phòng
	PhongHocLyThuyet selectPhongHocLyThuyet(String maPhong) {
		return MemoryPHDb.searchPhongHocLyThuyet(maPhong);
	}
	
	// Tìm phòng học máy tính theo mã phòng
	PhongHocMayTinh selectPhongHocMayTinh(String maPhong) {
		return MemoryPHDb.searchPhongHocMayTinh(maPhong);
	}
	
	// Tìm phòng học thí nghiệm theo mã phòng
	PhongHocThiNghiem selectPhongHocThiNghiem(String maPhong) {
		return MemoryPHDb.searchPhongHocThiNghiem(maPhong);
	}
	
	// Cập nhật phòng học lý thuyết theo mã phòng
	void updatePhongHocLyThuyet(String maPhong, PhongHocLyThuyet phongHocMoi) {
		MemoryPHDb.setPhongHocLyThuyet(maPhong, phongHocMoi);
	}
	
	// Cập nhật phòng học máy tính theo mã phòng
	void updatePhongHocMayTinh(String maPhong, PhongHocMayTinh phongHocMoi) {
		MemoryPHDb.setPhongHocMayTinh(maPhong, phongHocMoi);
	}
	
	// Cập nhật phòng học thí nghiệm theo mã phòng
	void updatePhongHocThiNghiem(String maPhong, PhongHocThiNghiem phongHocMoi) {
		MemoryPHDb.setPhongHocThiNghiem(maPhong, phongHocMoi);
	}
	
}
