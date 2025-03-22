public class DeletePHStorage {
	
	// Ô 2: Thuộc tính
	// (Không có thuộc tính trong lớp này)
	
	// Ô 3: Phương thức
	// Constructor mặc định
	DeletePHStorage() {
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
	
	// Xóa phòng học lý thuyết khỏi bộ nhớ dựa trên mã phòng
	PhongHocLyThuyet deletePhongHocLyThuyet(String maPhong) {
		 return MemoryPHDb.removePhongHocLyThuyet(maPhong);
	}
	
	// Xóa phòng học máy tính khỏi bộ nhớ dựa trên mã phòng
	PhongHocMayTinh deletePhongHocMayTinh(String maPhong) {
		return MemoryPHDb.removePhongHocMayTinh(maPhong);
	}
	
	// Xóa phòng học thí nghiệm khỏi bộ nhớ dựa trên mã phòng
	PhongHocThiNghiem deletePhongHocThiNghiem(String maPhong) {
		return MemoryPHDb.removePhongHocThiNghiem(maPhong);
	}
	
}
