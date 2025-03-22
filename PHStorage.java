public class PHStorage {
	
	// Ô 2: Thuộc tính
	// (Không có thuộc tính trong lớp này)
	
	// Ô 3: Phương thức
	// Constructor mặc định
	PHStorage() {
	}
	
	// Thêm phòng học lý thuyết vào bộ nhớ
	void insertPhongHocLyThuyet(PhongHocLyThuyet phongHoc) {
		MemoryPHDb.addPhongHocLyThuyet(phongHoc);
	}
	
	// Thêm phòng học máy tính vào bộ nhớ
	void insertPhongHocLyMayTinh(PhongHocMayTinh phongHoc) {
		MemoryPHDb.addPhongHocMayTinh(phongHoc);
	}
	
	// Thêm phòng học thí nghiệm vào bộ nhớ
	void insertPhongHocLyThiNghiem(PhongHocThiNghiem phongHoc) {
		MemoryPHDb.addPhongHocThiNghiem(phongHoc);
	}
}
