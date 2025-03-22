public class SearchPHStorage {
	
	// Ô 2: Thuộc tính (Không có thuộc tính trong lớp này)
	
	
	// Ô 3: Phương thức (Tìm kiếm phòng học theo loại)
	
	// Tìm phòng học lý thuyết theo mã phòng
	PhongHocLyThuyet selectPhongHocLyThuyet(String maPhong) {
		return MemoryPHDB.searchPhongHocLyThuyet(maPhong);
	}
	
	// Tìm phòng học máy tính theo mã phòng
	PhongHocMayTinh selectPhongHocMayTinh(String maPhong) {
		return MemoryPHDB.searchPhongHocMayTinh(maPhong);
	}
	
	// Tìm phòng học thí nghiệm theo mã phòng
	PhongHocThiNghiem selectPhongHocThiNghiem(String maPhong) {
		return MemoryPHDB.searchPhongHocThiNghiem(maPhong);
	}
}
