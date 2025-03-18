
public class RemovePhongHocStorage {
	
	// Ô 2
	
	// Ô 3
	RemovePhongHocStorage() {
		
	}
	
	void deletePhongHocLyThuyet(String maPhong) {
		MemoryPhongHocDatabase.removePhongHocLyThuyet(maPhong);
	}
	
	void deletePhongHocMayTinh(String maPhong) {
		MemoryPhongHocDatabase.removePhongHocMayTinh(maPhong);
	}
	
	void deletePhongHocThiNghiem(String maPhong) {
		MemoryPhongHocDatabase.removePhongHocThiNghiem(maPhong);
	}
	
}
