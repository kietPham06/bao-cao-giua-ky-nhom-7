
public class PhongHocStorage {
	
	// Ô 2
	
	
	// Ô 3
	PhongHocStorage() {
		
	}
	
	void insertPhongHocLyThuyet(PhongHocLyThuyet phongHoc) {
		MemoryPhongHocDatabase.addPhongHocLyThuyet(phongHoc);
	}
	
	void insertPhongHocLyMayTinh(PhongHocMayTinh phongHoc) {
		MemoryPhongHocDatabase.addPhongHocMayTinh(phongHoc);
	}
	
	void insertPhongHocLyThiNghiem(PhongHocThiNghiem phongHoc) {
		MemoryPhongHocDatabase.addPhongHocThiNghiem(phongHoc);
	}
}
