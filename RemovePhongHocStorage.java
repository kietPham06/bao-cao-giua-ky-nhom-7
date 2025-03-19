
public class RemovePhongHocStorage {
	
	// Ô 2
	
	// Ô 3
	RemovePhongHocStorage() {
		
	}
	
	PhongHocLyThuyet deletePhongHocLyThuyet(String maPhong) {
		 return MemoryPhongHocDatabase.removePhongHocLyThuyet(maPhong);
	}
	
	PhongHocMayTinh deletePhongHocMayTinh(String maPhong) {
		return MemoryPhongHocDatabase.removePhongHocMayTinh(maPhong);
	}
	
	PhongHocThiNghiem deletePhongHocThiNghiem(String maPhong) {
		return MemoryPhongHocDatabase.removePhongHocThiNghiem(maPhong);
	}
	
}
