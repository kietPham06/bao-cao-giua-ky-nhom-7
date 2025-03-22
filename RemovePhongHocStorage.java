public class RemovePhongHocStorage {
	
	// Ô 2: Thuộc tính
	// (Không có thuộc tính trong lớp này)
	
	// Ô 3: Phương thức
	// Constructor mặc định
	RemovePhongHocStorage() {
	}
	
	// Xóa phòng học lý thuyết khỏi bộ nhớ dựa trên mã phòng
	PhongHocLyThuyet deletePhongHocLyThuyet(String maPhong) {
		 return MemoryPhongHocDatabase.removePhongHocLyThuyet(maPhong);
	}
	
	// Xóa phòng học máy tính khỏi bộ nhớ dựa trên mã phòng
	PhongHocMayTinh deletePhongHocMayTinh(String maPhong) {
		return MemoryPhongHocDatabase.removePhongHocMayTinh(maPhong);
	}
	
	// Xóa phòng học thí nghiệm khỏi bộ nhớ dựa trên mã phòng
	PhongHocThiNghiem deletePhongHocThiNghiem(String maPhong) {
		return MemoryPhongHocDatabase.removePhongHocThiNghiem(maPhong);
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
