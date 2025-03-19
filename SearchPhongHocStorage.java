
public class SearchPhongHocStorage {
	
	// Ô 2
	
	
	// Ô 3
	PhongHocLyThuyet selectPhongHocLyThuyet(String maPhong) {
		return MemoryPhongHocDatabase.searchPhongHocLyThuyet(maPhong);
	}
	
	PhongHocMayTinh selectPhongHocMayTinh(String maPhong) {
		return MemoryPhongHocDatabase.searchPhongHocMayTinh(maPhong);
	}
	
	PhongHocThiNghiem selectPhongHocThiNghiem(String maPhong) {
		return MemoryPhongHocDatabase.searchPhongHocThiNghiem(maPhong);
	}
}
